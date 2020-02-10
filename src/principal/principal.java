package principal;

import Vehiculos.Automóviles;
import Vehiculos.Bicicletas;
import Vehiculos.Camiones;
import Vehiculos.Motocicletas;

public class principal {

	public static void main(String[] args) {
		Automóviles au1 = new Automóviles("Alfa Romeo","Stelvio",4,"rojo",2020,230,true,0);
		Automóviles au2 = new Automóviles("BMW","X1",4,"gris",2016,200,true,0);
		Automóviles au3 = new Automóviles("Bugatti","Veyron",4,"negro",2005,431,false,0);
		Bicicletas bi1 = new Bicicletas("Intense","B31",2,"azul",2010,"paseo",0);
		Bicicletas bi2 = new Bicicletas("Trek","Terrain",2,"rojo",2007,"carrera",0);
		Bicicletas bi3 = new Bicicletas("Sundown","Luxor",2,"negro",2019,"montaña",0);
		Camiones ca1 = new Camiones("Hyundai","HD-78",4,"blanco",2012,230,78,0);
		Camiones ca2 = new Camiones("Volvo","Retro",4,"violeta",2016,200,55,0);
		Camiones ca3 = new Camiones("Hino","Orcon",4,"turquesa",2005,431,34,0);
		Motocicletas mo1 = new Motocicletas("Kawasaki", "XX5",2, "dorado", 2015,
				200,0);
		Motocicletas mo2 = new Motocicletas("Ducati","Max",2, "negro", 2020,
				230,0);
		Motocicletas mo3 = new Motocicletas("Suzuki","Layer",2,"amarillo", 2000,
				225,0);
		System.out.print(au1.getInf());
		System.out.print(au2.getInf());
		System.out.print(au3.getInf());
		System.out.print(bi1.getInf());
		System.out.print(bi2.getInf());
		System.out.print(bi3.getInf());
		System.out.print(ca1.getInf());
		System.out.print(ca2.getInf());
		System.out.print(ca3.getInf());
		System.out.print(mo1.getInf());
		System.out.print(mo2.getInf());
		System.out.print(mo3.getInf());
	}

}
