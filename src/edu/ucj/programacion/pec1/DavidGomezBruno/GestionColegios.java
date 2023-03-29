package edu.ucj.programacion.pec1.DavidGomezBruno;

public class GestionColegios {
	
	// REPOSITORIO --> https://github.com/Sumitodemarmeto/pec1_David.git

	//     Asignamos a cada uno de los alumnos, recibidos como parametro, un
	// asiento libre dentro de alguna de las aulas del colegio, recibido como
	// parametro.
	//     En caso de no haber más asientos disponibles salimos mostrando el 
	public static void	asignarAsientosaAlumnos(Alumno alumnos[], Colegio colegio)
	{
		for (Alumno alumno:alumnos)
		{
			if (colegio.asignarAsiento(alumno).equals("No hay ningun asiento"
					+ " disponible en ningun aula."))
			{
				System.out.println("No hay más asiento disponibles en ningun"
						+ "aula.");
				return ;
			}
		}
	}
	
	//     Mediante los parámetros recibidos ( <nombreCentro> <direccionCentro>
	// <numAulas> <numAlumnos> ) creamos un objeto de la clase " Colegio " y 
	// le agregamos las aulas con sus respectivos asientos.
	//     Tras crear el objeto de clase " Colegio " creamos una lista con una
	// cantidad, dada a traves de los parametros, de alumnos.
	//     Por ultimo, asignamos a cada alumno a un asiento libre de cualquier
	// aula dentro del colegio.
	public static void main(String[] args) {
		
		Colegio	colegio;
		int		cantAulas;
		Aula	aulasColegio[];
		Alumno	alumnos[];
		
		cantAulas = Integer.parseInt(args[2]);
		aulasColegio = new Aula[cantAulas];
		while (cantAulas-- > 0)
			aulasColegio[cantAulas] = new Aula(cantAulas, cantAulas / 3,
					new Alumno[3]);
		for (Aula aula:aulasColegio)
			System.out.println(aula.getPlanta());
		colegio = new Colegio(args[0], args[1], aulasColegio);
		alumnos = UtilsColegio.newAlumnos(Integer.parseInt(args[3]));
		asignarAsientosaAlumnos(alumnos, colegio);
	}

}
