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

        jugador.playerPositions.add(pos);

        int i=1;
        int j=0, z=0;
        boolean trobat=false;

        while (i<9 && !trobat){
            if(pos==i) {
                trobat=true;
                taulell[j][z] = jugador.simbol;
            }
            if(z<4){
                z=z+2;
            }
            else{
                j=j+2;
                z=0;
            }
            i++;
        }
    }
     /*switch(pos){
        case 1:
            taulell[0][0]=jugador.simbol;
            break;
        case 2:
            taulell[0][2]=jugador.simbol;
            break;
        case 3:
            taulell[0][4]=jugador.simbol;
            break;
        case 4:
            taulell[2][0]=jugador.simbol;
            break;
        case 5:
            taulell[2][2]=jugador.simbol;
            break;
        case 6:
            taulell[2][4]=jugador.simbol;
            break;
        case 7:
            taulell[4][0]=jugador.simbol;
            break;
        case 8:
            taulell[4][2]=jugador.simbol;
            break;
        case 9:
            taulell[4][4]=jugador.simbol;
            break;
        default:
            break;
    }

      */
}
