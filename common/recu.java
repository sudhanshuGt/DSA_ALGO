
public class recu {

    public static int r_ = 0;
    public static int printRec(int n) {
        if (n > 10) return r_;
        r_ += n;
        printRec(n + 1);
        return r_;
    }

    public static void main(String[] args) {
        System.out.println(printRec(1));;

        int n = 0;
        for(int i = 1; i <= 10; i++){
            n += i;
        }

        System.out.println(n);
    }
}
