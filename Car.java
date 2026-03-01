class Model { // Inherited class from Car

    // Think inhertitance as receive and send

    // inherited= receive
    
    // being inherited = send/ received to
    
    protected String carName; 
    // encapsulated and have access in the same package and subclasses
    // N.B: class "Model" is a subclass of "Car" super-class
    private int carAge = 25;

    // private ensures that this data is only accessible inside here.
    //N.B: by getter method it can be accessed from another class file(super/sub)

    public int getCarAge() {
        return carAge;
    }

    
    public String getCarName() {
        return carName;
    }
    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public void  honk() {
        System.out.println("pip pip!");
    }
}

class PayCheck extends Car {
   protected String customerName = "Safa";
   private int pay = 2000000;

   public int getPay() {
       return pay;
   }
}
class Car extends Model { // this is the super class that has sub-class access
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.carName = "Toyota Axio";
        System.out.println(newCar.getCarName());
        newCar.setCarAge(30);
        System.out.println(newCar.getCarAge());

        PayCheck p1 = new PayCheck();
        System.out.println(p1.customerName);
        System.out.println(p1.getPay());
    }
}



