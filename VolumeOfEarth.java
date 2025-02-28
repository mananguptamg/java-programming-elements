class VolumeOfEarth {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Conversion factor: 1 km = 0.621371 miles
        double conversionFactor = 0.621371;
        
        // Compute the volume using the sphere volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert radius to miles
        double radiusMiles = radiusKm * conversionFactor;
        
        // Compute the volume in cubic miles
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Display the result using a single print statement
        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 + 
            " and in cubic miles is " + volumeMiles3
        );
    }
}
