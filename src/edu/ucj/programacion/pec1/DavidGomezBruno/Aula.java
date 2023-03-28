package edu.ucj.programacion.pec1.DavidGomezBruno;

public class Aula {
	
	private int		numero;
	private int		planta;
	private Alumno	asientos[];
	
	public Aula(int numero, int planta, Alumno asientos[])
	{
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = asientos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}

}
