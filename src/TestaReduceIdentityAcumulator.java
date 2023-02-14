import java.util.stream.Stream;

public class TestaReduceIdentityAcumulator {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("c", "a", "s", "a");
        String palavra = stream.reduce("", (s, c) -> s + c);
        System.out.println(palavra);
    }
}
