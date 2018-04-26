/**
 * Created by taoLen on 4/26/2018.
 */
public class Vehicle extends Crashable implements Drivable,Cloneable {
    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;
    @Override
    public int getWheel() {
        return this.numOfWheels;
    }

    @Override
    public void setWheels(int numWheels) {
        this.numOfWheels = numWheels;
    }

    @Override
    public double getSpeed() {
        return theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
        this.theSpeed = speed;
    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public Vehicle() {
    }

    @Override
    public void setCarStr(int carStr) {
        this.carStrength = carStr;

    }

    @Override
    public int getCatStr() {
        return this.carStrength;
    }

    public Object clone(){
        Vehicle car = null;
        try {
            car = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return car;
    }
}
