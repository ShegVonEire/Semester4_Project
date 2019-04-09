package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// https://www.playframework.com/documentation/2.6.x/JavaEbean#Configuring-models
// https://www.playframework.com/documentation/2.6.0/api/java/play/data/validation/package-summary.html

@Entity
public class Genre extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String genre;

    @OneToMany
    private List<Books> books;


    // Constructors
    public Genre() {

    }

    public Genre(Long id, String name, List<Books> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    //Generic query helper for entity Product with id type Long
    public static Finder<Long,Genre> find = new Finder<>(Genre.class);

    // Accessor Methods
    public Long getId()	{
		return this.id;
	}

	  public void setId(Long id)	{
		this.id = id;
    }
    
    public String getName()	{
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
    }

    public List<Books> getBooks()	{
		return this.books;
	}

	public void setBooks(List<Books> books) {
	    this.books = books;
  }
  
  public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<>();

    // Get all categories from the DB and add to the options hash map
    for (Genre c: Genre.find.all()) {
      options.put(c.getId().toString(), c.getName());
    }
    return options;
  }

}