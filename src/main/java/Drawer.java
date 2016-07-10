class Drawer {
    String drawHorizon(int n) {
        String result = "";
        if (n <= 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            result += "*";
        }
        result += "\n";
        return result;
    }

    String drawVertical(int line) {
        String result = "";
        for (int i = 0; i < line; i++) {
            result += drawHorizon(1);
        }
        return result;
    }

    String drawTriangle(int line) {
        String result = "";
        for (int i = 0; i < line; i++) {
            result += drawHorizon(i+1);
        }
        return result;
    }

    String drawIsosceles(int line) {
        String result = "";
        int maxAsteNum = 2 * line - 1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < maxAsteNum; j++) {
                if ((j >= (maxAsteNum - 1)/2 - i) && (j <= (maxAsteNum - 1)/2 + i)) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    String drawDiamond(int middleLine) {
        return null;
    }
}
