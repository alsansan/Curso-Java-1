package patronesfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
    //atributos
	private static List<PiedraPapelTijeraFactory> 	elementos	;
    protected String						nombre		;
    protected int 							numero		;
    protected String 						descripcionResultado;
        
	public PiedraPapelTijeraFactory() {}

	public String getNombre() {
		return nombre;
	}
	//accesors
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDescripcionResultado() {
		return descripcionResultado;
	}

	public static PiedraPapelTijeraFactory getInstance(int pNumero){
		//el padre conoce a todos los hijos
	    elementos = new ArrayList<PiedraPapelTijeraFactory>();
	    elementos.add(new Piedra())	;
	    elementos.add(new Papel())	;
	    elementos.add(new Tijera())	;
	    //agrego a larato y spck 
	    
	    for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if(piedraPapelTijeraFactory.isMe(pNumero))
				return piedraPapelTijeraFactory;
		}
	    
		return null;
	}
	
	public abstract boolean isMe(int pNumero);
	public abstract int comparar(PiedraPapelTijeraFactory pPpt);
	
}

