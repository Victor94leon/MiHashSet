
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

    /**
     * Método que devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean elementoRepetido = false;
        if (valores.contains(elemento)) {
            elementoRepetido = true;
        }
        return elementoRepetido;
    }

    /**
     * Método que devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return valores.isEmpty();
    }

    /**
     * Método que elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean elementoEliminado = false;
        if (contains(elemento)) {
            valores.remove(valores.indexOf(elemento));
            elementoEliminado = true;
        }
        return elementoEliminado;
    }

    /**
     * Método que devuelve el número de elementos del conjunto.
     */
    public int size()
    {
        return valores.size();
    }

    /**
     * Método que devuelve una cadena conteniendo todos los elementos del conjunto 
     * separados por comas y entre corchetes.
     */
    public String toString()
    {
        String cadena = "[";
        if (size()>0) {
            int index = 0;
            while (index<size()-1) {
                cadena += valores.get(index)+", ";
                index++;
            }
            cadena += valores.get(index);
        }
        cadena += "]";
        return cadena;
    }

    /**
     * Método que devuelve verdadero si el parámetro es igual al conjunto sobre el que 
     * se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean conjuntosIguales = true;
        if (size() == otroConjunto.size()) {
            int index = 0;           
            while (index<size() && conjuntosIguales) {
                if (!otroConjunto.contains(valores.get(index))) {
                    conjuntosIguales = false;
                }
                index++;
            }
        }
        else {
            conjuntosIguales = false;
        }       
        return conjuntosIguales;
    }
}
