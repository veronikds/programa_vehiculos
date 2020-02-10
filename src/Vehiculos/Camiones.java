package Vehiculos;

public class Camiones {
	
	private String marca;
	private String modelo;
	private int nroRuedas;
	private String color;
	private int añoFabricacion;
	private int velocidadMaxima;
	private int tamañoAcoplado;
	private int velocidadInicial;
	
	public Camiones(String marca, String modelo, int nroRuedas, String color, int añoFabricacion, int velocidadMaxima,
			int tamañoAcoplado,int velocidadInicial) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.añoFabricacion = añoFabricacion;
		this.velocidadMaxima = velocidadMaxima;
		this.tamañoAcoplado = tamañoAcoplado;
		this.velocidadInicial = velocidadInicial;		
	}
	public String getInf() {
		return "La marca es " + marca + " y su modelo " + modelo + ". Tiene " + String.valueOf(nroRuedas) + " cantidad de ruedas y es de color " + color + ". Se encuentra fabricado en el año " + String.valueOf(añoFabricacion) + " y su velocidad máxima es de " + String.valueOf(velocidadMaxima) +" kilometros por hora.\n";
	}
	
	public void setInf(String marca,String modelo,int nroRuedas,String color,int añoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.añoFabricacion = añoFabricacion;
	}
	
	public String getTamañoAcomplado() {
		return "El tamaño de su acopado es de " + tamañoAcoplado + "."; //Colocaría una unidad de peso si supiera cuales manejan :(
	}
	
	public void setTipo(int tamañoAcoplado) {
		this.tamañoAcoplado = tamañoAcoplado;
		}
	public String getAcelerar() {
		return "La velocidad inicial es de " + velocidadInicial + "y al aumentar en 10 queda en " + (velocidadInicial+10) + ".";
	}
	
	public void setAcelerar(int velocidadInicial) {
		this.velocidadInicial = velocidadInicial;
	}
	public String getFrenar() {
		return "Al frenar, la velocidad se redujo a " + (velocidadInicial=0);
	}
}
