package CaseStudy2;

public class Video extends MediaItem {

	private
	String Director;
	String genre;
	int year;
	
	

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void  AddItem(int item_id,String Title,int copies,int runtime, String Director, String genre, int year) {
		super.AddItem(item_id, Title, copies, runtime);
		setDirector(Director);
		setGenre(genre);
		setYear(year);
	
	}
	
	public void print() {
	
		super.print();
		System.out.println("Director: "+Director);
		System.out.println("Genre: " + genre);
		System.out.println("Year published: "+year);
		
	}
	
	public void checkIn() {
		
		System.out.println("\n"+"Video Titled "+super.getTitle()+" is alloted to you"+"\n");
		super.checkIn();
		System.out.println("\nvideo issued");
	}
	public void checkOut() {
		super.checkOut();
		
		System.out.println("you have submitted successfully");
	}
	
}



