package livrOkaz;

public class Author {
	private int authorId;
	private String fullName;


	public Author(int authorId, String fullName) {
		super();
		this.authorId = authorId;
		this.fullName = fullName;
	}


	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


}
