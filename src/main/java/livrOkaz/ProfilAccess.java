package livrOkaz;

public class ProfilAccess { 
	private int profilAccessId; 
	private int codeProfil; 
	private String libelleProfil;


	public ProfilAccess(int profilAccessId, int codeProfil, String libelleProfil) {
		super();
		this.profilAccessId = profilAccessId;
		this.codeProfil = codeProfil;
		this.libelleProfil = libelleProfil;
	}
	
	
	public ProfilAccess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProfilAccessId() {
		return profilAccessId;
	}
	
	public void setProfilAccessId(int profilAccessId) {
		this.profilAccessId = profilAccessId;
	}
	
	public int getCodeProfil() {
		return codeProfil;
	}
	
	public void setCodeProfil(int codeProfil) {
		this.codeProfil = codeProfil;
	}
	
	public String getLibelleProfil() {
		return libelleProfil;
	}
	
	public void setLibelleProfil(String libelleProfil) {
		this.libelleProfil = libelleProfil;
	}


}

