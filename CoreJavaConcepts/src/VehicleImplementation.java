
public class VehicleImplementation implements Vehicle 
{

	private final String brand;

    public VehicleImplementation(String brand) 
    {
        this.brand = brand;
    }

    @Override
    public String getBrand() //interface method
    {
        return brand;
    }

    @Override
    public String speedUp()   //interface method
    {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() //interface method
    {
        return "The car is slowing down.";
    }

}
