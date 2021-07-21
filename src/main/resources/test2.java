class math {
    public static int power(int base, int exponent) {
        int limit;
        int powerResult;
        limit = 5;
        powerResult = 1;
        if (base == 1 && exponent < limit)
            powerResult = 1;
        else {
            while (0 < exponent)
            {
                exponent = exponent - 1;
                powerResult = powerResult * base;
            }
        }
        return powerResult;
    }
}

class circle extends shape {
    static int radius;
    static int pie;

    public static int getRadius(int unUsed) {
        return circle.radius;
    }

    public static int area() {
        int result;
        result = math.power(circle.radius, 2);
        result = result * circle.pie;
        return result;
    }

}

public class myApplication {
    public static void main() {
        boolean unUsedBool;
        int area;
        int myInteger;
        unUsedBool = true;
        myInteger = (10 * 20) - 5 + 2;
        myInteger = circle.getRadius(9);
        area = circle.area();

        System.out.println(area);
    }
}