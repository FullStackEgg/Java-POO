package Entidades;

import interfazCalculos.CalculosFormas;

public class Circulo implements CalculosFormas {
	
	private Double radio;
	private Double diametro;
	
	public Circulo() {
	}
	
	public Circulo(Double radio, Double diametro) {
		this.radio = radio;
		this.diametro = diametro;
	}

	
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "[ Circulo ] \nRadio = " + radio + " \nDiametro = " + diametro;
	}

	// Metodos de la interfaz
	// Área circulo: PI * radio ^ 2
	@Override
	public Double calcularArea() {
		double area = VALOR_PI * Math.pow(this.radio, 2);
		return area;
	}

	// Perímetro circulo: PI * diámetro.
	@Override
	public Double calcularPerimetro() {
		double perimetro = VALOR_PI * this.diametro;
		return perimetro;
	}
	
}
