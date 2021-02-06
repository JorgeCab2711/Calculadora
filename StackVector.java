//Clase generica stack vector
/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
import java.util.EmptyStackException;
import java.util.Vector;


public class StackVector <E> implements Stack_<E>{
    //--------------------Atributos--------------------
    
    private Vector<E> stack;

    //--------------Métodos implementados--------------
    public StackVector(){

        stack = new Vector<E>();
    }
    //Método abstracto genérico push, agrega un item al stack
    public void push(E data){
        stack.add(data);
    }
    //Método abstracto generico pop
    public E pop (){
            return stack.remove(size()-1);
    }
    //Método abstracto genérico peek
    public E peek() throws EmptyStackException {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        return stack.elementAt(stack.size()-1);
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
