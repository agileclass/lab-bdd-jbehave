package br.pucpr.ma.lab.passos;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.gov.frameworkdemoiselle.behave.parser.Step;
import br.pucpr.ma.lab.Calculadora;
import br.pucpr.ma.lab.Lanterna;
import junit.framework.Assert;

public class PassosCalculadora implements Step {
	
	protected Calculadora calculadora;
	protected Lanterna lanterna;
	
	@When("Quando inicio a Calculadora")
	public void goToWithName(String local) {
	}
	
	@When("inicio a Calculadora")
	public void whenInicioACalculadora() {
		calculadora = new Calculadora();
	}
	
	
	@Then("seu valor ser\u00E1 \"$valor\"")
	public void thenSeuValorSera(double valor) {
	  assertEquals(valor, calculadora.resultado(), 0.0);
	}
	
	@When("adiciono \"$valor\"")
	public void whenAdiciono(double valor) {
	  calculadora.soma(valor);
	}
	
	@When("subtraio \"$valor\"")
	public void whenSubtraio(double valor) {
		calculadora.subtracao(valor);
	}
	
	@When("multiploco \"$valor\"")
	public void whenMultiploco(double valor) {
		calculadora.multiplicao(valor);
	}
	
	

	
	@When("limpo")
	public void whenLimpo() {
		calculadora.limpar();
	}
	
	@Then("realizo v\u00E1rias somas da $lista")
	public void variasSomas(Map<String, String> lista) {
		calculadora.soma(Double.parseDouble(lista.get("valor01")));
		calculadora.soma(Double.parseDouble(lista.get("valor02")));
		Assert.assertEquals(calculadora.resultado(), Double.parseDouble(lista.get("resultado")));
	}

	
	@When("divido \"$status\"")
	public void whenMDivido(double valor) {
		calculadora.divisao(valor);
	}


	@Then("seu status \u00E9 \"ON\"")
	@Pending
	public void thenSeuStatusÉON() {
	  // PENDENTE
	}


}
