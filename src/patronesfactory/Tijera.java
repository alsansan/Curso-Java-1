package patronesfactory;

public class Tijera extends PiedraPapelTijeraFactory {

	public Tijera() {
		numero = 2;
		nombre= "tijera";		
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero==2;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {
		//piedra0 pierde   		, resultado =-1
		//papel 1 pierde		, resultado = 1
		//tiera 2 pierd (yo)	, resultado = 0
		int resultado=0;
		
		switch (pPpt.numero) {
		case 0:
			resultado = 1;
			break;
		case 1:
			resultado = 0;
			break;
		case 2:
			resultado = -1;
			break;
		default:
			break;
		}
		return resultado;
	}

}
