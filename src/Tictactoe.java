import java.util.Scanner;

public class Tictactoe {


    public static void main(String[] args) {

        char[][] taulell = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '},{'-', '+', '-', '+', '-'},{' ', '|', ' ', '|', ' '}};
        dibuixarTaulell(taulell);
        Scanner scan= new Scanner(System.in);
        System.out.println("Entra la posicio (1-9):");
        int pos= scan.nextInt();
        posicionarSimbol(taulell,pos,"Jugador_1");
        dibuixarTaulell(taulell);
        System.out.println("Entra la posicio (1-9):");
        pos= scan.nextInt();
        posicionarSimbol(taulell,pos,"Jugador_2");
        dibuixarTaulell(taulell);

    }



    public  static  void dibuixarTaulell(char[][] taulell){
        for(char[] fila: taulell){
            for(char c: fila){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public  static void posicionarSimbol(char[][] taulell, int pos, String usuari){
        char simbol= ' ';
        if(usuari.equals("Jugador_1")){
            simbol='X';
        }
        else if(usuari.equals("Jugador_2")){
            simbol='O';
        }

        switch(pos){
            case 1:
                taulell[0][0]=simbol;
                break;
            case 2:
                taulell[0][2]=simbol;
                break;
            case 3:
                taulell[0][4]=simbol;
                break;
            case 4:
                taulell[2][0]=simbol;
                break;
            case 5:
                taulell[2][2]=simbol;
                break;
            case 6:
                taulell[2][4]=simbol;
                break;
            case 7:
                taulell[4][0]=simbol;
                break;
            case 8:
                taulell[4][2]=simbol;
                break;
            case 9:
                taulell[4][4]=simbol;
                break;
            default:
                break;
        }
    }
}
