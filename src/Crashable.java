/**
 * Created by taoLen on 4/27/2018.
 */
public abstract class Crashable {
    boolean carDrivable = true;
    public void youCrashed(){
        this.carDrivable = false;
    }
    public abstract void setCarStr(int carStr);
    public abstract int getCatStr();

}
