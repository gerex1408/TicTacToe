package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    Board taulell = new Board();
    Player jugador1 = new Player("Jugador_1");
    Player jugador2 = new Player("Jugador_2");
    public void start(){
        taulell.dibuixarTaulell();
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Jugador 1: Entra la posicio (1-9):");
            int pos1= jugador1.Posicionar(scan);
            jugador1.comprovarPosicio(jugador2,pos1,scan);
            taulell.posicionarSimbol(pos1,"Jugador_1",jugador1);
            taulell.dibuixarTaulell();
            String guanyador= mirarQuiGuanya(jugador2,jugador1);
            if(guanyador.length()>0){
                System.out.println((guanyador));
                break;
            }
            System.out.println("Jugador 2: Entra la posicio (1-9):");
            int pos2= jugador2.Posicionar(scan);
            jugador2.comprovarPosicio(jugador1,pos2,scan);
            taulell.posicionarSimbol(pos2,"Jugador_2",jugador2);
            taulell.dibuixarTaulell();
            guanyador=mirarQuiGuanya(jugador2,jugador1);
            if(guanyador.length()>0){
                System.out.println((guanyador));
                break;
            }
        }
    }
    public String mirarQuiGuanya(Player jugador2, Player jugador1){
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
            if(jugador1.playerPositions.containsAll(l)){
                return "Guanya el Jugador 1 !!";
            }else if (jugador2.playerPositions.containsAll(l)){
                return "Guanya el Jugador 2 !!";
            }else if((jugador1.playerPositions.size() + jugador2.playerPositions.size()) == 9){
                return "Empat !";
            }
        }

        return "";
    }
}

