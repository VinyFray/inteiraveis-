import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        // Faça um programa que recebe, adiciona e busca nomes de comidas em uma lista.
        // Nenhum nome de comida não pode ter menos de 3 letras ou mais de 15 letras

        List<String> foodNames = new ArrayList<>();
        run(foodNames);

    }

    public static void run(List<String> foodList) {
        boolean control = true;
        while (control) {
            int option = criarScanner(menuBuilder()).nextInt();
            control = executeOption(foodList, option);
        }
    }

    public static boolean executeOption(List<String> foodList, int option) {
        if (option == 1) {
            addFood(foodList, criarScanner("Digite o nome da comida").nextLine());
        } else if (option == 2) {
            String nameFood = findFood(foodList, criarScanner("Digite o nome da comida para buscar").nextLine());
            System.out.println(nameFood);
        } else if (option == 3) {
            return false;
        }

        return true;
    }

    public static String menuBuilder() {
        return "Digite 1 para Adicionar" + "\nDigite 2 para buscar" + "\nDigite 3 para sair";
    }

    public static void addFood(List<String> foodList, String food) {
        if (foodNameValidation(food)) {
            foodList.add(food);
        }
    }

    public static boolean foodNameValidation(String foodName) {
        if (foodName.length() >= 3 && foodName.length() <= 15) {
            return true;
        }

        return false;
    }

    public static String findFood(List<String> foodList, String foodName) {
        for (String food : foodList) {
            if (food.equalsIgnoreCase(foodName)) {
                return food;
            }
        }

        return "Comida não encontrada";
    }

    private static Scanner criarScanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }

}
