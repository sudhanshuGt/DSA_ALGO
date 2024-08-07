public class secondLarge {
    public static void main(String[] args) {
        int[] arr = {-1, -22, 0 , 2, 2};

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
    
        for(int i = 0 ; i < arr.length; i++){
            if(max < arr[i]){
                sec_max = max;
                max = arr[i];
            }else if(sec_max < arr[i] && arr[i] != max){
                sec_max = arr[i];
            }
        }

        System.out.println(max + " " + sec_max);
    }
}
