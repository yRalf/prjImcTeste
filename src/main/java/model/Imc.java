package model;

import java.text.DecimalFormat;

public class Imc {
	
	private String sexo;
	private int idade;
	private float peso, altura;
	
	
	public Imc(String sexo, int idade, float peso, float altura) {
		
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calculaImc() {
   		return (float) (peso/Math.pow(altura, 2));
	}
	
	public String statusImc() {
		String aux = null;

		if (calculaImc() <= 16) 
			aux = "Baixo peso muito grave";
		if(calculaImc() >= 16 && calculaImc() <= 16.99) 
			aux = "Baixo peso grave";
		if(calculaImc() >= 17 && calculaImc() <= 18.49) 
			aux = "Baixo peso";		
		if(calculaImc() >= 18.50 && calculaImc() <= 24.99) 
			aux = "Peso normal";		
		if(calculaImc() >= 25 && calculaImc() <= 29.99) 
			aux = "Sobrepeso";	
		if(calculaImc() >= 30 && calculaImc() <= 34.99) 
			aux = "Obesidade grau I";		
		if(calculaImc() >= 35 && calculaImc() <= 39.99) 
			aux = "Obesidade grau II";		
		if(calculaImc() >= 40) 
			aux = "Obesidade grau III Obesidade Mórbida";
		return aux;
	}
	
	
	public float pesoIdeal() {
		float aux = 0;
		if (sexo == "m")
			aux = (float) ((altura-100)*0.90);
		if (sexo == "f")
			aux = (float) ((altura-100)*0.85);
		return aux;
	}

}
