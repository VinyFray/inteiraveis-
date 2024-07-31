import java.util.*;

public class YellowPageApp {
    public static void main(String[] args) {
//        Faça um programa que permita cadastrar nomes com sobrenome e números de telefones ok
//        - O programa não deve armazenar nomes repetidos e nem numeros repetidos ok
//        - o programa não pode aceitar numeros de telefone sem o dd ok
//
//        Melhoria do programa, faça com que seja possivel buscar o numero de telefone a partir do nome completo da
//        pessoa, desconsiderando as letras maiúsculas
//
        // BUG 1 - Quando um numero de telefone é digitado errado o Nome é cadastrado e o numero não. Causando problemas
        // de busca pelo indice
        // exemplo: [Vinicius, Marco, Maria] [123, 456] o numero 456 na verdade é da Maria, porém ficou com indice do
        // Marco, pois Marco digitou numero invalido
        // BUG 2 - Nomes cadastrados com espaço no final não são encontrados
        // BUG 3 - Nomes não devem existir sem numero de telefone.
        // BUG 4 - Lista completa da errro de index não encontrado

        Map<String, String> yellowPage = new HashMap<>();

        boolean control = true;
        while (control){
            showMenu();
            int menu = scanner("").nextInt();
            if(menu == 1) {
                addDatas(yellowPage);
            } else if (menu == 2){
                findData(yellowPage);
            }else if (menu == 0){
                control = false;
            } else if (menu == 3) {
                showAllDatas(yellowPage);
            }
        }
    }

    public static void showMenu(){
        System.out.println("Digite: " +
                "\n 1 para adicionar nome e telefone " +
                "\n 2 para buscar por nome " +
                "\n 0 para sair " +
                "\n 3 para ver lista completa");
    }

    public static void addDatas(Map<String, String> yellowPage){
        String nome = scanner("Digite o nome e sobrenome").nextLine();
        String phoneNumber = scanner("Digite o digite o telefone").next();
        phoneNumber = phoneNumber.replaceAll("-", "");

        if (phoneNumber.length() == 11) {
            yellowPage.put(nome, phoneNumber);
        } else {
            System.out.println("Numero invalido");
        }
    }

    public static void findData(Map<String, String> yellowPage){
        String nameToFind = scanner("Digite um nome para buscar").nextLine();
        if(yellowPage.containsKey(nameToFind)){
            System.out.println(nameToFind+": "+yellowPage.get(nameToFind));
        }
    }

    public static void showAllDatas(Map<String, String> yellowPage){
        System.out.println(yellowPage);
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
