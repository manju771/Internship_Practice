import java.util.*;
import java.util.ArrayList;

class movie implements Comparable<movie>
  {
    private String title;
    private String director;
    private int year;

    movie(String title,String director,int year){
      this.title=title;
      this.director=director;
      this.year=year;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	} 
  }
class MovieDemo{
  public static void main(String args[]){
    ArrayList<movie>movies=new ArrayList<movie>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      movies.add(new movie(sc.next(),sc.next(),sc.nextInt()));
    }
    Collections.sort(movies);
    for(movie m:movies){
      System.out.println(m.getTitle()+""+m.getDirector()+""+getYear());
    }
  }
}