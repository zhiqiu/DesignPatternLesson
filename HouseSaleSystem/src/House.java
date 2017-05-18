/**
 * Created by chenql on 2016/10/19.
 */
public abstract class House {
    protected double price;
    protected String decoration;

    /**
     *
     * @return price of the house
     */
    public double getPrice(){
        return price;
    }

    /**
     *
     * @return decoration description of the house
     */
    public String getDecoration(){
        return decoration;
    }
}
