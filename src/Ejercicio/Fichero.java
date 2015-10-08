package Ejercicio;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Fichero {

	/*
	 * MEtodo Class file
	 */
	public String[] Metodo1(String ruta){
		File archivo=new File(".");
		
		String [] ListarArchivo=archivo.list();//
		
		for (int i = 0; i < ListarArchivo.length; i++) {
			System.out.println(ListarArchivo[i]);
		}
	return null;
	}
	
	/*
	 * MEtodo Class Path
	 */
	public String[] Metodo2(String ruta){
		Path dir = Paths.get(".");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		 for (Path file: stream) {
		 System.out.println(file.getFileName());
		 }
		} catch (IOException | DirectoryIteratorException e) {
		 
		 System.err.println(e.getMessage());
		}

		return null;
	}
	
}
