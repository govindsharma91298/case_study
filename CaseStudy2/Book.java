package CaseStudy2;

public class Book extends WrittenItem {

	public void AddItem(int book_id,String Title,int copies,String author ) {
		super.AddItem(book_id,Title,copies,author);
		
	}
	public void checkIn() {
		System.out.println("\nbook titled " + super.getTitle()+" has been issued to you ");
		super.checkIn();
		System.out.println("Book issued");
	}
	public void checkOut() {
		super.checkOut();
		System.out.println("\nBook returned");
	}
	
}
		
		


