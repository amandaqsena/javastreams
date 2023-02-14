import java.util.stream.Stream;

public class TestaStreamsInfinitas {
    public static void main(String[] args){
        Stream<Double> randomicos = Stream.generate(Math::random);
        Stream<Integer> numerosImpares = Stream.iterate(1, n -> n + 2);

    }
}
