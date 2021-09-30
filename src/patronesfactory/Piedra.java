package patronesfactory;

public class Piedra extends PiedraPapelTijeraFactory {

	public Piedra() {
		numero =0;
		nombre = "piedra";
	}

	@Override
	public boolean isMe(int pNumero) {		
		return pNumero==0;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {
		
		//piedra0 empata (yo)	, resultado =0
		//papel 1 pierde		, resultado = -1
		//tiera 2 gana			, resultado = 1
		int resultado=0;
		
		switch (pPpt.numero) {
		case 0:
			resultado = 0;
			descripcionResultado = "empatamos seguimios siendo amigos";
			break;
		case 1:
			resultado = -1;
			descripcionResultado ="piedra perdio con " + pPpt.getNombre();
			break;
		case 2:
			resultado = 1;
			descripcionResultado = "piedra le gano a " + pPpt.getNombre();
			break;
		default:
			break;
		}
		return resultado;
	}

}
