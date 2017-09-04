package operacionTablas;

import java.util.ArrayList;

public class Field {

	private int _tipo;
	public String _campo;

	public Field(int tipo, String campo) {
		super();
		this._tipo = tipo;
		this._campo = campo;
	}

	public int getTipo() {
		return _tipo;
	}

	public void setTipo(int tipo) {
		this._tipo = tipo;
	}

	public String getCampo() {
		return _campo;
	}

	public void setCampo(String _campo) {
		this._campo = _campo;
	}

}