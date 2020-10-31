/**
 * Write a description of class Tablero here.
 *
 * @author Dylan Tenorio Rojas
 * @version 11/10/2020
 */
public class TableroModulo
{
    private int tablero[][] = new int[6][7];

    /**
     * Constructor de la clase Tablero
     * Inicia la matriz del tablero con los valores en 0
     * 
     */
    public TableroModulo()
    {
        for (int fila = 0; fila <6; fila++){
            for (int columna = 0; columna <7; columna++) {
                tablero[fila][columna] = 0;
            }
        }
    }

    /**
     * Metodo que genera un String con los datos del tablero 
     * para mostrar al usuario
     *
     */
    public String GetTablero()
    {
        String stringTablero = "";
        for (int fila = 0; fila <6; fila++){
            for (int columna = 0; columna <7; columna++) {
                switch (tablero[fila][columna]) {
                    case 1:
                        stringTablero= stringTablero + "B"+ "|";
                    break;
                    
                    case 2:
                        stringTablero= stringTablero + "N" +"|";
                    break;
                    
                    case 0:
                        stringTablero= stringTablero + " |";
                    break;
                }
            }
            stringTablero = stringTablero + "\n";
        }
        return stringTablero;
    }
    
    /**
     * Este metodo revisa el tablero en lineas horizontales comprobando si un valor (1 0 2) se repite al menos 4
     * veces consecutivas
     */
    public int RevisionHorizontal()
    {
        int contadorBlanco = 0;
        int contadorNegro = 0;
        int condicionGane = 0;
        for (int fila = 0; fila < 6; fila++){
                for (int columna = 0; columna < 7; columna++) {
                    if (tablero[fila][columna] == 1) {
                        contadorBlanco++;
                        contadorNegro = 0;
                    }
                    else if (tablero[fila][columna] == 2) {
                        contadorNegro++;
                        contadorBlanco = 0;
                    }else {
                        contadorBlanco = 0;
                        contadorNegro = 0;
                    }
                    if (contadorBlanco >= 4) {
                        condicionGane = 1;
                    } 
                    else if (contadorNegro >= 4) {
                        condicionGane = 2;
                    }
                    } 
                contadorBlanco = 0;
                contadorNegro = 0;
        }
        return condicionGane;
    }
    
    /**
     * Este metodo revisa el tablero en lineas verticales comprobando si un valor (1 0 2) se repite al menos 4
     * veces consecutivas
     */
    public int RevisionVertical()
    {
        int contadorBlanco = 0;
        int contadorNegro = 0;
        int condicionGane = 0;
        for (int columna = 0; columna < 7; columna++){
                for (int fila = 0; fila < 6; fila++) {
                    if (tablero[fila][columna] == 1) {
                        contadorBlanco++;
                        contadorNegro = 0;
                    }
                    else if (tablero[fila][columna] == 2) {
                        contadorNegro++;
                        contadorBlanco = 0;
                    }else {
                        contadorBlanco = 0;
                        contadorNegro = 0;
                    }
                    if (contadorBlanco >= 4) {
                        condicionGane = 1;
                    } 
                    else if (contadorNegro >= 4) {
                        condicionGane = 2;
                    }
                    }
                contadorBlanco = 0;
                contadorNegro = 0;
        }
        return condicionGane;
    }
    
    /**
     * Este metodo revisa el tablero en lineas diagonales de arriba-derecha hacia abajo-izquierda
     * comprobando si un valor (1 0 2) se repite
     * al menos 4 veces consecutivas
     */
    public int RevisionDiagonal1()
    {
        int condicionGane = 0;
        int vectorDiagonalesBlanco[] = new int[12];
        int vectorDiagonalesNegro[] = new int[12];
        int suma;
        for (int fila = 0; fila < 6; fila++){
                for (int columna = 0; columna < 7; columna++) {
                    suma = (columna + fila);
                    if (tablero[fila][columna] == 1) {
                        vectorDiagonalesBlanco[suma]++;
                        vectorDiagonalesNegro[suma] = 0;
                    } else if (tablero[fila][columna] == 2) {
                        vectorDiagonalesNegro[suma]++;
                        vectorDiagonalesBlanco[suma] = 0;
                    }else {
                        vectorDiagonalesBlanco[suma] = 0;
                        vectorDiagonalesNegro[suma] = 0;
                    }
                    
                    for (int filaVector = 0; filaVector <12; filaVector++){
                            if (vectorDiagonalesBlanco[filaVector] >= 4) {
                                condicionGane = 1;
                            }
                        }
                    for (int filaVector = 0; filaVector <12; filaVector++){
                            if (vectorDiagonalesNegro[filaVector] >= 4) {
                                condicionGane = 2;
                            }
                        }
                }
        }
        return condicionGane;
    }
    
    /**
     * 
     * Este metodo revisa el tablero en lineas diagonales de arriba-izquierda hacia abajo-derecha
     * comprobando si un valor (1 0 2) se repite
     * al menos 4 veces consecutivas
     */
    public int RevisionDiagonal2()
    {
        int condicionGane = 0;
        int vectorDiagonalesBlanco[] = new int[12];
        int vectorDiagonalesNegro[] = new int[12];
        int resta;
        for (int fila = 0; fila < 6; fila++){
                for (int columna = 0; columna < 7; columna++) {
                    resta = (fila - columna) + 6;
                    if (tablero[fila][columna] == 1) {
                        vectorDiagonalesBlanco[resta]++;
                        vectorDiagonalesNegro[resta] = 0;
                    }else if (tablero[fila][columna] == 2) {
                        vectorDiagonalesNegro[resta]++;
                        vectorDiagonalesBlanco[resta] = 0;
                    }else {
                        vectorDiagonalesBlanco[resta] = 0;
                        vectorDiagonalesNegro[resta] = 0;
                    }
                    
                    for (int filaVector = 0; filaVector <12; filaVector++){
                            if (vectorDiagonalesBlanco[filaVector] >= 4) {
                                condicionGane = 1;
                            }
                        }
                    for (int filaVector = 0; filaVector <12; filaVector++){
                            if (vectorDiagonalesNegro[filaVector] >= 4) {
                                condicionGane = 2;
                            }
                        }
                }
        }
        return condicionGane;
    }
    
    /**
     * Inserta una ficha en el tablero segun el color y columna recibidos
     * 
     * @param color: es un int entre 1 o 2 para el color de la ficha
     * @param columna: es un int entre 0 y 6
     * @return error: booleano en caso de que la columna ya no tenga espacio disponible para indicar que se
     * debe seleccionar otra columna
     */
    public boolean InsertarFicha(int color, int columna)
    {
        boolean error = false;
        int fila = 5;
        if (tablero[0][columna] != 0){
            error = true;
            } else
        do {
            if (tablero[fila][columna] == 0){
                tablero[fila][columna] = color;
                fila = 0;
            error = false;
            }
            fila--;
        }while (fila >=0);
        return error;
    }
    
    /**
     * El motodo recorre la matriz buscando un cero, si lo hay entonces devuelve un 0 para confirmar 
     * que el programa puede seguir
     * 
     * @return condicionSeguirJugando: retorna un valor entre 0 y 1 para notificar si quedan espacios en 
     * la matriz si quedan espacios entonces el valor cambia a 0
     */
    public int RevisarTableroCompleto()
    {
        int condicionSeguirJugando = 1;
        for (int fila = 0; fila <6; fila++){
            for (int columna = 0; columna <7; columna++) {
                if (tablero[fila][columna] == 0) {
                    condicionSeguirJugando = 0;
                }
            }
        }
        return condicionSeguirJugando;
    }
}
