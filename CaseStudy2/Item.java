package CaseStudy2;

public abstract class Item {

	private int item_id;
	private String Title;
	private int copies;
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id =item_id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [book_id=" + item_id + ", Title=" + Title + ", copies=" + copies + "]";
	}
	
	public void AddItem(int item_id,String Title,int copies) {
		setTitle(Title);
		setItem_id(item_id);
		setCopies(copies);
	}
	public void checkIn() {
		this.copies--;
		
	}
	public void checkOut() {
		this.copies++;
	}

}

	
	


