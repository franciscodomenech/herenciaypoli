

public class Profesor extends Table {

	protected String nombre;
	
	
	public Profesor(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTable() {
		return this.nombre;
	}

}
