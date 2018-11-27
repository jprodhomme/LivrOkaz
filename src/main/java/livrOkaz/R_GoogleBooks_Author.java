package livrOkaz;

public class R_GoogleBooks_Author {

	private int authorId;
	private int bookId;
	private int books_author_id;
	
	
	public R_GoogleBooks_Author(int authorId, int bookId, int books_author_id) {
		super();
		this.authorId = authorId;
		this.bookId = bookId;
		this.books_author_id = books_author_id;
	}
	
	
	public R_GoogleBooks_Author() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBooks_author_id() {
		return books_author_id;
	}
	
	public void setBooks_author_id(int books_author_id) {
		this.books_author_id = books_author_id;
	}

}
