public class strongPassword {
    public static void main(String[] args) {
        
        String s = "2bbbb";
        System.out.println(minimumNumber(s.length(), s));
    }

    public static int minimumNumber(int n, String password) {
        int isLowerCase = 0, isUpperCase = 0, isSpecialChar =0, isContainDigit = 0;
        int requiredChar = 0;
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                isLowerCase = 1; 
            }else if(Character.isUpperCase(c)){ 
                isUpperCase = 1;
            }else if(Character.isDigit(c)){
                isContainDigit = 1; 
            }else if(!Character.isLetterOrDigit(c)){ 
                isSpecialChar = 1;
            } 
        }

        
        int checkMark = Math.abs(( isSpecialChar + isUpperCase + isLowerCase + isContainDigit));
        System.out.println("CheckMark = " + checkMark  + " len = "  + password.length());
        
        if(checkMark >= 4 && password.length() < 6){
            System.out.println("hrer 1");
            requiredChar = 6 - password.length();
        }else if (checkMark < 4 && password.length() < 6) {
            System.out.println("here 2 " + (4-checkMark) + " " + (6-password.length()));
            requiredChar = (4-checkMark) + (6-password.length());
        }

        return requiredChar;
    
  }

}
