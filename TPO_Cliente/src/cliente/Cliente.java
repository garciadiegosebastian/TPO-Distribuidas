package cliente;

import interfaz.TDAManejoDatos;

import java.rmi.Naming;
import java.rmi.RemoteException;

import negocio.*;

public class Cliente {
    
	TDAManejoDatos manejoTruco;
	Jugador jugador;
	
	public static void main(String[] args){
		new Cliente();
	}
	
    public boolean getStub(){
    	try {
			manejoTruco = (TDAManejoDatos)Naming.lookup ("//localhost/Truco");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
    
    public Cliente(){
    	if(getStub()) 
    	{
    		try {
    			Categoria categoria = new Categoria(1, "novato", 0, 0, 0);
    			Jugador nuevoJugador = new Jugador(1, "agparedes", "agus@agus.com", "1234", categoria, 0, 0);
    			manejoTruco.agregarJugador(nuevoJugador);
    			
    			jugador = manejoTruco.obtenerJugador(1);
    			System.out.println(jugador.getNickname());
    		} catch (RemoteException e) {
    			e.printStackTrace();
    		}
    	} 
    }
}
