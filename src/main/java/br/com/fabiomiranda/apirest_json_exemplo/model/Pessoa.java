package br.com.fabiomiranda.apirest_json_exemplo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {

	private int id;
	private String nome;
	private String cpf;
	private double altura;
	private double peso;
	
	
	public Pessoa(int id, String nome, String cpf, double altura, double peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
