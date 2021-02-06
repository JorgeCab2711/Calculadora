/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //----------Instancias----------
        ArrayList<String> stack = new ArrayList<String>();
        Calculadora calc = new Calculadora();

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
                    char [] elementos = data.toCharArray();
                    String simb = "";

                    for (int i = 0; i < elementos.length; i++) {
                        
                        if (elementos[i] != ' '){
                            simb += elementos[i];
                        }
                    }
                //Agregar los caracteres y simbolos al archivo
                stack.add(simb);
                }
            }
            //cerrar la lectura del archivo
            lector.close();
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no existe o no está en la misma carpeta.");
        }

        for (String i : stack) {
           
            System.out.println("\n Postfix Result: "+ calc.calculo(i));
        }
    }
}