package operacionTablas;

public class Alumno extends Table {

	protected String nombre;
	protected String apellido;
	protected String curso;
	protected int edad;

	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTable() {
		return this.nombre;
	}

}
