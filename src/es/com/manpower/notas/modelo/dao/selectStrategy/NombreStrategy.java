package es.com.manpower.notas.modelo.dao.selectStrategy;

public class NombreStrategy extends SelectStrategy {

	public NombreStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder(" where alu_nombre like '%");
		sb.append(alumno.getNombre());
		sb.append("%'");
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		tengoWhere =alumno.getNombre()!= null &&
				 	!alumno.getNombre().isEmpty();
	
		return 	alumno.getNombre()!= null &&
				!alumno.getNombre().isEmpty();
	}

}
