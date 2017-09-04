package def;

public class Field {
	private int _tipo;
	private String _coltable;
	public Field(int _tipo, String _coltable) {
		super();
		this._tipo = _tipo;
		this._coltable = _coltable;
	}
	public int get_tipo() {
		return _tipo;
	}
	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}
	public String get_coltable() {
		return _coltable;
	}
	public void set_coltable(String _coltable) {
		this._coltable = _coltable;
	}
	
}
