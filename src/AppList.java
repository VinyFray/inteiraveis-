import java.util.ArrayList;
import java.util.List;

public class AppList {
    public static void main(String[] args) {
        List<String> nomesExemplo = new ArrayList<>();
        nomesExemplo.add("Vinicius");
        nomesExemplo.add("Marco");
        nomesExemplo.add("Juliete");

        List<String> nomesOutroExemplo = List.of("Marco", "Byonce", "Ronaldo");

        List<List<String>> exemplo = new ArrayList<>();
        exemplo.add(List.of("V", "F", "V"));
        exemplo.add(List.of("F", "V", "F"));

        List<List<String>> outroExemplo = List.of(List.of("V", "F", "V"), List.of("F", "V", "F"));


        for (String nome : nomesExemplo){
            System.out.println(nome);
        }

        for(List<String> list : outroExemplo){
            for(String nota : list){
                System.out.println(nota);
            }
        }
    }
}
