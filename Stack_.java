//Interfaz generica Stack 
/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
public interface Stack_ <E> {
    //Método abstracto genérico push
    public void push(E data);
    //Método abstracto generico pop
    public E pop ();
    //Método abstracto genérico peek
    public E peek();
    //Método abstracto genérico empty para chequear si una lista está vacía
    public boolean empty();
    //Método abstracto generico size retorna el largo de la lista
    public int size();
}
