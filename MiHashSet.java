
public class MiHashSet
{
    // Dato de tipo ArrayListInt para guardar los elementos
    private ArrayListInt valores;
    
    /**
     * Método constructor para objetos de la clase MiHashSet
     */
    public MiHashSet() 
    {
        valores = new ArrayListInt();
    }
    
    /**
     * Método que añade un valor al conjunto si no estaba.
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean elementoNoRepetido = true;
        if (valores.contains(valor)) {
            elementoNoRepetido = false;
        }
        else {
            valores.add(valor);
        }
        return elementoNoRepetido;
    }
    
    /**
     * Método que vacia el ocnjunto
     */
    public void clear()
    {
        valores.clear();
    }
}
