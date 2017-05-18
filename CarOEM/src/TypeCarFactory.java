/**
 * Created by chenql on 2016/10/18.
 */
public class TypeCarFactory {
    public static TypeCar createTypeCar(String type){
        TypeCar car = null;
        switch(type){
            case "Benz":        car = new BenzCar(type);    break;
            case "BMW":         car = new BMWCar(type);     break;
            case "Audi":        car = new AudiCar(type);    break;
            case "Toyota":      car = new ToyotaCar(type);  break;
            case "HyundaiCar":  car = new HyundaiCar(type); break;
            default:            car = null;                 break;
        }
        return car;
    }
}
