/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
import java.util.Calendar;

public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private String dateTimeStr;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  private static String owner="PLTW";
  public void addBook(Book b)
  {
    if (book == null) {
      book = b;
      numBooks++;
      dateTimeStr = getTime();
    } else {
      System.out.println("Book Full");
    }
  }
  public void addMovie(Movie m){
    if (movie == null) {
      movie = m;
      numMovies++;
      dateTimeStr = getTime();
    } else {
      System.out.println("Movie Full");
    }
  }
  public void addSong(Song s){
    if (song == null) {
      song = s;
      numSongs++;
      dateTimeStr = getTime();
    } else {
      System.out.println("Song Full");
    }
  }
  public String toString() 
  {
    String output="";
    if (book != null)
    {
      output += "Library contains: " + book.toString()+ "\n"  ;
    }
    if (movie != null)
    {
      output += "Library contains: " + movie.toString()+ "\n";
    }
    if (song != null) 
    {
      output += "Library contains: " + song.toString()+ "\n";
    }
    if (dateTimeStr != null) {
      output += "Last Modified: " + dateTimeStr;
    }
    return output;
  }
  public Book getBook()
{
  return book;
}
 public Movie getMovie()
{
  return movie;
  }
public Song getSong(){
  return song;
}
 public static String getOwner()
{
    return owner;
} 

 public static void changeOwner(String newOwner)
 {
     owner = newOwner;
 }

 public static String getTime(){
  Calendar cal = Calendar.getInstance();
  String dateTimeStr= cal.getTime().toString();
  return dateTimeStr;
 }
  public static int getnumBooks(){
    return numBooks;
  }
  public static int getnumMovies(){
    return numMovies;
  }
  public static int getnumSongs(){
    return numSongs;
  }
   public static int getnumEntries(){
    return numBooks + numMovies + numSongs;
  }
}