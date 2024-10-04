public class CuatroEnLinea {
    private char[][] tablero;
    private int jugadorActual;

    // 1. Inicializa el tablero y establece el jugador actual
    public void iniciarJuego() {
        tablero = new char[6][7]; // Crear una matriz de 6 filas por 7 columnas
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = ' '; // Inicializar todas las posiciones como vacías
            }
        }
        jugadorActual = 1; // El jugador 1 comienza
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

        System.out.println("Movimiento inválido: columna llena.");
        return false; // No se puede hacer el movimiento porque la columna está llena
    }
    // Muestra el estado actual del tablero
    public void mostrarTablero() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("| " + tablero[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------"); // Línea separadora del tablero
    }

    //  Verifica si el juego ha terminado
    public boolean esJuegoTerminado() {
        
        return false;
    }

    //  Verifica si hay un ganador
    public boolean esGanador() {
        
        return false;
    }

    //  Verifica si el juego ha terminado en empate
    public boolean esEmpate() {
        
        return false;
    }

    //  Cambia el turno al siguiente jugador
    public void cambiarJugador() {
        
    }

    // Getter para obtener el jugador actual
    public int getJugadorActual() {
        
        return 0;
    }
}
