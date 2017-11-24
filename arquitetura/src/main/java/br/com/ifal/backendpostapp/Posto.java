package br.com.ifal.backendpostapp;

public class Posto {

	private String nome;

	private String precoGasolina;

	Posto(String nome, String precoGasolina) {
		this.nome = nome;
		this.precoGasolina = precoGasolina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(String precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

}
