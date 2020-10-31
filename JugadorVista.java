import java.util.Scanner;
/**
 * Write a description of class TableroVista here.
 *
 * @author Dylan
 * @version 11/10/2020
 */
public class JugadorVista
{
    /**
     * Constructor for objects of class TableroVista
     */
    public JugadorVista()
    {
    }

    /**
     * Imprime la pregunta sobre quien hara la jugada y envia la respuesta, este metodo es para el modo de 
     * 2 jugadores
     *
     */
    public int[] ImprimirPreguntaJugada1()
    {
        Scanner scan = new Scanner(System.in);
        int vectorJugada[] = new int[2]; 
        System.out.println("Que jugador hara la jugada?");
        System.out.println("1) Blanco");
        System.out.println("2) Negro");
        vectorJugada[0] = scan.nextInt();
        System.out.println("En que columna va a ingresar la ficha?");
        vectorJugada[1] = scan.nextInt() - 1;
        if (vectorJugada[1] > 6) {
            return ImprimirPreguntaJugada1();
        }else {
            return vectorJugada;
        }
    }

    /**
     * Imprime la pregunta sobre quien hara la jugada y recibe la respuesta, este metodo es para el modo de 
     * 1 jugador
     *
     */
    
    public int ImprimirPreguntaJugada2()
    {
        Scanner scan = new Scanner(System.in);
        int Jugada = 0; 
        System.out.println("En que columna va a ingresar la ficha?");
        Jugada = scan.nextInt() - 1;
        if (Jugada > 6) {
            return ImprimirPreguntaJugada2();
        }else {
            return Jugada;
        }
    }

    /**
     * Imprime un mensaje en caso de que no sea el turno del jugador indicado
     */
    public void ImprimirTurnoIncorrecto()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("No es el turno correcto, es turno del otro jugador!");
       String espera = scan.nextLine();
    }
    
    /**
     *Le pregunta al jugador el modo de juego y retorna un entenro segun la decision del jugador
     */
    public int ImprimirElegirModoJuego()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desde jugar \n 1)Jugador VS Jugador \n 2)Jugador vs Computadora");
        int modoJuego = scan.nextInt();
            if (modoJuego != 1 && modoJuego != 2) {
            System.out.println("\f");
            System.out.println("Por favor elija un numero valido");
            return ImprimirElegirModoJuego();
        }else {
            return modoJuego;
        }
    }
    
    /**
     *Imprime un mensaje sobre como la columna seleccionada ya esta llena
     */
    public void ColumnaLlena()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("La columna desea ya esta llena");
        String espera = scan.nextLine();
    }
    
}
