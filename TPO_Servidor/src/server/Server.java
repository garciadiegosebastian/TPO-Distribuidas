package server;

import interfaz.TDAManejoDatos;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import rmi.*;

public class Server {
    
	TDAManejoDatos objetoRemoto;
	
	public static void main(String[] args){
		new Server();
	}
	
	public Server(){
		iniciar();
	}
	
    public void iniciar(){
    	try {
    		LocateRegistry.createRegistry(1099);	
            TDAManejoDatos gestionAlumnos = new JugadorRMI();
            Naming.rebind ("//localhost/Truco", gestionAlumnos);
            System.out.println("Servidor iniciado");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
