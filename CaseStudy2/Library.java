package CaseStudy2;


	public class Library {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//creating objects
			Book b = new Book();
			JournalPaper j = new JournalPaper();
			Video v = new Video();
			Cd c = new Cd();
			
			//adding items and printing them
			b.AddItem(1, "ABCD", 5, "Dr.rahul");
			b.print();
			j.AddItem(2, "EFGH", 5, "Dr. Test", 2022);
			j.print();
			v.AddItem(3, "IJKL", 5, 40, "Test", "Rock", 2022);
			v.print();
			c.AddItem(4, "MNOP", 10, 50, "Test artist", "POP");
			c.print();
			
			
			
			//printing data after checkin
			b.checkIn();
			
			j.checkIn();
			
			v.checkIn();
			
			c.checkIn();
			
			
		
			
			
			
			
			
			
			//printing data after checkout
			
			b.checkOut();
			j.checkOut();
			v.checkOut();
			c.checkOut();
			
			
			
		}

	}

