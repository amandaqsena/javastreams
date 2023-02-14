import java.util.stream.Stream;

public class TestaForEach {
    public static void main(String[] args){
        Stream<String> s = Stream.of("casa", "comida", "carro");
        s.forEach(System.out::print); // casacomidacarro
    }
}
