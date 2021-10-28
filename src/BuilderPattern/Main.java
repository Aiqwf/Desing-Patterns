package BuilderPattern;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("newMotor");
Tires tires = new Tires("NewTires");
MetalMaterlal metalMaterlal =new MetalMaterlal("New Metal Material");
        Car car = new Car().setMotor(motor).setTires(tires).setMetalMaterlal(metalMaterlal).buildCar();
        System.out.println(car);

    }

}


