package Vehiculos;

public class Autom�viles {
	private String marca;
	private String modelo;
	private int nroRuedas;
	private String color;
	private int a�oFabricacion;
	private int velocidadMaxima;
	private boolean baul;
	private int velocidadInicial;
	
	public Autom�viles(String marca, String modelo, int nroRuedas, String color, int a�oFabricacion,
			int velocidadMaxima, boolean baul, int velocidadInicial) {
		super();
		this.marca = marca;;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.a�oFabricacion = a�oFabricacion;
		this.velocidadMaxima = velocidadMaxima;
		this.baul = baul;
		this.velocidadInicial = velocidadInicial;
	}

	public String getInf() {
		return "La marca es " + marca + " y su modelo " + modelo + ". Tiene " + String.valueOf(nroRuedas) + " cantidad de ruedas y es de color " + color + ". Se encuentra fabricado en el a�o " + String.valueOf(a�oFabricacion) + " y su velocidad m�xima es de " + String.valueOf(velocidadMaxima) + " kilometros por hora.\n";
	}

	public void setInf(String marca,String modelo,int nroRuedas,String color, int a�oFabricacion,int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.a�oFabricacion = a�oFabricacion;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getBaul() {
		if(baul==true) {
			return "El autom�vil posee baul.";
		}else {
			return "El autom�vil no posee baul";
		}
	}
	
	public void setBaul(boolean baul) {
		this.baul = baul;
	}
	
	public String getAcelerar() {
		return "La velocidad inicial es de " + velocidadInicial + "y al aumentar en 20 queda en " + (velocidadInicial+20) + ".";
	}
	
	public void setAcelerar(int velocidadInicial) {
		this.velocidadInicial = velocidadInicial;
	}
	public String getFrenar() {
		return "Al frenar, la velocidad se redujo a " + (velocidadInicial=0);
	}
}
