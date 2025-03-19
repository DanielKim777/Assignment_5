/**
 * A class that handles unit conversions.
 * Currently supports mph to kph and kelvin to celsius conversions.
 */
public class UnitConverter {

    // Conversion factor for miles per hour to kilometers per hour
    private static final double MPH_TO_KPH = 1.60934;

    // Offset between kelvin and celsius temperature scales
    private static final double KELVIN_CELSIUS = 273.15;

    /**
     * Converts miles per hour to kilometers per hour
     * 
     * @param mph Speed in miles per hour
     * @return Equivalent speed in kilometers per hour
     */
    public double convertMphToKph(double mph) {
        return mph * MPH_TO_KPH;
    }

    /**
     * Converts temperature in kelvin to celsius
     * 
     * @param kelvin Temperature in kelvin
     * @return Equivalent temperature in celsius
     */
    public double convertKelvinToCelsius(double kelvin) {
        return kelvin - KELVIN_CELSIUS;
    }
}