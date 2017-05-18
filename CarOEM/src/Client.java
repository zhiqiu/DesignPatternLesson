import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by b204 on 2016/10/18.
 */
public class Client {
    public static CarOEM oem;

    public static void main(String args[]) throws IOException {
        oem = new ProxyCarOEM();

        while (true) {
            // User Interface
            System.out.println("Please input userID (admin / user)：");
            String userID = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Please input car type (Benz / Audi / BMW / Toyota / Hyundai)：");
            String carType = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Please input pipeline type (domestic / foreign)：");
            String pipelineType = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Please input car attribute (HardShell / Streamlining / HighSpeed / LowPrice / FastStart)：");
            String attribute = new BufferedReader(new InputStreamReader(System.in)).readLine();
            oem.produceCar(userID, carType, pipelineType, attribute);
        }
    }
}
