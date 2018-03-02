package br.pucpr.ma.lab.passos;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.gov.frameworkdemoiselle.behave.parser.Step;
import br.pucpr.ma.lab.Lanterna;

public class PassosLanterna implements Step {
	

	protected Lanterna lanterna;

	
	@When("pego a lanterna no armario")
	public void whenPegoALanternaNoArmario() {
	  lanterna = new Lanterna();
	}

	@Then("seu status \u00E9 \"$status\"")
	public void thenSeuStatusÉOFF(String status) {
		
		String statusDaLaterna = lanterna.getStatus();
		
		assertEquals(status, statusDaLaterna);
		
	  // PENDENTE
	}

	@When("ligo")
	public void whenLigo() {
	  lanterna.ligar();
	}



}
