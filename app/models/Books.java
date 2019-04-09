package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// https://www.playframework.com/documentation/2.6.x/JavaEbean#Configuring-models
// https://www.playframework.com/documentation/2.6.0/api/java/play/data/validation/package-summary.html

@Entity
public class Books extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String title;

    @Constraints.Required
    private int ISBN13;

    // @Constraints.Required
    // private Date publishDate;
    
    @Constraints.Required
    private String publisher;

    @Constraints.Required
	@javax.persistence.Column(length=1024) // extends size
    private String description;

    @Constraints.Min(0)
    private int stock;

    @Constraints.Min(0)
    private double price;

    @Constraints.Min(0)
    private int pages;

    @ManyToOne
    private Genre genre;

    // Constructors
    public Books() {

    }

    public Books(Long id, String title, int ISBN13, String publisher, String description, int stock, double price, int pages, Genre genre) {
        this.id = id;
        this.title = title;
        this.ISBN13 = ISBN13;
        // this.publishDate = publishDate;
        this.publisher = publisher;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.pages = pages;
        this.genre = genre;
    }

    //Generic query helper for entity Product with id type Long
    public static Finder<Long,Books> find = new Finder<>(Books.class);

    // Accessor Methods
    public Long getId()	{
		return this.id;
	}

	  public void setId(Long id)	{
		this.id = id;
    }
    
    public String getTitle()	{
		return this.title;
	}

	  public void setTitle(String title) {
		this.title = title;
    }

    public int getISBN13()	{
      return this.ISBN13;
  }
  
    public void setISBN13(int ISBN13) {
      this.ISBN13 = ISBN13;
      }
    
  //   public Date getPublishDate()	{
  //     return this.publishDate;
  // }
  
  //   public void setPublishDate(Date publishDate) {
  //   this.publishDate = publishDate;
  //   }
    
    public String getPublisher()	{
      return this.publisher;
  }
  
    public void setPublisher(String publisher) {
    this.publisher = publisher;
    }

    public String getDescription()	{
      return this.description;
  }
    
    public void setDescription(String description) {
      this.description = description;
      }
    
    public int getStock() {
		return this.stock;
	}

	public void setStock(int stock)	{
		  this.stock = stock;
    }
    
    public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
	    this.price = price;
  }

    public int getPages() {
    return this.pages;
    }

  public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre()	{
    return this.genre;
    }

  public void setGenre(Genre genre) {
      this.genre = genre;
    }
  }