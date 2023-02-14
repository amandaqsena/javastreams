import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestaMetodosMatch {
    public static void main(String[] args){
        var lista = List.of("mala", "1", "casa");
        Stream<String> infinita = Stream.generate(() -> "casa");
        Predicate<String> predicado = x -> Character.isLetter(x.charAt(0));
        
        System.out.println(lista.stream().anyMatch(predicado));  // true
        System.out.println(lista.stream().allMatch(predicado));  // false
        System.out.println(lista.stream().noneMatch(predicado)); // false
        System.out.println(infinita.anyMatch(predicado));       // true
    }
}
