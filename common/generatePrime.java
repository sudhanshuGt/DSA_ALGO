public class generatePrime {
    public static void main(String[] args) {
        int n = 100;

        int s_ = 1;

        for(int i = 1; i < n; i++){
            if (isPrime(i)) {
                System.out.println(s_ + " = " + i);
                s_++;
            }
        }
    }

    public static boolean isPrime(int n){
        for(int j = 2; j < n; j++){
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
