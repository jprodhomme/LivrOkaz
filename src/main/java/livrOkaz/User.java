package livrOkaz;

import java.sql.Date;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	private String tel;
	private String mail;
	private String civility;
	private int profilId;
	private Date dateBirhtday;
	private String password;
	private int user_profilAccess_id;
	private int profilAccessId;
	
	
	
	public User(int userId, String firstName, String lastName, String tel, String mail, String civility, int profilId,
			Date dateBirhtday, String password, int user_profilAccess_id, int profilAccessId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.mail = mail;
		this.civility = civility;
		this.profilId = profilId;
		this.dateBirhtday = dateBirhtday;
		this.password = password;
		this.user_profilAccess_id = user_profilAccess_id;
		this.profilAccessId = profilAccessId;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getCivility() {
		return civility;
	}
	
	public void setCivility(String civility) {
		this.civility = civility;
	}
	
	public int getProfilId() {
		return profilId;
	}
	
	public void setProfilId(int profilId) {
		this.profilId = profilId;
	}
	
	public Date getDateBirhtday() {
		return dateBirhtday;
	}
	
	public void setDateBirhtday(Date dateBirhtday) {
		this.dateBirhtday = dateBirhtday;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getUser_profilAccess_id() {
		return user_profilAccess_id;
	}
	
	public void setUser_profilAccess_id(int user_profilAccess_id) {
		this.user_profilAccess_id = user_profilAccess_id;
	}
	
	public int getProfilAccessId() {
		return profilAccessId;
	}
	
	public void setProfilAccessId(int profilAccessId) {
		this.profilAccessId = profilAccessId;
	}


}
