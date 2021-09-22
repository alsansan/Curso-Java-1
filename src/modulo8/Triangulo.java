package modulo8;

import java.util.Objects;

public class Triangulo extends Figura {
	//atributos
	private float lado1;
	private float lado2;
	private float lado3;
	
	//Constructores
	public Triangulo() {
		lado1=1.5f;
		lado2=0.5f;
		lado3=1.0f;
		
	}
	public Triangulo(String figura, float plado1, float plado2, float plado3){
		super(figura);
		this.lado1=plado1;
		this.lado2=plado2;
		this.lado3=plado3;
		Figura.maximasuperficie=calcularSuperficie();
	}
	public float calcularPerimetro(float pperimetro) {
		pperimetro=lado1+lado2+lado3;
		return pperimetro;
	}
	public float calcularSuperficie(float psuperficie) {
		float suma=(lado1+lado2+lado3)/2;
		psuperficie=(float)Math.sqrt(suma*(suma-lado1)*(suma-lado2)*(suma-lado3));
		return psuperficie;
	}
	public float getLado1() {return lado1;}
	public void setLado1(float lado1) {this.lado1 = lado1;}
	public float getLado2() {return lado2;}
	public void setLado2(float lado2) {this.lado2 = lado2;}
	public float getLado3() {return lado3;}
	public void setLado3(float lado3) {this.lado3 = lado3;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado1, lado2, lado3);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Triangulo 					&&
				super.equals(obj)  							&&
				lado1 == ((Triangulo)obj).getLado1()		&&
				lado2 == ((Triangulo)obj).getLado2()		&&
				lado3 == ((Triangulo)obj).getLado3();
	}
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}