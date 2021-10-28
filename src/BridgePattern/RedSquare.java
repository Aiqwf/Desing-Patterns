package BridgePattern;

public class RedSquare extends Square{
    @Override
    public void draw() {
        super.color="red";
        super.draw();
    }
}
