import java.util.List;

public interface ITable {
	public String getTable();
	public List<Field> getFields();
	public void addField(Field field);
}
