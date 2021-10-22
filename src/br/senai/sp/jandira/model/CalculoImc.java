package br.senai.sp.jandira.model;

public class CalculoImc {
	
	private double peso;
	private double altura;
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(String peso) {
		
		this.peso = Double.parseDouble(peso);
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}
	
	
	public double calcularImc() {
		double imc = peso/(altura * altura); //Uma alternatica seria usar: peso / Math.pow(altura, 2)
		return imc;
	}
	
	public String mostrarImcComoString() {
		return String.valueOf(calcularImc());
	} 
	
	public String ObterStatus(){
		if(calcularImc() < 18.5) {
			return "Abaixo do Peso";
		} else if(calcularImc() >= 18.5 && calcularImc() < 25){
			return "Peso Ideal";
		} else if (calcularImc() >= 25 && calcularImc() < 30){
			return "Levemente acima do peso";
		} else if(calcularImc() >= 30 && calcularImc() < 35) {
			return "Obesidade Grau I";
		} else if(calcularImc() >= 35 && calcularImc() < 40) {
			return "Obesidade Grau II (Severa)";
		} else {
			return "Obesidade Grau III (Mórbida)";
		}
	}

}
