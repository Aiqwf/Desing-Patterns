package BridgePattern;

public class Square extends Shape{
    protected String color;
    @Override
    public void draw() {
        System.out.println("Square Drawing "+" " + color );
    }
}
