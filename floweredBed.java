public class floweredBed {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = n; // Number of flowers to plant
        int length = flowerbed.length;

        for (int i = 0; i < length && count > 0; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == length - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; // Plant a flower
                    count--; // Decrease the count of flowers to plant
                }
            }
        }

        return count == 0;
    }

    
    public static void main(String[] args) {
        int[]  flowerbed = {1,0,0,0,1,0,0};
        int  n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
