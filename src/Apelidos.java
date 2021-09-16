import java.util.HashMap;
import java.util.Map;

public class Apelidos {

    public static void main(String[] args) {
        Map<String, String[]> dicionarioApelidos = new HashMap<>();

        String[] listaApelidos = {"Juan", "Maromba", "Fissura"};
        dicionarioApelidos.put("João", listaApelidos);

        String[] listaApelidos2 = {"Night Watch", "Bruce Wayne", "Tampinha"};
        dicionarioApelidos.put("Miguel", listaApelidos2);

        String[] listaApelidos3 = {"Wonder Woman", "Mary", "Marilene"};
        dicionarioApelidos.put("Maria", listaApelidos3);

        String[] listaApelidos4 = {"Lukinha", "Jorge", "George"};
        dicionarioApelidos.put("Lucas", listaApelidos4);

        for(String chave : dicionarioApelidos.keySet()){
            //guardando o array de apelidos pra chave atual
            String[] arrayApelidos = dicionarioApelidos.get(chave);
            //imprimindo o valor da chave
            System.out.print(chave + ": ");
            //percorrendo todos os elementos do array e printando
            for(String apelido: arrayApelidos){
                System.out.print(apelido + "  ");
            }
            System.out.println("");
        }
    }

}
