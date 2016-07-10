import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

class Drawer {
    static String myname = "Chaowei";

    String drawHorizon(int n, int max) {
        String result = "";
        if (n <= 0 || max < n) {
            return null;
        }
        for (int i = 0; i < max; i++) {
            if (i >= (max - n)/2 && i <= (max + n - 2)/2) {
                result += "*";
            } else {
                result += " ";
            }
        }
        result += "\n";
        return result;
    }

    String drawVertical(int line) {
        String result = "";
        for (int i = 0; i < line; i++) {
            result += drawHorizon(1, 1);
        }
        return result;
    }

    String drawTriangle(int line) {
        String result = "";
        for (int i = 0; i < line; i++) {
            result += drawHorizon(i + 1, i + 1);
        }
        return result;
    }

    String drawIsosceles(int line) {
        String result = "";
        int maxAsteNum = 2 * line - 1;
        for (int i = 1; i <= line; i++) {
            result += drawHorizon(2 * i - 1, maxAsteNum);
        }
        return result;
    }

    String drawDiamond(int middleLine) {
        String result = drawIsosceles(middleLine);
        int maxAsteNum = 2 * middleLine - 1;
        for (int i = middleLine - 2; i >= 0; i--) {
            result += drawHorizon(2 * (i + 1) - 1, maxAsteNum);
        }
        return result;
    }


    public String drawDiamondWithName(int middleLine) {
        String result = "";
        int maxAsteNum = 2 * middleLine - 1;
        for (int i = 1; i < middleLine; i++) {
            result += drawHorizon(2 * i - 1, maxAsteNum);
        }
        result += myname + "\n";
        for (int i = middleLine - 2; i >= 0; i--) {
            result += drawHorizon(2 * (i + 1) - 1, maxAsteNum);
        }
        return result;
    }
}
