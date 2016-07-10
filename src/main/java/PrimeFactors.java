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
                for (Iterator iterator= result.iterator(); iterator.hasNext(); iterator.next()) {
                    if (i % Integer.getInteger(iterator.toString()) == 0)
                        break;
                    result.add(Integer.toString(i));
                }
            }
        }
        return result;
    }
}
