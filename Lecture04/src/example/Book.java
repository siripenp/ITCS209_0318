package example;

//Author: Siripen

public class Book{
	private String title;
	private String ISBN;
	private String author;
	private int edition;
	private int pages;

	public Book (String t, String isbn, String a, int e, int p){
		title = t;
		ISBN = isbn;
		author = a;
		edition = e;
		pages = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void showDetail(){
		System.out.println("Title: " + title);
		System.out.println("ISBN: " + ISBN);
		System.out.println("Author(s): " + author);
		System.out.println("edition: " + edition);
		System.out.println("pages: " + pages);
	}

	public void setAuthor(String name){
		author = name;
		System.out.println("Author updated");
	}

	public int getPages(){
		return pages;
	}

	public static void main(String[] args) {
		Book book1 = new Book("Java Concepts", "1118423011", "Cay S. Horstmann", 7, 848);
		// System.out.println("Title: " + book1.title);
		Book book2 = new Book("Java for Dummies", "1119235553", "Barry Burd", 7, 504);
		// System.out.println("Title: " + book2.title);
		
		System.out.println("-----------");
		System.out.println(book1.getTitle());
		System.out.println(book2.getTitle());
		
		System.out.println("-----------");
		book2.setTitle("Python for Dummies");
		System.out.println("After setting a new title: " + book2.getTitle());
		
		System.out.println("-----------");
		book1.showDetail();
		
		System.out.println("-----------");
		book2.showDetail();
	}
}
