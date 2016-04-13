package rmi;

import interfaz.TDAManejoDatos;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import negocio.Jugador;

public class JugadorRMI extends UnicastRemoteObject implements TDAManejoDatos {

	private static final long serialVersionUID = 1L;
	private Set<Jugador> jugadores;

	public JugadorRMI() throws RemoteException {
		super();
		jugadores = new HashSet<Jugador>();
	}
	
	public Jugador obtenerJugador(int numeroJugador) throws RemoteException{
		Jugador aux;
		for(Iterator<Jugador> i=jugadores.iterator();i.hasNext();)
		{
			aux = i.next();
			if(aux.getId()==numeroJugador)
				return aux;
		}
		throw new RemoteException("El jugador no existe");
	}
	
	public void agregarJugador(Jugador jugador) throws RemoteException{
		jugadores.add(jugador);
	}
}
