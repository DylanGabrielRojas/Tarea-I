/**
 * Write a description of class Tablero here.
 *
 * @author Dylan Tenorio Rojas
 * @version 11/10/2020
 */
public class JugadorModulo
{
    int turno = 1;
    /**
     * Constructor de la clase Tablero
     * Inicia la matriz del tablero con los valores en 0
     * 
     */
    public JugadorModulo()
    {
    }

    /**
     * El atributo turno siempre inicia en 1 ya que el primero en jugar es el color blanco, el metodo revisa que
     * quien intente jugar sea el mismo que el atributo turno y retorna un booleano si es correcto o no, ademas de
     * cambiar el turno si el booleano es correcto
     */
    public boolean CalcularTurno(int turno)
    {
        boolean confirmacionTurno = false;
        if (this.turno == turno) {
            confirmacionTurno = true;
            this.turno = (this.turno == 1) ? 2 : 1;
        }
        return confirmacionTurno;
    }

    /**
     * Cambia el turno en caso de que haya habido un error
     */
    public void CambiarTurno()
    {
         this.turno = (this.turno == 1) ? 2 : 1;
    }

}