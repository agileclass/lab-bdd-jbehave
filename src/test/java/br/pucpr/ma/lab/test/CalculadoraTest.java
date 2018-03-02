package br.pucpr.ma.lab.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;
import br.pucpr.ma.lab.passos.PassosCalculadora;

public class CalculadoraTest {

	private BehaveContext eng = null;

	public CalculadoraTest() {
		eng = BehaveContext.getInstance();
		eng.addSteps(new PassosCalculadora());
	}

	@Test
	public void testAllStories() throws Throwable {

		eng.clearAllOriginalStories();
		
		List<String> h = new ArrayList<String>();
		h.add("/estorias/calculadora");


		eng.run(h);
		
	}
}
