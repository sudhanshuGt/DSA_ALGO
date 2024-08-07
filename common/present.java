import java.util.Scanner;

public class present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int giverIndex = findGiverIndex(p, i);
            System.out.print((giverIndex + 1) + " ");
        }
    }

    private static int findGiverIndex(int[] p, int i) {
        for (int j = 0; j < p.length; j++) {
            if (p[j] == i) {
                return j;
            }
        }
        return -1; // this should never happen since each friend received exactly one gift
    }
}
