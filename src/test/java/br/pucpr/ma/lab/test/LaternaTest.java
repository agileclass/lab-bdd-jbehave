package br.pucpr.ma.lab.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;
import br.pucpr.ma.lab.passos.PassosLanterna;

public class LaternaTest {

	private BehaveContext eng = null;

	public LaternaTest() {
		eng = BehaveContext.getInstance();
		eng.addSteps(new PassosLanterna());
	}

	@Test
	public void testAllStories() throws Throwable {

		eng.clearAllOriginalStories();
		
		List<String> h = new ArrayList<String>();
		h.add("/estorias/lanterna");

		eng.run(h);
		
	}
}
