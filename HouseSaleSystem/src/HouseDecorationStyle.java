/**
 * Created by chenql on 2016/10/19.
 */
public class HouseDecorationStyle extends HouseDecorator{
    /**
     *
     * @param house,
     * @param decorationStyle
     */
    public HouseDecorationStyle(House house, int decorationStyle){
        this.house = house;
        String decoration;
        double price;
        switch(decorationStyle){
            case 1: decoration = "European";    price = 600000;     break;
            case 2: decoration = "American";    price = 400000;     break;
            case 3: decoration = "Japanese";    price = 300000;     break;
            case 4: decoration = "Chinese";     price = 200000;     break;
            default: decoration = "";           price = 0;          break;
        }
        this.decoration = house.getDecoration() + ", " + decoration + " style";
        this.price = house.getPrice() + price;
    }
}
