import java.util.Scanner;
/** 
 * @class JuegoControlador
 * @brief Clase que controla la selección y ejecución de los juegos disponibles.
 * 
 * Permite al usuario seleccionar entre TicTacToe (Gato) y Cuatro en Línea, 
 * y gestiona el flujo del juego seleccionado.
 */
public class JuegoControlador {
    /** 
     * @brief Instancia del juego TicTacToe.
     */
    private Gato2 ticTacToe;
    /** 
     * @brief Instancia del juego Cuatro en Línea.
     */
    private CuatroEnLinea cuatroEnLinea;
    /** 
     * @brief Juego actual seleccionado.
     */
    private Object juegoActual;

    // Constructor
    public JuegoControlador() {
        this.ticTacToe = new Gato2();
        this.cuatroEnLinea = new CuatroEnLinea();
    }

    // Métodos

    // Muestra el menú principal para seleccionar el juego
    public void mostrarMenu() {
        System.out.println("Seleccione un juego:");
        System.out.println("1. TicTacToe");
        System.out.println("2. Cuatro en Línea");
    }

    /** 
     * @brief Muestra el menú de selección de juegos y permite al usuario elegir uno.
     * 
     * El usuario puede elegir entre TicTacToe y Cuatro en Línea.
     */
    public void seleccionarJuego() {
        // Código para seleccionar el juego
        boolean salir = false;
        do{
            Scanner scanner = new Scanner(System.in);
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    this.juegoActual = this.ticTacToe;
                    System.out.println("Has seleccionado TicTacToe.");
                    salir = true;
                    break;
                case 2:
                    this.juegoActual = this.cuatroEnLinea;
                    System.out.println("Has seleccionado Cuatro en Línea.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while (salir == false); 
    }

    /** 
     * @brief Ejecuta el juego seleccionado.
     * 
     * Maneja el flujo del juego, alterna los turnos y muestra el estado del tablero.
     */
    public void jugar() {
        // Código para jugar el juego seleccionado
        if (juegoActual == null) {
            System.out.println("Primero seleccione un juego.");
            seleccionarJuego();
        } else if (juegoActual instanceof Gato2) {
            String mt[][] = new String [3][3];
            ticTacToe.Tab = mt;
            for(int i = 0; i<ticTacToe.Tab.length; i++){
                for(int o = 0; o<ticTacToe.Tab.length; o++){
                    ticTacToe.Tab[i][o] = " ";
                }
            }
            do {
                ticTacToe.Both();
                ticTacToe.End();
            } while ((ticTacToe.Winner1() == false || ticTacToe.Winner2() == true) && (ticTacToe.Winner1() == true || (ticTacToe.Winner2() == false)) ||
            ticTacToe.End() == false);

        } else if (juegoActual instanceof CuatroEnLinea) {
            boolean terminado = false;
            cuatroEnLinea.iniciarJuego();
            do{
                cuatroEnLinea.mostrarTablero();
                Scanner scanner = new Scanner(System.in);
                System.out.println("En que columna quiere poner ficha?");
                int opcion = scanner.nextInt();
                cuatroEnLinea.hacerMovimiento(opcion);
                cuatroEnLinea.cambiarJugador();
                terminado = cuatroEnLinea.esJuegoTerminado();
            }while(terminado == false);
            cuatroEnLinea.mostrarTablero();
        }
    }
}
