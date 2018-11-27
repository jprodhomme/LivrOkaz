package livrOkaz;

public class Gendle {
	private int gendleId;
	private String typeGendle;


	public Gendle(int gendleId, String typeGendle) {
		super();
		this.gendleId = gendleId;
		this.typeGendle = typeGendle;
	}
	
	
	public Gendle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getGendleId() {
		return gendleId;
	}
	
	public void setGendleId(int gendleId) {
		this.gendleId = gendleId;
	}
	
	public String getTypeGendle() {
		return typeGendle;
	}
	
	public void setTypeGendle(String typeGendle) {
		this.typeGendle = typeGendle;
	}

}
