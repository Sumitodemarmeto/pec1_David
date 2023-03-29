package edu.ucj.programacion.pec1.DavidGomezBruno;

public class Colegio {
	
	private String	nombre;
	private String	direccion;
	private Aula	aulas[];
	
	public Colegio(String nombre, String direccion, Aula aulas[])
	{
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}
	
	//		Mediante esta función asignamos al alumno el primer asiento libre en
	//	cualquier aula y devolvemos la siguiente cadena de texto : "El alumno
	//	con nombre : <nombreAlumno> con dni : <dniAlumno> ha sido asignado al
	//	aula <numAula> en la planta : <plantaAula>.".
	//		En caso de no haber ningun asiento libre en ningun aula mostramos el
	//	siguiente mensaje "No hay ningun asiento disponible en ningun aula.".
	//		En caso de no haber pasar ningun alumno como parametro mostramos el
	//	siguiente mensaje "El campo alumno no puede estar vacio.".
	public String	asignarAsiento(Alumno alumno)
	{
		Alumno	asientos[];
		int		i;
		
		if (alumno == null)
			return ("El campo alumno no puede estar vacio.");
		for (Aula aula:aulas)
		{
			asientos = aula.getAsientos();
			i = 0;
			while (i < asientos.length && asientos[i] != null)
				i++;
			if (i < asientos.length && asientos[i] == null)
			{
				asientos[i] = alumno;
				aula.setAsientos(asientos);
				return ("El alumno con nombre : " + alumno.getNombre()
				+ " con dni : " + alumno.getDni() + " ha sido"
				+ "asignado al aula " + aula.getNumero() + " en la"
				+ " planta : " + aula.getPlanta() + "." + i);
			}
		}
		return ("No hay ningun asiento disponible en ningun aula.");
	}

}
