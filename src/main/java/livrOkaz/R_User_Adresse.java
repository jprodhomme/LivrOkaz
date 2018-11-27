package livrOkaz;

public class R_User_Adresse {

	private int adressId;
	private int userId;
	private int user_adress_id;
	
	
	public R_User_Adresse(int adressId, int userId, int user_adress_id) {
		super();
		this.adressId = adressId;
		this.userId = userId;
		this.user_adress_id = user_adress_id;
	}
	
	public R_User_Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAdressId() {
		return adressId;
	}
	
	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUser_adress_id() {
		return user_adress_id;
	}
	
	public void setUser_adress_id(int user_adress_id) {
		this.user_adress_id = user_adress_id;
	}


}


