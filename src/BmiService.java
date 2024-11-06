public class BmiService {
    public int calculate(double height_meters, double weight_kg){
        double index = weight_kg / (height_meters * height_meters);
        return (int)index;
    }
}
