package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    ArrayList<Integer> playerPositions = new ArrayList<Integer>();

    public int Posicionar(Scanner scan){
        int pos = scan.nextInt();
        return pos;
    }
    public void comprovarPosicio(Player jugador,int pos,Scanner scan){
        while(playerPositions.contains(pos) || jugador.playerPositions.contains(pos)){
            System.out.println("Canvia de posicio, aquesta ja esta ocupada !");
            pos=Posicionar(scan);
        }
    }

}
