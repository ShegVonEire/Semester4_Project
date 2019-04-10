package controllers;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

        /** Dependency Injection **/

    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    //private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Hello World!"));
    }

    public Result about() {
        return ok(about.render());
    }

    @Transactional
    public Result books(Long cat) {

        // Find the books (in the DB) and add to a Books arrayList
        // Calls the find.all() method of Books - from the Model superclass
        // https://www.playframework.com/documentation/2.6.x/JavaEbean#Using-Model-superclass
        List<Books> booksList = new ArrayList<Books>();
        List<Genre> genreList = Genre.find.query().where().orderBy("name asc").findList();

        if (cat == 0) {
            booksList = Books.find.all();
        }
        else {
            // Get books for selected category
            // Find category then extract books
            booksList = Genre.find.ref(cat).getBooks();
        }

        // Return the view, passing the Books list as a parameter
        return ok(books.render(booksList, genreList));
    }

	    @Transactional
    public Result feedback() {
        List<Feedback> feedbackList = new ArrayList<Feedback>();
        feedbackList = Feedback.findAll();

        return ok(feedback.render(feedbackList));
    }

	
	
	
    // Load the add Books view
    // Display an empty form in the view
    @Transactional
    public Result addBooks() {   
        // Instantiate a form object based on the Books class
        Form<Books> addBooksForm = formFactory.form(Books.class);
        // Render the Add Books View, passing the form object
        return ok(addBooks.render(addBooksForm));
    }

    @Transactional
    public Result addBooksSubmit() {

        Books p;
        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Books> newBooksForm = formFactory.form(Books.class).bindFromRequest();

        // Check for errors (based on Product class annotations)	
        if(newBooksForm.hasErrors()) {
            // Display the form again
            return badRequest(addBooks.render(newBooksForm));
        }
        
        // Save if new (no id) otherwise update product
        p = newBooksForm.get();

        if (p.getId() != null) {
            p.update();
        }
        else {
            p.save();
        }

        // Set a flash message
        flash("Success", "Book " + newBooksForm.get().getTitle() + " has been created or updated");
        
        // Redirect to the books libary page
        return redirect(controllers.routes.HomeController.books(0));
    }

        // Load the add product view
    // Display an empty form in the view
    @Transactional
    public Result updateBooks(Long id) {

        // Retrieve the book by id
        Books editBooks = Books.find.byId(id);
        
        if (editBooks == null){
            return badRequest("error");
        }
        
        // Create a form based on the Product class
        Form<Books> updateBooksForm = formFactory.form(Books.class).fill(editBooks);
        // Render the Add Books View, passing the form object
        return ok(addBooks.render(updateBooksForm));
    }

    // Delete Books
    @Transactional
    public Result deleteBooks(Long id) {
        // Call delete method
        Books.find.ref(id).delete();
        // Add message to flash session 
        flash("success", "Book has been deleted");
        // Redirect home
        return redirect(controllers.routes.HomeController.books(0));
    }
	
	public Result sendFeedback() {
        Form<Feedback> submitFeedbackForm = formFactory.form(Feedback.class);
        return ok(sendfeedback.render(submitFeedbackForm));
    }

    public Result sendFeedbackSubmit() {
        Feedback f;
        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Feedback> sendFeedbackForm = formFactory.form(Feedback.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(sendFeedbackForm.hasErrors()) {
            return badRequest(sendfeedback.render(sendFeedbackForm));
        }

        // Save if new (no id) otherwise update product
        f = sendFeedbackForm.get();

        if (f.getId() != null) {
            f.update();
        }
        else {
            f.save();
        }

        // Set a flash message
        flash("Success", "Your feedback has been sent! Thank you!");

        // Redirect to the books libary page
        return redirect(controllers.routes.HomeController.books(0));
    }
    
    public Result signup() {
        return ok(signup.render());
    }

    public Result contactus() {
        return ok(contactus.render());
    }

    public Result payment() {
        return ok(payment.render());
    }
}
