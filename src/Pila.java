import java.util.Stack;

/*
ESTRUCTURA DE DATOS "PILA"
 */
public class Pila {
    private Stack<Integer> pila; //Referencia & Solo se puede guardar enteros

    public Pila() {
        pila = new Stack<Integer>(); // Inicializacion
    }

    // Ingresar datos a la pila con método push
    public void ingresarElementos(Integer dato){
        pila.push(dato);    //Ingresa el elemento
    }

    //Sacar datos de la pila con metodo pop
    public Integer extraerElemento() throws Exception{  //throws Exception: Para manejar excepciones
        if(pila.empty())
            throw new Exception("Pila sin elementos");

        return pila.pop();  //Saca el elemento
    }

    //Conocer el elemento que esta en la cima con metodo peek.
    public Integer elementoTop() throws Exception{
        if(pila.empty())
            throw new Exception("No hay elementos en la Pila");
        return pila.peek();
    }

    @Override
    public String toString() {  //Imprime en pantalla el objeto
        String resultado = "===Pila===\n";
        for (int i = pila.size()-1; i >= 0 ; i--){
            resultado += pila.get(i)+"\n";
        }
        return resultado; //Devuelve el resultado acumulado
    }
}
