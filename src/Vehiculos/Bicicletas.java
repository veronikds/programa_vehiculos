package Vehiculos;

public class Bicicletas {

	private String marca;
	private String modelo;
	private int nroRuedas;
	private String color;
	private int aņoFabricacion;
	private String tipo;
	private int velocidadInicial;
	
	public Bicicletas(String marca, String modelo, int nroRuedas, String color, int aņoFabricacion, String tipo, int velocidadInicial) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.aņoFabricacion = aņoFabricacion;
		this.tipo = tipo;
		this.velocidadInicial = velocidadInicial;
	}
	
	public String getInf() {
		return "La marca es " + marca + " y su modelo " + modelo + ". Tiene " + String.valueOf(nroRuedas) + " cantidad de ruedas y es de color " + color + ". Se encuentra fabricado en el aņo " + String.valueOf(aņoFabricacion) + ".\n";
	}
	
	public void setInf(String marca,String modelo,int nroRuedas,String color,int aņoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.aņoFabricacion = aņoFabricacion;
	}
	
	public String getTipo() {
		return "Esta bicicleta es de " + tipo + ".";
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getAcelerar() {
		return "La velocidad inicial es de " + velocidadInicial + "y al aumentar en 5 queda en " + (velocidadInicial+5) + ".";
	}
	
	public void setAcelerar(int velocidadInicial) {
		this.velocidadInicial = velocidadInicial;
	}
	public String getFrenar() {
		return "Al frenar, la velocidad se redujo a " + (velocidadInicial=0);
	}
}
