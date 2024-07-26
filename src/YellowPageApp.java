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
        List<String> names = new ArrayList<>();
        List<String> phonesNumbers = new ArrayList<>();

        boolean control = true;
        while (control){
            int menu = scanner("Digite: \n 1 para adicionar nome e telefone \n 2 para buscar por nome \n 0 para sair").nextInt();
            if(menu == 1) {
                String nome = scanner("Digite o nome e sobrenome").nextLine();
                if (!names.contains(nome)) names.add(nome);

                String phoneNumber = scanner("Digite o digite o telefone").next();
                phoneNumber = phoneNumber.replaceAll("-", "");

                if (phoneNumber.length() == 11) {
                    if (!phonesNumbers.contains(phoneNumber)) {
                        phonesNumbers.add(phoneNumber);
                    }
                } else {
                    System.out.println("Numero invalido");
                }
            } else if (menu == 2){
                String nameToFind = scanner("Digite um nome para buscar").nextLine();
                for(String listName : names){
                    if (nameToFind.equalsIgnoreCase(listName)){
                        int index = names.indexOf(listName);
                        String phone = phonesNumbers.get(index);

                        System.out.println(listName+": "+phone);
                    }
                }
            }else if (menu == 0){
                control = false;
            }
        }
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
