package it.polito.tdp.metroparis.model;

public class Connessione {

	private int idConnessione;
	private Linea linea;
	private Fermata stazP;
	private Fermata stazA;

	public Connessione(int idConnessione, Linea linea, Fermata stazP, Fermata stazA) {
		this.idConnessione = idConnessione;
		this.linea = linea;
		this.stazP = stazP;
		this.stazA = stazA;
	}

	public int getIdConnessione() {
		return idConnessione;
	}

	public void setIdConnessione(int idConnessione) {
		this.idConnessione = idConnessione;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public Fermata getStazP() {
		return stazP;
	}

	public void setStazP(Fermata stazP) {
		this.stazP = stazP;
	}

	public Fermata getStazA() {
		return stazA;
	}

	public void setStazA(Fermata stazA) {
		this.stazA = stazA;
	}

}
