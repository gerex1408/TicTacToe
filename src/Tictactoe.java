import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tictactoe {

    static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
    static ArrayList<Integer> player2Positions = new ArrayList<Integer>();


    public static void main(String[] args) {

        char[][] taulell = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '},{'-', '+', '-', '+', '-'},{' ', '|', ' ', '|', ' '}};
        dibuixarTaulell(taulell);
        while(true) {
            Scanner scan= new Scanner(System.in);
            System.out.println("Jugador 1: Entra la posicio (1-9):");
            int jugador_1_pos = scan.nextInt();
            while(player1Positions.contains(jugador_1_pos) || player2Positions.contains(jugador_1_pos)){
                System.out.println("Canvia de posicio, aquesta ja esta ocupada !");
                jugador_1_pos = scan.nextInt();
            }
            posicionarSimbol(taulell, jugador_1_pos, "Jugador_1");
            dibuixarTaulell(taulell);
            String guanyador= mirar_qui_guanya();
            if(guanyador.length()>0){
                System.out.println((guanyador));
                break;
            }
            System.out.println("Jugador 2: Entra la posicio (1-9):");
            int jugador_2_pos = scan.nextInt();
            while(player1Positions.contains(jugador_2_pos) || player2Positions.contains(jugador_2_pos)){
                System.out.println("Canvia de posicio, aquesta ja esta ocupada !");
                jugador_2_pos = scan.nextInt();
            }
            posicionarSimbol(taulell, jugador_2_pos, "Jugador_2");
            dibuixarTaulell(taulell);
            guanyador= mirar_qui_guanya();
            if(guanyador.length()>0){
                System.out.println((guanyador));
                break;
            }
        }

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
            player1Positions.add(pos);
        }
        else if(usuari.equals("Jugador_2")){
            simbol='O';
            player2Positions.add(pos);
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
    public static String mirar_qui_guanya(){
        List topFila = Arrays.asList(1,2,3);
        List midFila = Arrays.asList(4,5,6);
        List botFila = Arrays.asList(7,8,9);
        List leftColumna = Arrays.asList(1,4,7);
        List midColumna = Arrays.asList(2,5,8);
        List rightColumna = Arrays.asList(3,6,9);
        List diagonal1 = Arrays.asList(1,5,9);
        List diagonal2= Arrays.asList(7,5,3);

        List<List>condicions_per_guanyar= new ArrayList<List>();
        condicions_per_guanyar.add(topFila);
        condicions_per_guanyar.add(midFila);
        condicions_per_guanyar.add(botFila);
        condicions_per_guanyar.add(leftColumna);
        condicions_per_guanyar.add(midColumna);
        condicions_per_guanyar.add(rightColumna);
        condicions_per_guanyar.add(diagonal2);
        condicions_per_guanyar.add(diagonal1);

        for(List l : condicions_per_guanyar){
            if(player1Positions.containsAll(l)){
                return "Guanya el Jugador 1 !!";
            }else if (player2Positions.containsAll(l)){
                return "Guanya el Jugador 2 !!";
            }else if((player1Positions.size() + player2Positions.size()) == 9){
                return "Empat !";
            }
        }

        return "";
    }
}
