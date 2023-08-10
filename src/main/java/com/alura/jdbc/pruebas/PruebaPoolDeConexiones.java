package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolDeConexiones {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();
		for (int i = 0; i<= 20; i++) {
			Connection conexion = con.recuperaConexion();
			System.out.println("abriendo la conexion numero " +(i+1));
		}
	}
}
