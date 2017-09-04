package def;
import java.util.ArrayList;
import java.util.List;

public abstract class Table implements ITable{
	
	protected String _table;
	protected ArrayList<Field> _fields;
	
	public Table() {
		_fields = new ArrayList<Field>();
		_table = getTable();
	}

	@Override
	public List<Field> getFields() {
		// TODO Auto-generated method stub
		return _fields;
	}

	@Override
	public void addField(Field field) {
		_fields.add(field);
	}

}
