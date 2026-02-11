/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private Double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, Double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public Double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", time: " + duration;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(Double d) {
    duration = d;
  }
  public int adjustRating(int r){
    if (rating+r<=10 && rating+r>=0){
      rating += r;
    }
    return rating;
  } 

  public boolean equals(Movie b){
    if (this.getTitle().equals(b.getTitle()) && this.getDuration().equals(b.getDuration())){
      return true;
    }
    else{
      return false;}
  }
}
