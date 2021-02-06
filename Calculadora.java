/* 
Nombre; Jorge Caballeros
Carnet: 20009
Clase: Estructuras de datos.
Tarea: Calculadora generica
*/
public class Calculadora implements CalculadoraGeneral
{
    
    public StackVector<Integer> data;
    //Método postfix para obtener el resultado
    public String calculo(String aString) 
    {
        int b = 0;
        int a = 0;
        data = new StackVector<Integer>();
        char ch[] = aString.toCharArray();
        for(char i: ch) 
        {
            if( i <= '9' && i >= '0' ) 
            {
              data.push((Integer)(i - '0'));
            } 
            //De lo contrario
            else {
              //Se ejecuta el método pop igualado a A y B
              b = data.pop();
              a = data.pop();
              //Se verifica si el caracter es un simbolo para su procesamiento
              switch(i){
                case '/':
                data.push(a/b);
                break;
                case '-':
                data.push(a-b);
                break;
                case '*':
                data.push(a*b);
                break;
                case '+':
                data.push(a+b);
                break;
              }
            }
        }

        return String.valueOf(data.pop());
    }
}
    

