import jc.entities.*;

public class Main
{

    public static void main(String[] args)
    {
        Flyable[] elements = {new Ship(), new Moto()};

        for(Flyable e : elements)
            e.fly();



        /*
        Vehicle[] someVehicles = new Vehicle[3];

        someVehicles[0] = new Ship();
        someVehicles[1] = new Ship();
        someVehicles[2] = new Glider();

        Building[] someBuildings = new Building[2];

        someBuildings[0] = new Cottage();
        someBuildings[1] = new Cottage();

        someVehicles[0].moveXY(2,1);
        someVehicles[1].moveXY(32,21);
        */
    }
}