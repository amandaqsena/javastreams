import java.util.stream.Stream;

public class TestaFindAnyFindFirst {
    public static void main(String[] args){
        Stream<String> s = Stream.of("casa", "comida", "carro");
        Stream<String> infinita = Stream.generate(() -> "asa");

        s.findFirst().ifPresent(System.out::println);        // casa
        infinita.findAny().ifPresent(System.out::println);   // asa
    }
}
