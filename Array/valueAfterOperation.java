public class valueAfterOperation {

    public static int valueAfterOperationFunc(String[] operations){
        int value = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                value = value - 1;
            }else {
                value = value + 1;
            }
        }


        return value;
    }
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(valueAfterOperationFunc(operations));
    }
}
