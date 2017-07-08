package br.com.metatron.saquebancario.controller;

import org.junit.Test;

public class SaqueBancarioTest {

	@Test
	public void testandoSaque(){
		SaqueBancario saque = new SaqueBancario();
		saque.efetuarSaque(380);
	}
	
}
