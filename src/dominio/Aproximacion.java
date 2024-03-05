package dominio;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Aproximacion {
    public static double aproximarPi(int iteraciones){
        return 4 * IntStream.range(0, iteraciones)
                .mapToDouble(i -> {
                    double x = ThreadLocalRandom.current().nextDouble();
                    double y = ThreadLocalRandom.current().nextDouble();
                    return (x * x + y * y <= 1) ? 1 : 0;
                })
                .average()
                .orElse(0);  

}

}
