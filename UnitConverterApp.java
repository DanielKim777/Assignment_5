/**
 * Main application class for the unit converter.
 */

public class UnitConverterApp {
    private String conversionType; // Stores the selected conversion type
    private double inputValue; // Stores the value to be converted
    private double result; // Stores the conversion result
    private UnitConverter converter = new UnitConverter(); // Conversion logic

    /**
     * Sets the type of conversion to perform.
     * 
     * @param type String identifier for the conversion type ("mph to kph")
     */
    public void selectConversionType(String type) {
        this.conversionType = type;
    }

    /**
     * Gets the currently selected conversion type.
     * 
     * @return The conversion type string
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the input value to be converted.
     * 
     * @param value The numeric value to convert
     */
    public void enterValue(double value) {
        this.inputValue = value;
    }

    /**
     * Gets the current input value.
     * 
     * @return The value to be converted
     */
    public double getInputValue() {
        return inputValue;
    }

    /**
     * Performs the conversion based on the selected conversion type and input
     * value.
     * Currently supports "mph to kph" and "kelvin to celsius" conversions.
     */
    public void convert() {
        if ("mph to kph".equals(conversionType)) {
            result = converter.convertMphToKph(inputValue);
        } else if ("kelvin to celsius".equals(conversionType)) {
            result = converter.convertKelvinToCelsius(inputValue);
        }
    }

    /**
     * Gets the result of the conversion.
     * 
     * @return The converted value
     */
    public double getResult() {
        return result;
    }
}