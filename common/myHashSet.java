import java.util.ArrayList;

public class myHashSet {

 
    public static ArrayList<Integer> hashList = new ArrayList<>();

    public  myHashSet() {
        
    }
    
    public void add(int key) {
        if (!hashList.contains(key)) {
            hashList.add(key);
        }
    }
    
    public  void remove(int key) {
        hashList.remove(key);
    }
    
    public  boolean contains(int key) {
        return hashList.contains(key);
    }

    public void printHash(){
        System.out.println(hashList);
    }

    public static void main(String[] args) {
        myHashSet mHashSet = new myHashSet();

        mHashSet.add(1);
        mHashSet.add(2);
        mHashSet.add(2); 
        mHashSet.add(3);
        mHashSet.add(5);
        System.out.println(mHashSet.contains(2));
        mHashSet.printHash();



    }
}