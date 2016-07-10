class FizzBuzzGame {
    private int maxNum = 0;

    FizzBuzzGame(int maxNum) {
        if (maxNum <= 0) {
            System.out.println("Wrong input");
        }
        this.maxNum = maxNum;
    }

    String FizzBuzz(String mode) {
        String result = "";
        for (int i = 1; i <= maxNum; i++) {
            result += CheckOut(i ,mode);
        }
        return result;
    }

    private String CheckOut(int i, String mode) {
        switch (mode.toUpperCase()) {
            case "NORMAL" : {
                return Integer.toString(i) + "\n";
            }
            case "FIZZ" : {
                return i % 3 == 0 ? "Fizz\n" : Integer.toString(i) + "\n";
            }
            case "BUZZ" : {
                return i % 5 == 0 ? "Buzz\n" : Integer.toString(i) + "\n";
            }
            case "FIZZBUZZ" : {
                return i % 5 != 0 ? i % 3 != 0 ? Integer.toString(i) + "\n" : "Fizz\n": i % 3 != 0 ? "Buzz\n" : "FizzBuzz\n";
            }
            default:
                return Integer.toString(i) + "\n";
        }
    }

}
