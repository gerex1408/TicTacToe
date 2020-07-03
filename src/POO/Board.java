package POO;

public class Board {
    char[][] taulell;
    private int size =3;
    public Board(){
        /*taulell= new char[][]{{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};*/
        taulell = new char[size][size];
    }
    public void inicialitzar_amb_espais(){
        for(int i=0; i<size; i++){
            for(int j=0;j<size;j++){
                taulell[i][j]=' ';
            }
        }
    }
    public void dibuixarTaulell(){
        String separation = "-+-+-";
        int comptador=0;
        for(char[] fila: taulell){
            for(char c: fila){
                System.out.print(c);
                comptador++;
                if(comptador<size) System.out.print('|');
                else comptador=0;
            }
            System.out.println();
            System.out.println(separation);

        }
    }
    public void posicionarSimbol(int pos, String user,Player jugador){

        jugador.playerPositions.add(pos);

        int col = (pos-1) % size;
        int fila = (pos-1) / size;
        taulell[fila][col]=jugador.simbol;

        /*int i=1;
        int j=0, z=0;
        boolean trobat=false;

        while (i<=9 && !trobat){
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

         */
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
