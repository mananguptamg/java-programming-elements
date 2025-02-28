public class DistanceConversion {
    public static void main(String[] args) {
        // Given distance in kilometers
        double distanceInKm = 10.8;
        
        // Conversion factor (1 km = 1.6 miles)
        double conversionFactor = 1.6;
        
        // Convert kilometers to miles
        double distanceInMiles = distanceInKm / conversionFactor;
        
        // Display the result
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
