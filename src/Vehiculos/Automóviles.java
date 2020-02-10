package Vehiculos;

public class Automóviles {
	private String marca;
	private String modelo;
	private int nroRuedas;
	private String color;
	private int añoFabricacion;
	private int velocidadMaxima;
	private boolean baul;
	private int velocidadInicial;
	
	public Automóviles(String marca, String modelo, int nroRuedas, String color, int añoFabricacion,
			int velocidadMaxima, boolean baul, int velocidadInicial) {
		super();
		this.marca = marca;;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.añoFabricacion = añoFabricacion;
		this.velocidadMaxima = velocidadMaxima;
		this.baul = baul;
		this.velocidadInicial = velocidadInicial;
	}

	public String getInf() {
		return "La marca es " + marca + " y su modelo " + modelo + ". Tiene " + String.valueOf(nroRuedas) + " cantidad de ruedas y es de color " + color + ". Se encuentra fabricado en el año " + String.valueOf(añoFabricacion) + " y su velocidad máxima es de " + String.valueOf(velocidadMaxima) + " kilometros por hora.\n";
	}

	public void setInf(String marca,String modelo,int nroRuedas,String color, int añoFabricacion,int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.añoFabricacion = añoFabricacion;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getBaul() {
		if(baul==true) {
			return "El automóvil posee baul.";
		}else {
			return "El automóvil no posee baul";
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
