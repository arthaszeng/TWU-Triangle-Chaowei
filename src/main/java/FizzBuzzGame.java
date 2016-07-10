public class FizzBuzzGame {
    private int maxNum = 0;

    public FizzBuzzGame(int maxNum) {
        if (maxNum <= 0) {
            System.out.println("Wrong input");
        }
        this.maxNum = maxNum;
    }


    public String normalPrint() {
        String result = "";
        for (int i = 1; i <= maxNum; i++) {
            result += i + "\n";
        }
        return result;
    }

    public String FizzPrint(String context) {
        String result = "";
        for (int i = 1; i <= maxNum; i++) {
            if (i % 3 == 0) {
                result += context + "\n";
            } else {
                result += i + "\n";
            }
        }
        return result;
    }

    public String BuzzPrint(String context) {
        String result = "";
        for (int i = 1; i <= maxNum; i++) {
            if (i % 5 == 0) {
                result += context + "\n";
            } else {
                result += i + "\n";
            }
        }
        return result;
    }

    public String FizzBuzzPrint(String content) {
        String result = "";
        for (int i = 1; i <= maxNum; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result += content + "\n";
            } else if (i % 5 == 0) {
                result += "Buzz" + "\n";
            } else if (i % 3 == 0) {
                result += "Fizz" + "\n";
            } else {
                result += i + "\n";
            }
        }
        return result;
    }
}
