import java.util.List;
import java.util.stream.Stream;

public class TestaStreamsFinitas {
    public static void main(String[] args){

        // Gerando streams finitas

        Stream<String> streamVazia = Stream.empty();    // #elementos 0
        Stream<Integer> unicoElemento = Stream.of(1);   // #elementos 1
        Stream<Integer> usandoVarrags = Stream.of(1, 2, 3); // #elementos 3
        var lista = List.of("a", "b", "c");
        Stream<String> streamDaLista = lista.stream();
        
        // Uso do iterate() gerando uma stream finita
        Stream<Integer> numerosParesMenores100 = Stream.iterate(
            2,                // semente
            n -> n < 100,     // Predicate de verificação
            n -> n + 2);      // UnaryOperator para retornar o próximo valor

        Stream<String> s = Stream.of("casa", "carro", "comida");
        System.out.println(s.count());   // 3

    }
}
