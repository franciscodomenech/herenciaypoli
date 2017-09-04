package operacionTablas;

import java.util.ArrayList;

public class CreadorTablas {
	public static void main(String[] args) {

		Field fieldA = new Field(1, "Canarias");
		Field fieldB = new Field(5, "Murcia");

		Usuarios usuario = new Usuarios("TablaUsers");
		usuario.addField(fieldA);
		usuario.addField(fieldB);

		// Comprobacion-Ejemplo:
		ArrayList<Field> misFields = new ArrayList<Field>();
		misFields = usuario.getFields();
		Field field = null;
		int tipo;
		String campo;
		for (int i = 0; i < misFields.size(); i++) {
			field = misFields.get(i);
			tipo = field.getTipo();
			campo = field.getCampo();
			
			System.out.println("El field es: " + field);
			System.out.println("El tipo es: " + tipo);
			System.out.println("El campo es: " + campo);
			
		}
	}
}
