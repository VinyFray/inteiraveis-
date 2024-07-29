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

        List<String> names = new ArrayList<>();
        List<String> phonesNumbers = new ArrayList<>();

        boolean control = true;
        while (control){
            showMenu();
            int menu = scanner("").nextInt();
            if(menu == 1) {
                addDatas(names, phonesNumbers);
            } else if (menu == 2){
                findData(names, phonesNumbers);
            }else if (menu == 0){
                control = false;
            } else if (menu == 3) {
                showAllDatas(phonesNumbers, names);
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

    public static void addDatas(List<String> names, List<String> phoNumber){
        String nome = scanner("Digite o nome e sobrenome").nextLine();
        if (!names.contains(nome)) names.add(nome);

        String phoneNumber = scanner("Digite o digite o telefone").next();
        phoneNumber = phoneNumber.replaceAll("-", "");

        if (phoneNumber.length() == 11) {
            if (!phoNumber.contains(phoneNumber)) {
                phoNumber.add(phoneNumber);
            }
        } else {
            System.out.println("Numero invalido");
        }
    }

    public static void findData(List<String> names, List<String> phoneNumbers){
        String nameToFind = scanner("Digite um nome para buscar").nextLine();
        for(String listName : names){
            if (nameToFind.equalsIgnoreCase(listName)){
                int index = names.indexOf(listName);
                String phone = phoneNumbers.get(index);

                System.out.println(listName+": "+phone);
            }
        }
    }

    public static void showAllDatas(List<String> phoneNumbers, List<String> names){
        for (String nameList : names){
            System.out.println(nameList+": "+phoneNumbers.get(nameList.indexOf(nameList))+"\n -------------");
        }
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
