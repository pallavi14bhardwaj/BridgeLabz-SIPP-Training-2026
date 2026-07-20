package programmingelements.level1;
//Create a program to convert the distance of 10.8 kilometers to miles.
//        Hint: 1 km = 1.6 miles
//I/P => NONE
//O/P => The distance  ___ km in miles is ___

public class KilometerToMilesConversion {
    public static void main(String[] args) {

        double distanceInKm = 10.8;
        double kilometerPerMile = 1.6;

        double distanceInMiles = distanceInKm / kilometerPerMile;

        System.out.println("The distance " + distanceInKm +
                " km in miles is " + distanceInMiles);
    }
}
