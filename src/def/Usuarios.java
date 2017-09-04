package operacionTablas;

public class Usuarios extends Table {

	protected String nombre;
	
	
	public Usuarios(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTable() {
		return this.nombre;
	}

}
