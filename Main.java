/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Try/Catch para proteger de que el archivo no exista
        try{
            //Lector del archivo y archivo
            File archivo = new File("Datos.txt");
            Scanner lector = new Scanner(archivo);
            //Si el archivo llamado "Datos.txt" existe
            if (archivo.exists()){
                //Imprimir nombre del archivo
                System.out.println("Nombre de archivo: "+ archivo.getName());
                //mientras el archivo tenga lineas que leer imprimirá las lineas leidas
                while (lector.hasNextLine()){
                    String data = lector.nextLine();
                    System.out.println(data);
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no existe o no está en la misma carpeta.");
        }
    }
}