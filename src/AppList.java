import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        boolean execute = true;
        while (execute){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um nome");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Digite 1 para sair e sortear ou 2 para continuar adicionando nomes");
            int control = scanner.nextInt();
            if(control == 1 ) execute = false;
        }

        int numeroAleatorio = (int)(Math.random()*nomes.size());

        //Faça um programa que pegue um nome aleatorio dentro de uma lista.
        //Melhoria do programa, permita que o usuario digite os nomes a serem sorteados

        System.out.println(nomes.get(numeroAleatorio));
    }


}
