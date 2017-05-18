/**
 * Created by chenql on 2016/10/19.
 */

public class HouseDecorationLevel extends HouseDecorator{
    /**
     *
     * @param house
     * @param decorationLevel
     */
    public HouseDecorationLevel(House house, int decorationLevel){
        this.house = house;
        String decoration;
        double price;
        switch(decorationLevel){
            case 1: decoration = "Rough House";         price = 50000;      break;
            case 2: decoration = "Ordinary Decoration"; price = 200000;     break;
            case 3: decoration = "Exquisite decoration";price = 500000;     break;
            default: decoration = "";                   price = 0;          break;
        }
        this.decoration = house.getDecoration() + ", " + decoration;
        this.price = house.getPrice() + price;
    }
}
