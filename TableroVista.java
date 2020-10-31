/**
 * Write a description of class TableroVista here.
 *
 * @author Dylan
 * @version 11/10/2020
 */
public class TableroVista
{
    /**
     * Constructor for objects of class TableroVista
     */
    public TableroVista()
    {
    }

    /**
     * Imprime el tablero
     *
     * @param  tablero: es el string que trae los datos de la matriz
     */
    public void Imprimir(String tablero)
    {
        System.out.println("\f");
        System.out.println(tablero);
    }
    

    /**
     * Imprime el resultado de la partida
     *
     * @param  condicionGane,:es la variable que trae el resultado sobre quien gano
     * condicionSeguirJugando: en caso de que el tablero se complete esta variable sera diferente de 0
     */
    public void FinDeLaPartida(int condicionGane,int condicionSeguirJugando) {
    
        if (condicionGane == 1) {
            System.out.println("El ganador es el blanco");
        } else if (condicionGane == 2) {
            System.out.println("El ganador es el negro");
        } else if (condicionSeguirJugando != 0) {
            System.out.println("No hay suficiente espacio para seguir jugando, es un empate");
        }
    }
}
