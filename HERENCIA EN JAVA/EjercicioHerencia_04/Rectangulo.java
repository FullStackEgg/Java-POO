package Entidades;

import interfazCalculos.CalculosFormas;

public class Rectangulo implements CalculosFormas {

	private Double base;
	private Double altura;
	
	// onstructores
	public Rectangulo() {
	}

	public Rectangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Getters & Setters
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "[ Rectangulo ] \nbase = " + base + " \naltura = " + altura;
	}

	// Metodos de interfaz
	// Área rectángulo: base * altura
	@Override
	public Double calcularArea() {
		return  this.base * this.altura;
	}

	// Perímetro rectángulo: (base + altura) * 2
	@Override
	public Double calcularPerimetro() {
		return (this.base + this.altura) * 2;
	}
	
	 
	
}
