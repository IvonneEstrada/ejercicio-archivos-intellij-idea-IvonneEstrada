import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Ejercicio; Leer las calificaciones de los alumnos desde un archivo de texto y calcular su promedio
        //El archivo contiene el nombre del alumno.
        //Nombre de la materia
        //La cantidad de calificaciones
        //y sus valores.
        File archivo = new File( "calificaciones.txt");
        try {
            Scanner entrada = new Scanner(archivo);
            while (entrada.hasNext())   {
                String nombreAlumno = entrada.next();
                String nombreMateria = entrada.next();
                int totalCalificaciones = entrada.nextInt();
                entrada.next(); //omitir el salto de linea
                //hacer un ciclo para leer el total de calificaciones
                //...
                //Calcular el promedio e imprimir
            }
        }
        catch (FileNotFoundException exception) {
            System.err.println("No se puede abrir el archivo");
        }

    }
}
