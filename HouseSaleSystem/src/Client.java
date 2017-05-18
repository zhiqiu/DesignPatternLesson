import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by chenql on 2016/10/19.
 */

public class Client {
    /**
     * Main function, user Interface
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        while (true) {
            // handle user input, get house size and decoration level
            System.out.println("Please input house size (1: 40 m*m / 2: 80 m*m / 3: 100m*m):");
            String houseSize = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Please input decoration level (1: Rough House / 2: Ordinary Decoration / 3: Exquisite decoration):");
            String decorationLevel = new BufferedReader(new InputStreamReader(System.in)).readLine();

            // decorate the house
            House house = new ConcreteHouse();
            HouseSize hs = new HouseSize(house, Integer.parseInt(houseSize));
            HouseDecorationLevel hdl = new HouseDecorationLevel(hs, Integer.parseInt(decorationLevel));

            // if the house is not "Rough House", decorate style
            if(decorationLevel.equals("2")|decorationLevel.equals("3")){
                System.out.println("Please input decoration style (1: European / 2: American / 3: Japanese / 4: Chinese):");
                String decorationStyle = new BufferedReader(new InputStreamReader(System.in)).readLine();

                HouseDecorationStyle hds = new HouseDecorationStyle(hdl, Integer.parseInt(decorationStyle));
                System.out.println("The house decoration is: " + hds.getDecoration());
                System.out.println("The total price is: " + hds.getPrice());
            }
            else if(decorationLevel.equals("1")) {
                System.out.println("The house decoration is: " + hdl.getDecoration());
                System.out.println("The total price is: " + hdl.getPrice());
            }
            System.out.println("------");
        }
    }
}
