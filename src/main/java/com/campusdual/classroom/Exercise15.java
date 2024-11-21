package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise15 {

	public static void main(String[] args) {
		// Crear una instancia de FreshMerchandise
		FreshMerchandise fm = new FreshMerchandise(
				"Manzanas",                  // Nombre
				"001-9",                     // ID único
				"Frutería de ayer S.L.",     // Responsable
				8,                           // Zona
				"C",                         // Área
				"114D",                      // Estante
				53,                          // Cantidad
				Calendar.getInstance().getTime() // Fecha de caducidad
		);

		// Imprimir los datos específicos de la mercancía fresca
		fm.printSpecificData();

		// Mostrar la localización
		System.out.println(fm.getLocation());
	}

}
