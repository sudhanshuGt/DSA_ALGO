public interface newInterfaceExampleTwo {
    public int a = 2;
    void hello();

    

    default void hellowTwo(){
        System.out.println(a);
    }
}
