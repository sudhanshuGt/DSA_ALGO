public class findSqrt {

    public static double squareRoot(double x) {
        double guess = x / 2.0;
        double epsilon = 1e-10;  

        while (Math.abs(guess * guess - x) > epsilon) {
            System.out.println(guess);
            guess = (guess + x / guess) / 2.0;
        }

        return guess;
    }


    public static void main(String[] args) {
        System.out.println(squareRoot(8d));
    }
}
