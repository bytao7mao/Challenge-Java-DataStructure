public class Main {
    public static final String DATADIR = "data/";
    static String x = "ss";
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 100.00);

        Object supercar = new Vehicle();
        System.out.println(((Vehicle)supercar).getSpeed());
        Vehicle superTruck = new Vehicle();
        System.out.println(supercar.equals(superTruck));
        //getting location in memory - hashcode
        System.out.println(supercar.hashCode());
        System.out.println(supercar.getClass());
        System.out.println(supercar.getClass().getSuperclass());

        //creating clone
        Vehicle cloneCar = (Vehicle) superTruck.clone();
        cloneCar.setSpeed(300);
        System.out.println(cloneCar.getSpeed());
        

        car.setCarStr(200);
        System.out.println("Strength: " + car.getCatStr());
        System.out.println("Car max speed: " + car.getSpeed());
        System.out.println("Car max speed: " + car.getWheel());
        String.format("Hello World! %s", x);

    }
}
