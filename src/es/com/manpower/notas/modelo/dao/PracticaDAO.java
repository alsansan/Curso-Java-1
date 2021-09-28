package es.com.manpower.notas.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.com.manpower.notas.modelo.Practica;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.util.ConnectionManager;

public class PracticaDAO implements DAO {
	private Connection conexion;
	public PracticaDAO() {
		
	}

	@Override
	public void agregar(Model pMod) throws ClassNotFoundException, SQLException {
		Practica practica= (Practica)pMod;
		
		//1- me tengo que conectar
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("INSERT INTO practicas (PRAC_NOMBRE) VALUES");
		sql.append("(?)");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setString(1, practica.getNombre());
		
		pstm.executeUpdate();				
		ConnectionManager.desConectar();
	}

	@Override
	public void modificar(Model pMod) throws ClassNotFoundException, SQLException {
		Practica practica= (Practica)pMod;
		
		//1- me tengo que conectar
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("update practicas");
		sql.append(" set PRAC_NOMBRE= ?");
		sql.append(" where PRAC_ID=?");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setString(1, practica.getNombre());
		pstm.setInt(2, practica.getCodigo());
		
		pstm.executeUpdate();				
		ConnectionManager.desConectar();
		

	}

	@Override
	public void eliminar(Model pMod) throws ClassNotFoundException, SQLException {
		Practica practica= (Practica)pMod;
		
		//1- me tengo que conectar
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("delete from practicas");		
		sql.append(" where PRAC_ID=?");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setInt(1, practica.getCodigo());
		
		pstm.executeUpdate();				
		ConnectionManager.desConectar();	

	}

	@Override
	public List<Model> leer(Model pMod) throws ClassNotFoundException, SQLException {
		Practica practica= (Practica)pMod;
		List<Model> practicas = new ArrayList<Model>();
		
		//1- me tengo que conectar
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("SELECT PRAC_ID");
		sql.append(" from practicas");
		//utilizar patron strategy
		if(practica.getCodigo()>0)
			sql.append(" where prac_id=?");
		//esto lo voy a hacer para probar.
		//TODO agregar patron de diseo strategy
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setInt(1, practica.getCodigo());
		
		ResultSet rs =pstm.executeQuery();				
		
		
		while(rs.next()){
			practicas.add(new Practica());		
		}
		rs.close();
		ConnectionManager.desConectar();
		
		return  practicas;
	}

}
