package modulo8;

import java.util.Objects;

public class Rectangulo extends Figura {
	//atributos
	private float base;
	private float altura;
	
	//Constructores
	public Rectangulo() {
		base=1.5f;
		altura=0.5f;
		
	}
	public Rectangulo(String figura, float pbase, float paltura){
		super(figura);
		this.base=pbase;
		this.altura=paltura;
		Figura.maximasuperficie=calcularSuperficie();
	}
	
	//Genero getters y setters
	public float getBase() {return base;}
	public void setBase(float base) {this.base = base;}
	public float getAltura() {return altura;}
	public void setAltura(float altura) {this.altura = altura;}
	

	//Calculo el perímetro y el área para un círculo
	public float calcularPerimetro(float pperimetro){
		pperimetro=2*base+2*altura;
		return pperimetro;
	}
	
	public float calcularSuperficie(float psuperficie){
		psuperficie=base*altura;
		return psuperficie;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(altura, base);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Rectangulo 					&&
				super.equals(obj)  							&&
				base == ((Rectangulo)obj).getBase()			&&
				altura == ((Rectangulo)obj).getAltura();
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", toString()=" + super.toString() + "]";
	}

}

