package CaseStudy2;

public  abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void AddItem(int item_id,String Title,int copies, String author) {
		
		super.AddItem(item_id, Title, copies);
		setAuthor(author);
	}
	public void checkIn() {
		super.checkIn();
		print();
	}
	public void checkOut() {
		super.checkOut();
		print();
	}
	
	public void print() {
		System.out.println("\nItem id: "+super.getItem_id()+"\n"+"Title : "+getTitle()+"\n"+"Author : "+getAuthor()+"\n"+"copies : "+getCopies());
		
	}
	
	
}

	 
	 



