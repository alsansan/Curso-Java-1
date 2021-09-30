package patronesfactory;

public class Papel extends PiedraPapelTijeraFactory {

	public Papel() {
		numero = 1;
		nombre = "papel";
	}

	@Override
	public boolean isMe(int pNumero) {		
		return pNumero==1;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {
		//piedra0 gana   		, resultado = 1
		//papel 1 pierde(yo)	, resultado = 0
		//tiera 2 pierd			, resultado = -1
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
