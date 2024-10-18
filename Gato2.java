/** 
 * @class Gato2
 * @brief Clase que representa el juego TicTacToe (Gato).
 * 
 * Esta clase maneja las reglas del juego TicTacToe, verificando movimientos y ganador.
 */
import java.util.Scanner;
public class Gato2{
    /** 
     * @brief Tablero del juego TicTacToe.
     * 
     * Matriz de 3x3 que representa el estado actual del juego.
     */
    public String Tab[][];

    public Cat(String play[][]){
        this.Tab = play;

    }

    public static int A1(){
        System.out.println("Turno del Jugador 1");
        System.out.println();
        Scanner A = new Scanner(System.in);
        System.out.print("Introduzca la coordenda X: ");
        int C1 = A.nextInt();

        return C1;
    }

    public static int A2(){
        Scanner B = new Scanner(System.in);
        System.out.print("Introduzca la coordenda Y: ");
        int C2 = B.nextInt();
        System.out.println();

        return C2;
    }

    public static int B1(){
        System.out.println("Turno del Jugador 2");
        System.out.println();
        Scanner A = new Scanner(System.in);
        System.out.print("Introduzca la coordenda X: ");
        int C1 = A.nextInt();

        return C1;
    }

    public static int B2(){
        Scanner B = new Scanner(System.in);
        System.out.print("Introduzca la coordenda Y: ");
        int C2 = B.nextInt();

        return C2;
    }

    public void Jugador1(){

        int p1 = A1();
        int p2 = A2();

        if(Tab[p1][p2] == "O"){
            System.out.println("Esta posición ya está ocupada por el jugador 2.");
            Tab[p1][p2] = "O";
        }else{
        Tab[p1][p2] = "X";
        }

    }

    public void Jugador2(){

        int p1 = B1();
        int p2 = B2();

        if(Tab[p1][p2] == "X"){
            System.out.println("Esta posición ya está ocupada por el jugador 1.");
            Tab[p1][p2] = "X";
        }else{
        Tab[p1][p2] = "O";
        }
    }
    /** 
     * @brief Verifica si hay un ganador para el jugador 1.
     * @return True si el jugador 1 ha ganado, False en caso contrario.
     */
    public boolean Winner1(){
        // Código para verificar si el jugador 1 ha ganado
        if((Tab[0][0] == "X" && Tab[0][1] == "X" && Tab[0][2] == "X") || (Tab[1][0] == "X" && Tab[1][1] == "X" && Tab[1][2] == "X") || 
        (Tab[2][0] == "X" && Tab[2][1] == "X" && Tab[2][2] == "X") || (Tab[0][0] == "X" && Tab[1][0] == "X" && Tab[2][0] == "X") || (Tab[0][1] == "X" && Tab[1][1] == "X"
        && Tab[2][1] == "X") || (Tab[0][2] == "X" && Tab[1][2] == "X" && Tab[2][2] == "X") || (Tab[0][0] == "X" && Tab[1][1] == "X" && Tab[2][2] == "X") || 
        (Tab[0][2] == "X" && Tab[1][1] == "X" && Tab[2][0] == "X")){
            System.out.println("¡EL JUGADOR 1 ES EL GANADOR!");

            return true;
        }else{
            return false;
        }
    }
    /** 
     * @brief Verifica si hay un ganador para el jugador 2.
     * @return True si el jugador 2 ha ganado, False en caso contrario.
     */
    public boolean Winner2(){
        // Código para verificar si el jugador 2 ha ganado
        if((Tab[0][0] == "O" && Tab[0][1] == "O" && Tab[0][2] == "O") || (Tab[1][0] == "O" && Tab[1][1] == "O" && Tab[1][2] == "O") || 
        (Tab[2][0] == "O" && Tab[2][1] == "O" && Tab[2][2] == "O") || (Tab[0][0] == "O" && Tab[1][0] == "O" && Tab[2][0] == "O") ||
        (Tab[0][1] == "O" && Tab[1][1] == "O" && Tab[2][1] == "O") || 
        (Tab[0][2] == "O" && Tab[1][2] == "O" && Tab[2][2] == "O") || (Tab[0][0] == "O" && Tab[1][1] == "O" && Tab[2][2] == "O") || 
        (Tab[0][2] == "O" && Tab[1][1] == "O" && Tab[2][0] == "O")){
            System.out.println("¡EL JUGADOR 2 ES EL GANADOR!");

            return true;
        }else{
            return false;
        }
    }
    /** 
     * @brief Ejecuta las acciones del turno actual.
     */
    public void Both(){
        // Código para ejecutar las acciones del turno
        String M1 = "";

            if(Winner2() != true){
            Jugador1();
            Winner1();
            }

            if(Winner1() != true){
                Jugador2();
                Winner2();
                }

            if(Winner1() == false && Winner2() == false){

                System.out.println();
                System.out.println("¡NO HAY GANADOR!");
                System.out.println();
    
                for(int i = 0; i<Tab.length; i++){
                    for(int o = 0; o<Tab.length; o++){
                        M1 = M1 + "|" + Tab[i][o] + "|";
                    }
                    M1 = M1 + "\n";
                }
                System.out.println(M1);
                System.out.println();
            }
        

    }
    /** 
     * @brief Determina si el juego ha terminado (por empate o ganador).
     * @return True si el juego ha terminado, False en caso contrario.
     */
    public boolean End(){

        
        if((Tab[0][0] != " " && Tab[0][1] != " ") && (Tab[1][0] != " " && Tab[1][1] != " " && Tab[1][2] != " ") &&
        (Tab[2][0] != " " && Tab[2][1] != " " && Tab[2][2] != " ") && (Tab[0][0] != " " && Tab[1][0] != " " && Tab[2][0] != " ") 
        && (Tab[0][2] != " " && Tab[1][2] != " " && Tab[2][2] != " ") || (Tab[0][0] != " " && Tab[1][1] != " " && Tab[2][2] != " ") || 
        (Tab[0][2] != " " && Tab[1][1] != " " && Tab[2][0] != " ")){

            System.out.println();
            System.out.println("¡JUEGO TERMINADO!");
            return true;

        }else{
            return false;
        }
    }
}

