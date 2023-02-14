import java.util.Optional;
import java.util.stream.Stream;

public class TestaMinMax {
    public static void main(String[] args){
        Stream<String> s = Stream.of("casa", "comida", "carro");
        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); // casa

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
    }
}
