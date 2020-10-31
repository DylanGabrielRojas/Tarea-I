
import java.util.Random; 
/**
 * Write a description of class TableroVista here.
 *
 * @author Dylan
 * @version 11/10/2020
 */
public class JugadorControlador
{
    int modoJuego;
    JugadorVista JugadorVista = new JugadorVista();
    JugadorModulo JugadorModulo = new JugadorModulo();

    /**
     * Constructor for objects of class TableroVista
     * 
     * @param: modoJuego: Es el atributo que defie si es un juego contra la computadora o otro jugador
     */
    public JugadorControlador()
    {
    }

    /**
     * El metodo que se encarga de calcular la jugada segun el modo de juego, ademas de recibir el color y
     * la columna donde la ficha debe ser ingresada y enviarlo al tablero
     *
     * @param  TableroControlador: Es el objeto tablero que se usa en el Main
     */
    public void Jugada(TableroControlador TableroControlador)
    {
        boolean error;
        if (this.modoJuego == 1) {
            int vectorJugada[] = JugadorVista.ImprimirPreguntaJugada1();
            boolean confirmacionTurno = JugadorModulo.CalcularTurno(vectorJugada[0]);
            if (confirmacionTurno == true) {
                error = TableroControlador.InsertarFicha(vectorJugada[0], vectorJugada[1]);
                if (error == true) {
                    JugadorModulo.CambiarTurno();
                    JugadorVista.ColumnaLlena();
                }
            }
            else {
                JugadorVista.ImprimirTurnoIncorrecto();
            }
        }
        else {
            Random random = new Random();
            int Jugada = JugadorVista.ImprimirPreguntaJugada2();
            error = TableroControlador.InsertarFicha(1, Jugada);
                if (error == true) {
                    JugadorModulo.CambiarTurno();
                    JugadorVista.ColumnaLlena();
                } else {
                    if (TableroControlador.RevisarTablero() == 0) {
                        error = TableroControlador.InsertarFicha(2, random.nextInt(7));   
                        while (error == true){
                            error = TableroControlador.InsertarFicha(2, random.nextInt(7));
                        }
                    }
                }
        }
    }
    
    /**
     * Elige el modo de juego y cambia el atributo de la clase segun lo que elija el usuario
     */
    public void ElegirModoJuego()
    {
        this.modoJuego = JugadorVista.ImprimirElegirModoJuego();
    }
}
