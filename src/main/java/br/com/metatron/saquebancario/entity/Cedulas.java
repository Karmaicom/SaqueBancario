package br.com.metatron.saquebancario.entity;

public class Cedulas {

	private Integer valorRestante;
	private Integer nota100;
	private Integer nota50;
	private Integer nota20;
	private Integer nota10;

	public Cedulas() {
		this.valorRestante = 0;
		this.nota100 = 0;
		this.nota50 = 0;
		this.nota20 = 0;
		this.nota10 = 0;
	}

	public Cedulas(Integer valorRestante, Integer nota100, Integer nota50, Integer nota20, Integer nota10) {
		this.valorRestante = valorRestante;
		this.nota100 = nota100;
		this.nota50 = nota50;
		this.nota20 = nota20;
		this.nota10 = nota10;
	}

	public Integer getValorRestante() {
		return valorRestante;
	}

	public void setValorRestante(Integer valorRestante) {
		this.valorRestante = valorRestante;
	}

	public Integer getNota100() {
		return nota100;
	}

	public void setNota100(Integer nota100) {
		this.nota100 = nota100;
	}

	public Integer getNota50() {
		return nota50;
	}

	public void setNota50(Integer nota50) {
		this.nota50 = nota50;
	}

	public Integer getNota20() {
		return nota20;
	}

	public void setNota20(Integer nota20) {
		this.nota20 = nota20;
	}

	public Integer getNota10() {
		return nota10;
	}

	public void setNota10(Integer nota10) {
		this.nota10 = nota10;
	}

	@Override
	public String toString() {
		return "Cédulas \n"
				+ "Cédulas de R$100,00: " + nota100 + "\n"
				+ "Cédulas de R$50,00: " + nota50 + "\n"
				+ "Cédulas de R$20,00: "	+ nota20 + "\n"
				+ "Cédulas de R$10,00: " + nota10;
	}

}
