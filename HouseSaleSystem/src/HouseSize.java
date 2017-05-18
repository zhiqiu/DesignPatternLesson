/**
 * Created by chenql on 2016/10/19.
 */
public class HouseSize extends HouseDecorator{
    /**
     *
     * @param house
     * @param size
     */
    public HouseSize(House house, int size){
        this.house = house;
        String decoration;
        double price;
        switch(size){
            case 1: decoration = "40 m*m";  price = 600000;     break;
            case 2: decoration = "80 m*m";  price = 1000000;    break;
            case 3: decoration = "100 m*m"; price = 2000000;    break;
            default: decoration = "";       price = 0;          break;
        }
        this.decoration = house.getDecoration() + ", " + decoration;
        this.price = house.getPrice() + price;
    }
}
