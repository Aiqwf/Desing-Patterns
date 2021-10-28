package BuilderPattern;

public class Car {
   private CarbonMaterial carbonMaterial;
   private MetalMaterlal metalMaterlal;
   private Motor motor;
   private Tires tires;
   private  SesGuclendirici sesGuclendirici;
   private CupHolder cupHolder;

   public Car() {

   }

   public Car(CarbonMaterial carbonMaterial, MetalMaterlal metalMaterlal, Motor motor, Tires tires, SesGuclendirici sesGuclendirici, CupHolder cupHolder) {
      this.carbonMaterial = carbonMaterial;
      this.metalMaterlal = metalMaterlal;
      this.motor = motor;
      this.tires = tires;
      this.sesGuclendirici = sesGuclendirici;
      this.cupHolder = cupHolder;
   }

   public Car setCarbonMaterial(CarbonMaterial carbonMaterial) {
      this.carbonMaterial = carbonMaterial;
      return this;
   }

   public Car setMetalMaterlal(MetalMaterlal metalMaterlal) {
      this.metalMaterlal = metalMaterlal;
      return this;
   }

   public Car setMotor(Motor motor) {
      this.motor = motor;
      return this;
   }

   public Car setTires(Tires tires) {
      this.tires = tires;
   return this;
   }

   public Car setSesGuclendirici(SesGuclendirici sesGuclendirici) {
      this.sesGuclendirici = sesGuclendirici;
   return this;
   }

   public Car setCupHolder(CupHolder cupHolder) {
      this.cupHolder = cupHolder;
   return  this;
   }

   public Car buildCar() {
      return new Car(carbonMaterial,metalMaterlal,motor,tires,sesGuclendirici,cupHolder);
   }

   @Override
   public String toString() {
      return "Car{" +
              "carbonMaterial=" + carbonMaterial +
              ", metalMaterlal=" + metalMaterlal +
              ", motor=" + motor +
              ", tires=" + tires +
              ", sesGuclendirici=" + sesGuclendirici +
              ", cupHolder=" + cupHolder +
              '}';
   }
}
