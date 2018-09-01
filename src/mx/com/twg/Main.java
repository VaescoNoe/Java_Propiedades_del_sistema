package mx.com.twg;

import java.util.Enumeration;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();

		Enumeration propiedades = p.propertyNames();
		
		while(propiedades.hasMoreElements()){
			String nombre = (String) propiedades.nextElement();
			String valor = p.getProperty(nombre);
			System.out.println(nombre+"="+valor);
		}

	}

}
