import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by b204 on 2016/10/18.
 */
public class ProxyCarOEM extends CarOEM{
    private CarOEM oem;
    private AccessValidator accessValidator;

    @Override
    public void produceCar(String userID, String carType, String pipelineType, String attribute) {
        if(checkAccess(userID)){
            // 国产和进口
            if(pipelineType.equals("foreign")){
                oem = new ForeignCarOEM();
            }
            else if(pipelineType.equals("domestic")){
                oem = new DomesticCarOEM();
            }
            oem.produceCar(userID, carType, pipelineType, attribute);

            // 高级用户和普通用户
            if(isAdmin(userID)){
                printCarNumber();
                printFiniedDate();
            }
            else{
                printFiniedDate();
            }
        }
        else{
            System.out.println("Invalid User!");
        }
    }

    private boolean checkAccess(String userID){
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userID);
    }

    private boolean isAdmin(String userID){
        accessValidator = new AccessValidator();
        return accessValidator.isAdmin(userID);
    }

    private void printCarNumber(){
        int carNumber = oem.car.getNumber();
        String carType = oem.car.getName();
        System.out.println("This month " + carType + "car number is: " + carNumber);
    }
    private void printFiniedDate(){
        Date date = oem.car.getDate();
        String carType = oem.car.getName();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("This " + carType + "car finished date is: " + df.format(date));
    }

}
