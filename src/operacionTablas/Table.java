package operacionTablas;

import java.util.ArrayList;

public abstract class Table implements ITable {

	protected ArrayList<Field> fields;
	protected String nombre;
	
	public Table() {
		this.fields = new ArrayList<Field>();
		this.nombre = getTable();
	}

	@Override
	public ArrayList<Field> getFields() {
		return fields;
	}

	@Override
	public void addField(Field field) {
		fields.add(field);
	}
}
