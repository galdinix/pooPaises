import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Paises[] pais = new Paises[6];
        String nome;
        int populacao;
        int maiorPop =0;
        String nomePaisMaior = null;

        for (int i =0; i<6; i++){
            System.out.println("Informe o pais:");
            nome = inp.next();
            System.out.println("Informe a população:");
            populacao = inp.nextInt();
            pais[i] = new Paises (nome, populacao);
//            System.out.println(pais[i].getNome());
//            System.out.println(pais[i].getPopulacao());
            if(populacao>maiorPop){
                maiorPop = populacao;
                nomePaisMaior = nome;
            }
        }
        System.out.println("O pais " + nomePaisMaior + "possui a maior população " + maiorPop);

    }
}