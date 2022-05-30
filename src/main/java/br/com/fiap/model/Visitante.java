package br.com.fiap.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "Nome do Visitante";
	private LocalDateTime dataNascimento;
	private String numeroCPF;
	private String numeroRG;
	private String digitoRG;
	private LocalDateTime dataCadastro = LocalDateTime.now();
	private String imagePath;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public String getDigitoRG() {
		return digitoRG;
	}

	public void setDigitoRG(String digitoRG) {
		this.digitoRG = digitoRG;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Visitante [nome=" + name + ", Data de Nascimento=" + dataNascimento + ", Numero do CPF=" + numeroCPF + ", Numero do RG=" + numeroRG + ", Digito do RG=" + digitoRG + "]";
	}

	public Long getId() {
		return id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	

}
