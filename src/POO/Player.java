package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    char simbol;

    public Player(String jugador){
        if(jugador.equals("Jugador_1")){
            simbol='X';
        }
        else simbol='O';
    }

    public int Posicionar(Scanner scan){
        int pos = scan.nextInt();
        return pos;
    }
    public int comprovarPosicio(Player jugador,int pos,Scanner scan){
        while(playerPositions.contains(pos) || jugador.playerPositions.contains(pos)){
            System.out.println("Canvia de posicio, aquesta ja esta ocupada !");
            pos=Posicionar(scan);
        }
        return pos;
    }

}
