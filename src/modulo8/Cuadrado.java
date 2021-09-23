package modulo8;

import java.util.Objects;

public class Cuadrado extends Figura {
	//atributos
	private float lado;
	
	//Constructores
	public Cuadrado() {
		lado=0.5f;
		setFigura("cuadrado");
		
	}
	public Cuadrado(String figura, float plado) {
		super(figura);
		this.lado=plado;
	}
	
	public String getValores() {
		return "perimetro = " + calcularPerimetro() + "\tsuperficie = " + calcularSuperficie();
	}
	
	//Genero getters y setters
	public float getLado() {return lado;}
	public void setLado(float lado) {this.lado = lado;}
	
	//Calculo el perímetro y el área para un círculo
	public float calcularPerimetro(){
		float pperimetro=4*lado;
		return pperimetro;
	}
	
	public float calcularSuperficie(){
		float psuperficie=lado*lado;
		Figura.setMaximasuperficie(psuperficie);
		return psuperficie;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
	return obj instanceof Cuadrado	 					&&
			super.equals(obj)  							&&
			lado == ((Cuadrado)obj).getLado();
	}
	public String toString(){
		return super.toString() + ",lado=" + lado;
	}
}
