

import java.util.ArrayList;

public interface ITable {

	public abstract String getTable();
	public abstract ArrayList<Field> getFields();
	public abstract void addField(Field field);
}
