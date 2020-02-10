package Vehiculos;

public class Camiones {
	
	private String marca;
	private String modelo;
	private int nroRuedas;
	private String color;
	private int a�oFabricacion;
	private int velocidadMaxima;
	private int tama�oAcoplado;
	private int velocidadInicial;
	
	public Camiones(String marca, String modelo, int nroRuedas, String color, int a�oFabricacion, int velocidadMaxima,
			int tama�oAcoplado,int velocidadInicial) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.a�oFabricacion = a�oFabricacion;
		this.velocidadMaxima = velocidadMaxima;
		this.tama�oAcoplado = tama�oAcoplado;
		this.velocidadInicial = velocidadInicial;		
	}
	public String getInf() {
		return "La marca es " + marca + " y su modelo " + modelo + ". Tiene " + String.valueOf(nroRuedas) + " cantidad de ruedas y es de color " + color + ". Se encuentra fabricado en el a�o " + String.valueOf(a�oFabricacion) + " y su velocidad m�xima es de " + String.valueOf(velocidadMaxima) +" kilometros por hora.\n";
	}
	
	public void setInf(String marca,String modelo,int nroRuedas,String color,int a�oFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
		this.color = color;
		this.a�oFabricacion = a�oFabricacion;
	}
	
	public String getTama�oAcomplado() {
		return "El tama�o de su acopado es de " + tama�oAcoplado + "."; //Colocar�a una unidad de peso si supiera cuales manejan :(
	}
	
	public void setTipo(int tama�oAcoplado) {
		this.tama�oAcoplado = tama�oAcoplado;
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
