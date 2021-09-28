package com.domain.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Model;
import com.domain.modelo.Practica;

public interface DAO {
	//responde a un patron de diseo DAO
	//CRUD. ABMC
	public void agregar(Model pMod) throws ClassNotFoundException, SQLException;
	public void modificar(Model pMod)throws ClassNotFoundException, SQLException;
	public void eliminar(Model pMod)throws ClassNotFoundException, SQLException;
	public List<Model> leer(Model pMod)throws ClassNotFoundException, SQLException;

}