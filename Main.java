/**
 * 
 * @author Dylan
 * @version 11/10/2020
 * 
 */
public class Main
{
    /**
     *metodo principal
     */
    public static void main(String[] args)
    {
        TableroControlador TableroControlador = new TableroControlador();
        JugadorControlador JugadorControlador = new JugadorControlador();
        JugadorControlador.ElegirModoJuego();
        
        
        int condicionGane = 0;
        int condicionSeguirJugando = 0;
        do {
            TableroControlador.MostrarTablero();
            JugadorControlador.Jugada(TableroControlador);
            condicionGane = TableroControlador.RevisarTablero();
            condicionSeguirJugando = TableroControlador.RevisarTableroCompleto();
        }while (condicionGane==0 && condicionSeguirJugando == 0);
        
        TableroControlador.MostrarTablero();
        TableroControlador.FinDeLaPartida(condicionGane, condicionSeguirJugando);
    }
}
