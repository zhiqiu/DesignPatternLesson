import java.util.Date;

/**
 * Created by b204 on 2016/10/18.
 */
public abstract class CarOEM {
    protected TypeCar car;
    public abstract void produceCar(String userID, String carType, String pipelineType, String attribute);
    public Date getCarFinishedDate(){
        return car.date;
    }
}


