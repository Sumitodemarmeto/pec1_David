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
	
//		Mediante esta función asignamos al alumno el primer asiento libre y
//	devolvemos el asiento y el aula asignados al alumno.
//		En caso de no haber ningun asiento libre en ningun aula mostramos el
//	siguiente mensaje "No hay ningun asiento disponible en ningun aula".
	public String	AsignarAsiento(Alumno alumno)
	{
		Alumno	asientos[];
		int		i;
		
		if (alumno == null)
		{
			System.out.println("El campo alumno no puede estar vacio.");
			return (null);
		}
		for (Aula aula:aulas)
		{
			asientos = aula.getAsientos();
			i = 0;
			for (Alumno asiento:asientos)
			{
				if (asiento != null)
				{
					asiento = alumno;
					aula.setAsientos(asientos);
					return (aula.getPlanta() + "." + aula.getNumero() + "-" + i);
				}
				i++;
			}
		}
		System.out.println("No hay ningun asiento disponible en ningun aula.");
		return (null);
	}

}
