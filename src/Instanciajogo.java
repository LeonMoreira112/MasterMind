import java.util.*;

public class Instanciajogo {


    public int[] gerarSenha(int[] senha){
        Random rand = new Random();
        for(int i=0; i<senha.length; i++){
            senha[i] = rand.nextInt(6)+1;
            System.out.println(senha[i]);
        }
        return senha;
    } 

    public int[] tentativas(int[] tentativas){
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<tentativas.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número");
            tentativas[i] = scan.nextInt();
        }
        scan.close();
        return tentativas;
    }

    public int compararCorretos(int[] senha, int[] tentativas){
        int corretos=0;
        for(int i=0; i<senha.length; i++){
            if(tentativas[i] == senha[i] ){
                corretos++;
            }
        }
        return corretos;
    }

    public int compararDeslocados(int[] senha, int[] tentativas){
        int deslocados=0;
        for(int i=0; i<senha.length; i++){
            if((tentativas[0] == senha[i]) && (tentativas[0] != senha[0])){
                deslocados++;
            }
            else if((tentativas[1] == senha[i]) && (tentativas[1] != senha[1])){
                deslocados++;
            }
            else if((tentativas[2] == senha[i]) && (tentativas[2] != senha[2])){
                deslocados++;
            }
            else if((tentativas[3] == senha[i]) && (tentativas[3] != senha[3])){
                deslocados++;
            }
        }
        return deslocados;
    }

}
