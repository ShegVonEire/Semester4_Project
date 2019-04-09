package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// https://www.playframework.com/documentation/2.6.x/JavaEbean#Configuring-models
// https://www.playframework.com/documentation/2.6.0/api/java/play/data/validation/package-summary.html

@Entity
public class Feedback extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String email;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String country;

    @Constraints.Required
    @javax.persistence.Column(length=1024) // extends size
    private String message;


    public Feedback(Long id, @Constraints.Required String email, @Constraints.Required String name, @Constraints.Required String country, @Constraints.Required String message) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.country = country;
        this.message = message;
    }

    public static final Finder<Long, Feedback> find = new Finder<>(Feedback.class);

    public static final List<Feedback> findAll() { // gets all objects
        return Feedback.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}