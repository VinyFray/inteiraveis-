public class App {
    public static void main(String[] args) {

//         A matriz abaixo representa um grupo de alunos que foram reprovados e aprovados na escola.
//         cada linha/indice repsenta um aluno, para decidir quais alunos vão passar de ano é necessario que
//         ele tenha pelo menos 50% de Aprovação (V) entre as 5 materias;
//         Faça um programa que mostre os nomes de cada um dos alunos aprovados e reprovados.
//         Os indices de cada nome corresponde ao indice de cada linha da matriz

        String[] nomes = {"João", "Ines Brasil", "Zaca", "Munha"};
        String[][] notas = {
                {"V", "F", "V", "F", "V"},
                {"V", "F", "F", "F", "V"},
                {"F", "F", "F", "V", "F"},
                {"F", "V", "V", "F", "V"}
        };

        for(int indice = 0; indice < nomes.length; indice++){
            int contagem = 0;
            String nome = nomes[indice];
            String[] notasEspecificas = notas[indice];
            System.out.println("As notas do "+nome+" são"+"\n"+""
                    +notasEspecificas[0]+" "+notasEspecificas[1]+" "
                    +notasEspecificas[2]+" "+notasEspecificas[3]+" "+notasEspecificas[4]
            );

            for(int indiceNotas = 0; indiceNotas < notasEspecificas.length; indiceNotas++){
                if(notasEspecificas[indiceNotas] == "V"){
                    contagem++;
                }
            }
            System.out.println("Contagem das notas positivas: "+contagem);

            if(contagem*100/5 >= 50){
                System.out.println("Aluno aprovado"+"\n___________________________");
            }else {
                System.out.println("Aluno reprovado"+"\n___________________________");
            }
        }

    }
}