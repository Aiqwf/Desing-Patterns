package Singleton;

public class TestClass {
    public static  String name;

    private TestClass( ) {
        System.out.println("Class Created");
}
private static class innerClass {
    public static final  TestClass test  =new TestClass();
}

public static void  ins(String name) {
       innerClass innerClass = new innerClass();
}



}
