import java.util.Iterator;
import java.util.TreeSet;

public class Database {
 
 public static Object db;
 TreeSet<Book> ts =new TreeSet<Book>();
		public Database() {
		
			Book b1 = new Book(4001,"Two_States","Chetan_Bhagat","Rupa_Pubs",169.03);
			Book b2 = new Book(4002,"I_Too_Had_a_Love_Story","Ravinder_Singh ","Srishti_Pubs",159.35);
			Book b3 = new Book(4003,"Just_Friends","Sumrit_Shahi","Mahaveer_Pubs",125.63);
			Book b4 = new Book(4004,"Till_The_Last_Breath","Durjoy_Datta","Penguin_Pubs",140.32);
			ts.add(b1);
			ts.add(b2);
			ts.add(b3);
			ts.add(b4);
		}
		
		public void viewAll() {
			// TODO Auto-generated method stub
			Iterator<Book> itr = ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		public Book viewByName(String name) {
			// TODO Auto-generated method stub
			for (Book b :ts) {
				if(b.title.equals(name)) {
					return b;
				}
			}
			return null;
		}
		
		public void delete(int bookid1) {
			// TODO Auto-generated method stub
			Iterator<Book> itr=ts.iterator();
			if(bookid1==itr.next().bookid) {
				itr.remove();
				System.out.println("Book Deleted!");
			}
			else
			{
				System.out.println("No book found!");
			}
		}
			
		public void update(int id, double pr) {
			// TODO Auto-generated method stub
			Iterator<Book> itr = ts.iterator();
			while(itr.hasNext()) {
				Book bTemp = itr.next();
				if(bTemp.bookid==id) {
					String title = bTemp.title;
					String author = bTemp.author;
					String publisher = bTemp.publisher;
					itr.remove();
					Book b = new Book(id,title,author,publisher,pr);
					ts.add(b);
					System.out.println("Details updated!");
				}
			}
		}
		public void insert(Book b1) {
			// TODO Auto-generated method stub
			ts.add(b1);
			System.out.println("Data Inserted!");
		}
			
		
	}

	
	

