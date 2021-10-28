package BridgePattern;

public class Circle extends  Shape{
    protected String color;
    @Override
    public void draw() {
        System.out.println("Drawing Circle"  + this.color);
    }
}
