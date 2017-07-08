package br.com.metatron.saquebancario.controller;

import br.com.metatron.saquebancario.entity.Cedulas;

public class SaqueBancario {

	public Cedulas efetuarSaque(Integer valor) {
		
		Cedulas cedulas = new Cedulas();
		
		cedulas.setValorRestante(valor);
		
		while(cedulas.getValorRestante() >= 100){
			cedulas.setNota100(cedulas.getNota100() + 1);
			cedulas.setValorRestante(cedulas.getValorRestante() - 100);
		}
		
		while(cedulas.getValorRestante() >= 50){
			cedulas.setNota50(cedulas.getNota50() + 1);
			cedulas.setValorRestante(cedulas.getValorRestante() - 50);
		}
		
		while(cedulas.getValorRestante() >= 20){
			cedulas.setNota20(cedulas.getNota20() + 1);
			cedulas.setValorRestante(cedulas.getValorRestante() - 20);
		}
		
		while(cedulas.getValorRestante() >= 10){
			cedulas.setNota10(cedulas.getNota10() + 1);
			cedulas.setValorRestante(cedulas.getValorRestante() - 10);
		}
		
		if(cedulas.getValorRestante() == 0){
			return cedulas;
		}else{
			return null;
		}		
	}

}
