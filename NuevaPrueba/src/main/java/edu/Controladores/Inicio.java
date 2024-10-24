package edu.Controladores;

import java.sql.Connection;

import edu.Servicios.ConexionPostgresqlImplementacion;
import edu.Servicios.ConexionPostgresqlInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionPostgresqlInterfaz postgreConexion = new ConexionPostgresqlImplementacion();

		try {
			Connection conexion = postgreConexion.generaConexion();
			
			if(conexion != null) {
				System.out.println("CONEXION ESTABLECIDA");
				
				}	
		} catch (Exception e) {
			System.err.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
		}
	}

}
