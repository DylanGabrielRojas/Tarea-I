import java.util.Scanner;
/**
 * Write a description of class TableroControlador here.
 *
 * @author Dylan
 * @version 11/10/2020
 */
public class TableroControlador
{
    TableroVista TableroVista = new TableroVista();
    TableroModulo TableroModulo = new TableroModulo();
    
    public TableroControlador()
    {
    }
    
    /** 
    * Recibe el string del tablero del modulo y lo envia a la vista
    */
     public void MostrarTablero(){
         String tablero = TableroModulo.GetTablero();
         TableroVista.Imprimir(tablero);
    }
    
    /** 
    * Le indica al modulo que color y en que columna debe ingresar una ficha
    * 
    * @param color: el color de la ficha, 1 = blanco y 2 = negro
    * @param columna: la columna de la matriz en la que se debe ingresar el tablero
    * @return: un booleano para notificar si hubo un error al ingresar la ficha
    */
     public boolean InsertarFicha(int color, int columna){
         return TableroModulo.InsertarFicha(color, columna);
    }
    
    /** 
    * Un metodo para revisar el tablero, usa los metodos de revision del modulo y en caso de tener
    * un ganador devuelve la variable con un dato diferente de 0
    * 
    * @return: un entero entre 0 y 2 para notificar si hay un ganador
    */
    public int RevisarTablero() {
        Scanner scan = new Scanner(System.in);
        int vectorRevision[] = new int[4];
        int condicionGane = 0;
        vectorRevision[0] = TableroModulo.RevisionHorizontal();
        vectorRevision[1] = TableroModulo.RevisionVertical();
        vectorRevision[2] = TableroModulo.RevisionDiagonal1();
        vectorRevision[3] = TableroModulo.RevisionDiagonal2();
        for (int i = 0; i<4; i++) {
            if (vectorRevision[i] != 0) {
                condicionGane = vectorRevision[i];
            }
        }
        return condicionGane;
    }
    
    /** 
    * revisa que el tablero aun tenga espacios disponibles
    * 
    * @return: un valor entero entre 0 y 1 para notificar si quedan espacios disponibles 
    */
    public int RevisarTableroCompleto() {
        return TableroModulo.RevisarTableroCompleto();
    }
    
    /** 
    * envia a la vista los valores del ganador o si fue un empate
    * 
    * @param: condicionGane: un entero entre 1 y 2 si hubo un ganador indicando cual fue
    * @param: condicionSeguirJugando: un entero entre 0 y  1 si el juego quedo en empate por falta 
    * de casilla libres
    */
    public void FinDeLaPartida(int condicionGane,int condicionSeguirJugando) {
        TableroVista.FinDeLaPartida(condicionGane, condicionSeguirJugando);
    }

}

