package br.pucpr.ma.lab;

public class Lanterna {
	
	private String status;
	
	public Lanterna() {
		status = "OFF";
	}

	public String getStatus() {
		return status;
	}

	public void ligar() {
		status = "ON";
		
	}

}
