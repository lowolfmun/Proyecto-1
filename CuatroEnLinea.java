public class CuatroEnLinea {
    private char[][] tablero;
    private int jugadorActual;

   // Inicializa el tablero y establece el jugador actual
   public void iniciarJuego() {
    tablero = new char[6][7]; // Crea una matriz de 6 filas por 7 columnas
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            tablero[i][j] = ' '; // Inicializa todas las posiciones como vacías
        }
    }
    jugadorActual = 1; // El jugador 1 comienza
}

public char[][] getTablero() {
    return tablero;
}

public void setTablero(char[][] tablero) {
    this.tablero = tablero;
}

public int getJugadorActual() {
    return jugadorActual;
}

public void setJugadorActual(int jugadorActual) {
    this.jugadorActual = jugadorActual;
}

// Muestra el estado actual del tablero
public void mostrarTablero() {
    System.out.println("  0   1   2   3   4   5   6");
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            System.out.print("| " + tablero[i][j] + " ");
        }
        System.out.println("|");
    }
}

// Realiza un movimiento en la columna especificada
public boolean hacerMovimiento(int columna) {
    if (columna < 0 || columna >= 7) { // Verificar que la columna esté dentro del rango
        System.out.println("Movimiento inválido: columna fuera de rango.");
        return false;
    }

    for (int i = 5; i >= 0; i--) { // Buscar desde la fila más baja hacia arriba
        if (tablero[i][columna] == ' ') { // Encontrar la primera posición vacía en la columna
            if (jugadorActual == 1) {
                tablero[i][columna] = 'X'; // El jugador 1 coloca una 'X'
            } else {
                tablero[i][columna] = 'O'; // El jugador 2 coloca una 'O'
            }
            return true; // Movimiento exitoso
        }
    }

    System.out.println("Movimiento invalido: columna llena.");
    return false; // No se puede hacer el movimiento porque la columna está llena
}

 // Verifica si hay un ganador
 public boolean esGanador() {
    // Comprobar horizontalmente
    boolean resultado = false;
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7 - 3; j++) {
            if (tablero[i][j] != ' ' && tablero[i][j] == tablero[i][j + 1] && tablero[i][j] == tablero[i][j + 2] && tablero[i][j] == tablero[i][j + 3]) {
                resultado = true; // Cuatro en línea horizontal
            }
        }
    }

    // Comprobar verticalmente
    for (int i = 0; i < 6 - 3; i++) {
        for (int j = 0; j < 7; j++) {
            if (tablero[i][j] != ' ' && tablero[i][j] == tablero[i + 1][j] && tablero[i][j] == tablero[i + 2][j] && tablero[i][j] == tablero[i + 3][j]) {
                resultado = true; // Cuatro en línea vertical
            }
        }
    }

    // Comprobar diagonal positiva (abajo-derecha)
    for (int i = 0; i < 6 - 3; i++) {
        for (int j = 0; j < 7 - 3; j++) {
            if (tablero[i][j] != ' ' && tablero[i][j] == tablero[i + 1][j + 1] && tablero[i][j] == tablero[i + 2][j + 2] && tablero[i][j] == tablero[i + 3][j + 3]) {
                resultado = true; // Cuatro en línea diagonal positiva
            }
        }
    }

    // Comprobar diagonal negativa (abajo-izquierda)
    for (int i = 0; i < 6 - 3; i++) {
        for (int j = 3; j < 7; j++) {
            if (tablero[i][j] != ' ' && tablero[i][j] == tablero[i + 1][j - 1] && tablero[i][j] == tablero[i + 2][j - 2] && tablero[i][j] == tablero[i + 3][j - 3]) {
                resultado = true; // Cuatro en línea diagonal negativa
            }
        }
    }

    return resultado; // No hay ganador
}

 // Verifica si el juego ha terminado en empate
 public boolean esEmpate() {
    boolean resultado = true;
    for (int j = 0; j < 7; j++) {
        if (tablero[0][j] == ' ') {
            resultado = false; // Si alguna columna todavía tiene espacio, no es empate
        }
    }
    
    return resultado; // Todas las posiciones están llenas, es empate
}

    public void cambiarJugador() {
        if (jugadorActual == 1) {
        jugadorActual = 2;
        } else {
        jugadorActual = 1;
        }
}


    // Verifica si el juego ha terminado (por victoria o empate)
    public boolean esJuegoTerminado() {
        return esGanador() || esEmpate();
    }

}
