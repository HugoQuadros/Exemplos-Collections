import java.util.HashSet;
import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for(Integer valor: conjuntoDeInteiros){
            soma += valor;
        }
        System.out.println("Valor da soma: " + soma);
    }

    public static void main(String[] args) {

        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(3);
        inteiros.add(8);
        inteiros.add(14);
        inteiros.add(19);
        inteiros.add(6);

        Prova prova1 = new Prova();
        prova1.somaTotal(inteiros);

    }

}
