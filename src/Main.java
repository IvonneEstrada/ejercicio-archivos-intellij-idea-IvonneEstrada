import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
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
                String nombreAlumno = entrada.nextLine();
                String cadenaTotalMaterias = entrada.nextLine();
                int totalMaterias = Integer.parseInt(cadenaTotalMaterias);

                while(totalMaterias-- > 0)  {
                    String nombreMateria = entrada.nextLine();
                    int totalCalificaciones = entrada.nextInt();
                    //entrada.next(); //omitir el salto de linea
                    int suma = 0;
                    for(int i = 0; i < totalCalificaciones; i++)
                    {
                        //hacer un ciclo para leer el total de calificaciones
                        int calificacion = entrada.nextInt();
                        suma += calificacion;
                    }
                    entrada.next(); //omitir salto de linea
                    //Calcular el promedio e imprimir
                    double promedio = suma / totalCalificaciones;
                    System.out.println(nombreAlumno + "tiene un promedio: " + promedio + " en " + nombreMateria);
                }

            }
        }
        catch (FileNotFoundException exception) {
            System.err.println("No se puede abrir el archivo");
        }
        catch (InputMismatchException excepcion) {
            System.err.println("Existe un error en el archivo de entrada");
        }

    }
}
