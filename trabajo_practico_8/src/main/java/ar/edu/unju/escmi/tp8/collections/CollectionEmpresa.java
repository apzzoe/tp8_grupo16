package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp8.model.Empresa;

public abstract class CollectionEmpresa {

	public static List<Empresa> empresas = new ArrayList<Empresa>();

	public static void precargarEmpresas() {
		if (empresas.isEmpty()) {
			
			empresas.add(new Empresa(1, "Avelino", "Cafeteria", true, 60, 4, "3884111111",
					"Av. Necochea 500, San Salvador de Jujuy"));
			
			empresas.add(new Empresa(2, "Grido", "Heladeria", true, 150, 8, "3884222222",
					"Av. Italia 800, San Salvador de Jujuy"));
			
			empresas.add(new Empresa(3, "Mostaza", "Comidas rapidas", true, 200, 5, "3884333333",
					"Belgrano 700, San Salvador de Jujuy"));
			
			empresas.add(new Empresa(4, "Weiss Burger", "Comidas rapidas", true, 40, 2, "3884444444",
					"Alvear 300, San Salvador de Jujuy"));
			
			empresas.add(new Empresa(5, "McDonald's", "Comidas rapidas", true, 250, 3, "3884555555",
					"Av. Salta 1100, San Salvador de Jujuy"));
			
			empresas.add(new Empresa(6, "Bonafide", "Cafeteria", false, 90, 1, "3884666666",
					"Ruta 9 km 5, Palpala"));
		}
	}

}