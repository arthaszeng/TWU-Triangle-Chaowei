import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeFactors {
    List<String> generate(int n) {
        if (n <= 3) {
            return null;
        }
        List<String> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                List<String> Buff = generate(i);
                result = Buff;
            }
        }
        return result;
    }
}
