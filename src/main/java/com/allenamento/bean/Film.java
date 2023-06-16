package com.allenamento.bean;

public class Film {
	
	private String nomeFilm;
	private boolean visto;
	
	private int annoDiUscita;
	private int voto;
	private int nomeFilmLinguaOriginale;
	
	public Film() {
		this.nomeFilm = ".";
	}

	public String getNomeFilm() {
		return nomeFilm;
	}

	public void setNomeFilm(String nomeFilm) {
		this.nomeFilm = nomeFilm;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getAnnoDiUscita() {
		return annoDiUscita;
	}

	public void setAnnoDiUscita(int annoDiUscita) {
		this.annoDiUscita = annoDiUscita;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public int getNomeFilmLinguaOriginale() {
		return nomeFilmLinguaOriginale;
	}

	public void setNomeFilmLinguaOriginale(int nomeFilmLinguaOriginale) {
		this.nomeFilmLinguaOriginale = nomeFilmLinguaOriginale;
	}

	@Override
	public String toString() {
		return "Film [nomeFilm=" + nomeFilm + "]";
	}
	
	
	
	
	
	
	
	
	

}
