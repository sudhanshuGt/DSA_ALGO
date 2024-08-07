class newCodeEx {

    public static int reverseNum(int num){
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(123));
    }
}