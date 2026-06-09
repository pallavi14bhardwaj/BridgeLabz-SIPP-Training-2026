package programmingelements.level1;
//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class EarthVolumeCalculator {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.14159265359;

        double volumeKm =
                (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        double cubicMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + cubicMiles
        );
    }
}
