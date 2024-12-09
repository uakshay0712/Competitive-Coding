package CoreJava;

public class Movie {
	private String title;
	private String director;
	private int duration;
	
	
	public Movie(String title, String director, int duration) {
		super();
		this.title = title;
		this.director = director;
		this.duration = duration;
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


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	public String movieDetails() {
		System.out.println();
		return title+" "+director+" "+duration;
	}

	public static void main(String[] args) {
		Movie m= new Movie("Devara", "Yamini", 160);
		System.out.println(m.movieDetails());
		m.setTitle("Pushpa");
		m.setDirector("Sukumar");
		m.setDuration(120);
		System.out.println(m.movieDetails());

	}

}
