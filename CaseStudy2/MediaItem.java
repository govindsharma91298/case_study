package CaseStudy2;

public abstract  class MediaItem extends Item {
	
	private int runtime;
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public  void AddItem(int item_id,String Title,int copies,int runtime) {
		
		super.AddItem(item_id, Title, copies);
		setRuntime(runtime);
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
		System.out.println("\nItem_id: "+ super.getItem_id());
		System.out.println("Title: "+ super.getTitle());
		System.out.println("Copies: "+ super.getCopies());
		System.out.println("Runtime: "+ runtime+" minutes");
		
	}
	

}


