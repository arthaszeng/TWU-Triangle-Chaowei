import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeFactors {
    List<Integer> generate (int num) {
        List<Integer> result = new ArrayList<>();

        if (num < 3) {
            return null;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                if ( isPrime(i)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if ( num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
