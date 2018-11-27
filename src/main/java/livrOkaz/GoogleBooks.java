package livrOkaz;

import java.sql.Date;

public class GoogleBooks {
	private String bookId;
	private String title;
	private int[] authorsId;
	private int publisherId;
	private Date publishReleased;
	private String codeISBN;
	private int pageCount;
	private String categorie; //en dur
	private String imgThumbnail;
	private String langage; //en dur
	private double price;
	private double discountPrice;
	private String textSnippet;
	private String description;
	private boolean isEbook;
	private int averageRating;
	private int gendleId; //en dur
	private int availableQuantity; //somme des 2 premiers caractères du bookId
	private int books_gendle_id;
	private int books_publisher_id;
	private int gendleId_R_GoogleBooks_Gendle;
	private int publisherId_R_GoogleBooks_Publisher;
	
	
	public GoogleBooks(String bookId, String title, int[] authorsId, int publisherId, Date publishReleased,
			String codeISBN, int pageCount, String categorie, String imgThumbnail, String langage, double price,
			double discountPrice, String textSnippet, String description, boolean isEbook, int averageRating,
			int gendleId, int availableQuantity, int books_gendle_id, int books_publisher_id,
			int gendleId_R_GoogleBooks_Gendle, int publisherId_R_GoogleBooks_Publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.authorsId = authorsId;
		this.publisherId = publisherId;
		this.publishReleased = publishReleased;
		this.codeISBN = codeISBN;
		this.pageCount = pageCount;
		this.categorie = categorie;
		this.imgThumbnail = imgThumbnail;
		this.langage = langage;
		this.price = price;
		this.discountPrice = discountPrice;
		this.textSnippet = textSnippet;
		this.description = description;
		this.isEbook = isEbook;
		this.averageRating = averageRating;
		this.gendleId = gendleId;
		this.availableQuantity = availableQuantity;
		this.books_gendle_id = books_gendle_id;
		this.books_publisher_id = books_publisher_id;
		this.gendleId_R_GoogleBooks_Gendle = gendleId_R_GoogleBooks_Gendle;
		this.publisherId_R_GoogleBooks_Publisher = publisherId_R_GoogleBooks_Publisher;
	}
	
	
	public GoogleBooks() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int[] getAuthorsId() {
		return authorsId;
	}
	
	public void setAuthorsId(int[] authorsId) {
		this.authorsId = authorsId;
	}
	
	public int getPublisherId() {
		return publisherId;
	}
	
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	
	public Date getPublishReleased() {
		return publishReleased;
	}
	
	public void setPublishReleased(Date publishReleased) {
		this.publishReleased = publishReleased;
	}
	
	public String getCodeISBN() {
		return codeISBN;
	}
	
	public void setCodeISBN(String codeISBN) {
		this.codeISBN = codeISBN;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getImgThumbnail() {
		return imgThumbnail;
	}
	
	public void setImgThumbnail(String imgThumbnail) {
		this.imgThumbnail = imgThumbnail;
	}
	
	public String getLangage() {
		return langage;
	}
	
	public void setLangage(String langage) {
		this.langage = langage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscountPrice() {
		return discountPrice;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public String getTextSnippet() {
		return textSnippet;
	}
	
	public void setTextSnippet(String textSnippet) {
		this.textSnippet = textSnippet;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isEbook() {
		return isEbook;
	}
	
	public void setEbook(boolean isEbook) {
		this.isEbook = isEbook;
	}
	
	public int getAverageRating() {
		return averageRating;
	}
	
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	
	public int getGendleId() {
		return gendleId;
	}
	
	public void setGendleId(int gendleId) {
		this.gendleId = gendleId;
	}
	
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	public int getBooks_gendle_id() {
		return books_gendle_id;
	}
	
	public void setBooks_gendle_id(int books_gendle_id) {
		this.books_gendle_id = books_gendle_id;
	}
	
	public int getBooks_publisher_id() {
		return books_publisher_id;
	}
	
	public void setBooks_publisher_id(int books_publisher_id) {
		this.books_publisher_id = books_publisher_id;
	}
	
	public int getGendleId_R_GoogleBooks_Gendle() {
		return gendleId_R_GoogleBooks_Gendle;
	}
	
	public void setGendleId_R_GoogleBooks_Gendle(int gendleId_R_GoogleBooks_Gendle) {
		this.gendleId_R_GoogleBooks_Gendle = gendleId_R_GoogleBooks_Gendle;
	}
	
	public int getPublisherId_R_GoogleBooks_Publisher() {
		return publisherId_R_GoogleBooks_Publisher;
	}
	
	public void setPublisherId_R_GoogleBooks_Publisher(int publisherId_R_GoogleBooks_Publisher) {
		this.publisherId_R_GoogleBooks_Publisher = publisherId_R_GoogleBooks_Publisher;
	}

}
