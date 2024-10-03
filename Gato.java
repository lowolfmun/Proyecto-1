import java.util.Scanner;
public class Gato{

    public String Tab[][];
    public String M1;
    public String M2;

    public Cat(String play[][]){
        this.Tab = play;

    }

    public void setM1(String M1){
        this.M1 = M1;
    }

    public String getM1(){
        return M1;
    }

    public void setM2(String M2){
        this.M2 = M2;
    }

    public String getM2(){
        return M2;
    }

    public static String A1(){
        Scanner A = new Scanner(System.in);
        System.out.print("Introduzca la coordenda X: ");
        int C1 = A.nextInt();

        return C1;
    }

    public static String A2(){
        Scanner B = new Scanner(System.in);
        System.out.print("Introduzca la coordenda Y: ");
        int C2 = B.nextInt();

        return C2;
    }

    public static String B1(){
        Scanner A = new Scanner(System.in);
        System.out.print("Introduzca la coordenda X: ");
        int C1 = A.nextInt();

        return C1;
    }

    public static String B2(){
        Scanner B = new Scanner(System.in);
        System.out.print("Introduzca la coordenda Y: ");
        int C2 = B.nextInt();

        return C2;
    }

    public void Jugador1(){

        int p1 = A1();
        int p2 = A2();
        Tab[p1][p2] = "X";

        if(Tab[p1][p2] == "O"){
            System.out.println("ESta posición ya está ocupada por el jugador 2.");
            Tab[p1][p2] = "O";
        }

    }

    public void Jugador2(){

        int p1 = B1();
        int p2 = B2();
        Tab[p1][p2] = "O";

        if(Tab[p1][p2] == "X"){
            System.out.println("ESta posición ya está ocupada por el jugador 1.");
            Tab[p1][p2] = "X";
        }

    }

    public void Winner1(){

    }

    public void Winner2(){
        
    }

}