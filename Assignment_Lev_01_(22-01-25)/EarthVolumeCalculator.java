package BL;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Define constants
        double radiusKm = 6378; // Radius of Earth in kilometers
        double kmToMiles = 0.621371; // Conversion factor from kilometers to miles
        double pi = Math.PI;

        // Calculate the volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        // Output the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}
