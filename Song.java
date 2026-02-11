/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private String artist;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, String a)
  {
    title = t;
    artist = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\" by " + artist;
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

  public void setArtist(String a) {
    artist = a;
  }

  public void setRating(int a) {
    rating = a;
  }
  public int adjustRating(int r){
    if (rating+r<=10 && rating+r>=0){
      rating += r;
    }
    return rating;
  } 

  public boolean equals(Song s){
    if (this.getTitle().equals(s.getTitle()) && this.artist.equals(s.getArtist()) && this.getRating() == s.getRating()){
      return true;
    }
    else{
      return false;}
  }
}
