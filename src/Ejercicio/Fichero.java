package Ejercicio;

import java.io.File;
public class Fichero {

	//metodo
	public String[] ListarArchivo(String ruta){
		File archivo=new File(ruta);
		
		String [] ListarArchivo=archivo.list();//
		
		return ListarArchivo; //Creamos un array en el que guardamos lista de archivos
	
	}
	
	
	
	
}
