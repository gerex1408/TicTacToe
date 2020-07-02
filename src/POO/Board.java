package POO;

public class Board {
    char[][] taulell;
    public Board(){
        taulell= new char[][]{{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
    }
    public void dibuixarTaulell(){
        for(char[] fila: taulell){
            for(char c: fila){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public void posicionarSimbol(int pos, String user,Player jugador){
        char simbol= ' ';
        if(user.equals("Jugador_1")){
            simbol='X';
            jugador.playerPositions.add(pos);
        }
        else if(user.equals("Jugador_2")){
            simbol='O';
            jugador.playerPositions.add(pos);
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
