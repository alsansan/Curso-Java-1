package modulo8;

public abstract class Figura {
	
	protected static float maximasuperficie;
	private String figura;
	
	//Constructores
	public Figura() {
	}
	
	public Figura(String figura) {
		this.figura  = figura;
	}
	
	//Generar getters y setters
	public static float getMaximasuperficie() {return maximasuperficie;}
	public static void setMaximasuperficie(float maximasuperficie) {Figura.maximasuperficie = maximasuperficie;}
	public String getFigura() {return figura;}
	public void setFigura(String figura) {this.figura = figura;}
	
	public boolean equals(Object obj){
		//establezco las reglas como yo quiero 
		boolean bln =false;
		if(obj instanceof Figura){
			//downcast			
			Figura fig = (Figura) obj;
			bln = this.figura == fig.getFigura();
		}
		return bln;
	}
	
	public int hashCode(){
		return figura.hashCode() + (int)maximasuperficie;
	}
	
	public String toString(){
		return "Figura: " + figura + ", maximasuperficie: " + maximasuperficie;	
	}

}
