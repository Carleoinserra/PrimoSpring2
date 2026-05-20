package com.example.demo;

public class Persona {
	String nome;
	String mansione;
	double stipendio;
	String url;
	public Persona(String nome, String mansione, double stipendio, String url) {
		super();
		this.nome = nome;
		this.mansione = mansione;
		this.stipendio = stipendio;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", mansione=" + mansione + ", stipendio=" + stipendio + ", url=" + url + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
