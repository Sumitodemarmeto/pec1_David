package edu.ucj.programacion.pec1.DavidGomezBruno;

import java.util.Scanner;

public class UtilsColegio {
	
	// Genera una nueva lista de alumnos y asigna los nombres, apellidos y
	// DNI's segun los valores introducidos por consola.
	public static Alumno[]	newAlumnos(int cantidad)
	{
		Scanner	scan;
		Alumno	alumnos[];
		String	datos[];
		int		i;
		
		scan = new Scanner(System.in);
		alumnos = new Alumno[cantidad];
		i = 0;
		datos = new String[3];
		while (i < cantidad)
		{
			System.out.print("---------- alumno ");
			System.out.println((i + 1) + " ----------");
			System.out.print("Nombre\t\t: ");
			datos[0] = scan.next();
			System.out.print("Apellidos\t: ");
			datos[0] = scan.next();
			System.out.print("DNI\t\t: ");
			datos[0] = scan.next();
			alumnos[i] = new Alumno(datos[0], datos[1], datos[2]);
			i++;
			System.out.println();
		}
		scan.close();
		return (alumnos);
	}

}
