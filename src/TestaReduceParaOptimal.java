import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class TestaReduceParaOptimal {
    public static void main(String[] args){
        BinaryOperator<Integer> operador = (a, b) -> a * b;
        Stream<Integer> vazia = Stream.empty();
        Stream<Integer> umElemento = Stream.of(2);
        Stream<Integer> tresElementos = Stream.of(2, 4, 6);
        
        vazia.reduce(operador).ifPresent(System.out::println);         // nenhuma saída
        umElemento.reduce(operador).ifPresent(System.out::println);    // 2
        tresElementos.reduce(operador).ifPresent(System.out::println); // 48 
    }
}
