//Clase generica stack vector
/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
import java.util.Vector;
import java.util.ArrayList;
import java.util.Stack;

public class StackVector <E> implements Stack_<E>{
    //--------------------Atributos--------------------
    private Vector data;
    public ArrayList<E> stack = new ArrayList<E>();

    //--------------Métodos implementados--------------

    //Método abstracto genérico push, agrega un item al stack
    public void push(E data){
        stack.add(data);
    }
    //Método abstracto generico pop
    public E pop (){
        if (stack.isEmpty() == false){
            System.out.println("Stack is empty");
            return null;
        }
            return stack.remove(size()-1);
    }
    //Método abstracto genérico peek
    public E peek(){
        return stack.get(size() -1);
    }
    //Método abstracto genérico empty para chequear si una lista está vacía
    public boolean empty(){
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    //Método abstracto generico size retorna el largo de la lista
    public int size(){
        return stack.size();
    }

}
