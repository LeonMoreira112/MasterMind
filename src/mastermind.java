
public class mastermind {
    public static void main(String[] args) throws Exception {
        Instanciajogo inst = new Instanciajogo();
        int[] senha = new int[4];
        int[] tentativas = new int[4];
        int corretos=0,deslocados, cont=0;
        boolean loop = true;

        senha = inst.gerarSenha(senha);
        while(loop){
            tentativas = inst.tentativas(tentativas);
            corretos = inst.compararCorretos(senha, tentativas);
            deslocados = inst.compararDeslocados(senha, tentativas);
    


            System.out.println("Dígitos corretos: " + corretos);
            System.out.println("Dígitos deslocados: " + deslocados);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            cont++;
            if(cont == 10){
                System.out.println();
                System.out.println();
                System.out.println("Ops, você perdeu!");
                loop = false;
            }else if(corretos == 4){
                System.out.println();
                System.out.println();
                System.out.println("Parabens, você venceu!");
                loop = false;
            }
        }
    }
 
}