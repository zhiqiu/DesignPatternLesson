import java.util.Date;

/**
 * Created by chenql on 2016/10/18.
 */

public abstract class TypeCar {
    protected Date date;
    protected String typeName;
    protected String attribute;

    public String getName(){
        return typeName;
    }
    public void setName(String name){
        typeName = name;
    }

    public Date getDate(){
        return date;
    }
    public String getAttribute(){
        return attribute;
    }
    public void setAttribute(String attribute){
        this.attribute = attribute;
    }
    public abstract int getNumber();
    public abstract void setNumber(int num);


}


class BenzCar extends TypeCar{
    private static int number = 0;
    public BenzCar(String name){
        this.typeName = name;
        this.date = new Date();
        number += 1;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
    }

}

class AudiCar extends TypeCar{
    private static int number = 0;
    public AudiCar(String name){
        this.typeName = name;
        this.date = new Date();
        number += 1;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
    }
}


class BMWCar extends TypeCar{
    private static int number = 0;
    public BMWCar(String name){
        this.typeName = name;
        this.date = new Date();
        number += 1;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
    }
}


class ToyotaCar extends TypeCar{
    private static int number = 0;
    public ToyotaCar(String name){
        this.typeName = name;
        this.date = new Date();
        number += 1;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
        this.date = new Date();
    }
}

class HyundaiCar extends TypeCar{
    private static int number = 0;
    public HyundaiCar(String name){
        this.typeName = name;
        this.date = new Date();
        number += 1;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
    }
}