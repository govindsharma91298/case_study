package CaseStudy2;

public class Cd extends MediaItem{
	private
	String artist;
	String genre;
	
	
	
	
	public String getArtist() {
		return artist;
	}




	public void setArtist(String artist) {
		this.artist = artist;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void AddItem(int item_id,String Title,int copies,int runtime, String artist,String genre) {
		
		super.AddItem(item_id, Title, copies, runtime);
		setArtist(artist);
		setGenre(genre);
		
	}
	
	public void print() {
		super.print();
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
		
	}

	public void checkIn() {
		
		System.out.println("\nCD Titled "+super.getTitle()+" issued to you");
		super.checkIn();
		System.out.println("CD issued");
	}
	
	public void checkOut() {
		super.checkOut();
		
		System.out.println("You have submitted succesfully");
	}

}
