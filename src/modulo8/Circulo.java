package modulo8;

import java.util.Objects;

public class Circulo extends Figura {
	//atributos
	private float radio;
	
	//Constructores
	public Circulo() {
		this.radio=0.5f;
		setFigura("circulo");	
	}
	
	public Circulo(String figura, float pradio) {
		super(figura);
		this.radio=pradio;
	}
	
	public String getValores() {
		return "perimetro = " + calcularPerimetro() + "\tsuperficie = " + calcularSuperficie();
	}
	
	//Genero getters y setters
	public float getRadio() {return radio;}
	public void setRadio(float radio) {this.radio = radio;}

	//Calculo el perímetro y el área para un círculo
	public float calcularPerimetro(){
		float pperimetro=2*(float)Math.PI*radio;
		return pperimetro;
	}
	
	public float calcularSuperficie(){
		float psuperficie=(float)Math.PI*radio*radio;
		Figura.setMaximasuperficie(psuperficie);
		return psuperficie;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Circulo	 					&&
				super.equals(obj)  							&&
				radio == ((Circulo)obj).getRadio();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(radio);
		return result;
	}
	public String toString(){
		return super.toString() + ",radio=" + radio;
	}
}
