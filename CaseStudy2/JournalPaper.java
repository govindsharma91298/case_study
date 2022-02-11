package CaseStudy2;

public class JournalPaper extends WrittenItem {
	

	private
	int year;
	
	
	

	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}
	
	public void AddItem(int item_id,String Title,int copies, String author,int year) {
		
		super.AddItem(item_id, Title, copies, author);
		setYear(year);
		
		System.out.println();
	}
	
	public void print() {
		super.print();
		System.out.println("year :" + year);
		
	}
	public void checkIn() {
		System.out.println("\npaper titled " + super.getTitle()+" has been issued to you ");
		super.checkIn();
		System.out.println("Paper issued");
	}
	public void checkOut() {
		super.checkOut();
		System.out.println("\nyou have chekcked out sucessfully");
	}
}
		
