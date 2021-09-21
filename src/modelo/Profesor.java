package modelo;

public class Profesor extends persona{
	private String iosfa;
	
	public Profesor(){
		super("Alberto","Sanchez");
		iosfa="asdfg";
	}
	public Profesor	(String pnombre, String papellido, String piosfa) {
		super (pnombre, papellido);
		piosfa=iosfa;
	}
	public String getIosfa() {
		return iosfa;
	}
	public void setIosfa(String iosfa) {
		this.iosfa=iosfa;
	}
	public boolean equals(Object obj){		
		return obj instanceof Profesor	 					&&
				super.equals(obj)  							&&
				iosfa == ((Profesor)obj).getIosfa();
	}
	
	public String toString() {
		return super.toString() + ",iosfa" + iosfa ;
	}		
		
}
