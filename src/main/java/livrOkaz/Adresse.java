package livrOkaz;

public class Adresse { // associé à 2 adr (donc 2 à tuples pour un customerId)
	private int adresseId;
	private int numVoie;
	private String nomVoie;
	private long codePostal;
	private String city;
	private String Country;


	public Adresse(int adresseId, int numVoie, String nomVoie, long codePostal, String city, String country) {
		super();
		this.adresseId = adresseId;
		this.numVoie = numVoie;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.city = city;
		Country = country;
	}


	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAdresseId() {
		return adresseId;
	}
	
	public void setAdresseId(int adresseId) {
		this.adresseId = adresseId;
	}
	
	public int getNumVoie() {
		return numVoie;
	}
	
	public void setNumVoie(int numVoie) {
		this.numVoie = numVoie;
	}
	
	public String getNomVoie() {
		return nomVoie;
	}
	
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}
	
	public long getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		Country = country;
	}

}
