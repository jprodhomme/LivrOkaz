package livrOkaz;

public class R_Ordering_GoogeBooks {

	private String bookId_GoogleBooks;
	private int orderingId;
	private int ordering_books_id;
	private int bookId;
	private int quantity;
	private double TVA;
	private double TTC;

	
	public R_Ordering_GoogeBooks(String bookId_GoogleBooks, int orderingId, int ordering_books_id, int bookId,
			int quantity, double tVA, double tTC) {
		super();
		this.bookId_GoogleBooks = bookId_GoogleBooks;
		this.orderingId = orderingId;
		this.ordering_books_id = ordering_books_id;
		this.bookId = bookId;
		this.quantity = quantity;
		TVA = tVA;
		TTC = tTC;
	}
	
	
	public R_Ordering_GoogeBooks() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getBookId_GoogleBooks() {
		return bookId_GoogleBooks;
	}
	
	public void setBookId_GoogleBooks(String bookId_GoogleBooks) {
		this.bookId_GoogleBooks = bookId_GoogleBooks;
	}
	
	public int getOrderingId() {
		return orderingId;
	}
	
	public void setOrderingId(int orderingId) {
		this.orderingId = orderingId;
	}
	
	public int getOrdering_books_id() {
		return ordering_books_id;
	}
	
	public void setOrdering_books_id(int ordering_books_id) {
		this.ordering_books_id = ordering_books_id;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTVA() {
		return TVA;
	}
	
	public void setTVA(double tVA) {
		TVA = tVA;
	}
	
	public double getTTC() {
		return TTC;
	}
	
	public void setTTC(double tTC) {
		TTC = tTC;
	}


}
