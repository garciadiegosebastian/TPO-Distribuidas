package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

import negocio.Jugador;

public interface TDAManejoDatos extends Remote 
{
	public Jugador obtenerJugador(int numeroJugador) throws RemoteException;
	public void agregarJugador(Jugador jugador) throws RemoteException;
}
