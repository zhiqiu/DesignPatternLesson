/**
 * Created by b204 on 2016/10/18.
 */
public class ForeignCarOEM extends CarOEM{
    private String technique = "ForeignTechnique";
    @Override
    public void produceCar(String userID, String carType, String pipelineType, String attribute) {
        car = TypeCarFactory.createTypeCar(carType);
        car.setAttribute(attribute);
        System.out.println("Producing " + carType + "...");
        System.out.println("Using " + technique + "...");
        System.out.println("Setting attribute: " + attribute + "...");
        System.out.println("Finished");
    }
}
