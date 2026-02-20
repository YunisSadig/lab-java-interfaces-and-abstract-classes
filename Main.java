import Cars.Car;
import Cars.Sedan;
import Cars.Truck;
import Cars.UtilityVehicle;
import IntlistInterface.IntArrayList;
import IntlistInterface.IntList;
import IntlistInterface.IntVector;
import Operations.BdOperating;
import VideoStreamingServices.Movie;
import VideoStreamingServices.TvSeries;
import VideoStreamingServices.Video;

import java.math.BigDecimal;
import java.util.ArrayList;


public class Main {
    public static void main(String [] args){
        BigDecimal db= BigDecimal.valueOf(3.4);
        System.out.println("The result of hundread rounding and returning double is " + BdOperating.hundreadRound(db));
        System.out.println("The result of reversing and rounding is" +BdOperating.reverseAndRound(db));


        ArrayList<Car> inventory = new ArrayList<>();


        inventory.add(new Sedan("123ABC", "Toyota", "Camry", 45000));
        inventory.add(new UtilityVehicle("456DEF", "Jeep", "Wrangler", 30000, true));
        inventory.add(new Truck("789GHI", "Ford", "F-150", 60000, 13000.5));
        inventory.add(new UtilityVehicle("321XYZ", "Subaru", "Outback", 20000, false));
        inventory.add(new Truck("654LMN", "Chevrolet", "Silverado", 55000, 14500));


        System.out.println("===== CAR INVENTORY =====\n");

        for (Car car : inventory) {
            System.out.println(car.getInfo());
            System.out.println("----------------------------");
        }

        ArrayList<Video> library = new ArrayList<>();

        library.add(new Movie("Inception", 148, 8.8));
        library.add(new TvSeries("Breaking Bad", 50, 62));
        library.add(new Movie("The Dark Knight", 152, 9.0));
        library.add(new TvSeries("Friends", 22, 236));

        System.out.println("===== VIDEO LIBRARY =====\n");

        for (Video video : library) {
            System.out.println(video.getInfo());
            System.out.println("---------------------------");
        }

        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 25; i++) {
            list1.add(i);
            list2.add(i);
        }

        System.out.println("IntArrayList element at index 5: " + list1.get(5));
        System.out.println("IntVector element at index 5: " + list2.get(5));
    }
}
