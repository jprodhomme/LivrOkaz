package livrOkaz;

public class Publisher {
	private int publisherId;
	private String namePublisher;


	public Publisher(int publisherId, String namePublisher) {
		super();
		this.publisherId = publisherId;
		this.namePublisher = namePublisher;
	}
	
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPublisherId() {
		return publisherId;
	}
	
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	
	public String getNamePublisher() {
		return namePublisher;
	}
	
	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}

}
