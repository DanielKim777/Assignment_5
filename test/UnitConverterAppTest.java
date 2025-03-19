
/**
* Unit tests for the UnitConverterApp and UnitConverter.
* Tests individual components and their interactions.
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitConverterAppTest {

    /**
     * Tests that the UnitConverterApp can be instantiated.
     */
    @Test
    public void testAppExists() {
        UnitConverterApp app = new UnitConverterApp();
        assertNotNull(app);
    }

    /**
     * Tests that the app correctly stores the mph to kph conversion type.
     */
    @Test
    public void testSelectConversionType() {
        UnitConverterApp app = new UnitConverterApp();
        app.selectConversionType("mph to kph");
        assertEquals("mph to kph", app.getConversionType());
    }

    /**
     * Tests that the app correctly stores the input value.
     */
    @Test
    public void testEnterValue() {
        UnitConverterApp app = new UnitConverterApp();
        app.enterValue(65.0);
        assertEquals(65.0, app.getInputValue(), 0.01);
    }

    /**
     * Tests the complete mph to kph conversion process in the app.
     */
    @Test
    public void testConvertMphToKph() {
        UnitConverterApp app = new UnitConverterApp();
        app.selectConversionType("mph to kph");
        app.enterValue(65.0);
        app.convert();
        assertEquals(104.60, app.getResult(), 0.01);
    }

    /**
     * Tests that the app can be instantiated for kelvin to celsius conversion.
     * Note: This test is redundant with testAppExists but kept for TDD history.
     */
    @Test
    public void testAppExistsForKelvinToCelsius() {
        UnitConverterApp app = new UnitConverterApp();
        assertNotNull(app);
    }

    /**
     * Tests that the app correctly stores the kelvin to celsius conversion type.
     */
    @Test
    public void testSelectKelvinToCelsius() {
        UnitConverterApp app = new UnitConverterApp();
        app.selectConversionType("kelvin to celsius");
        assertEquals("kelvin to celsius", app.getConversionType());
    }

    /**
     * Tests that the app correctly stores a kelvin temperature value.
     */
    @Test
    public void testEnterKelvinValue() {
        UnitConverterApp app = new UnitConverterApp();
        app.enterValue(300.0);
        assertEquals(300.0, app.getInputValue(), 0.01);
    }

    /**
     * Tests that the converter correctly converts kelvin to celsius.
     */
    @Test
    public void testConvertKelvinToCelsius() {
        UnitConverter converter = new UnitConverter();
        double result = converter.convertKelvinToCelsius(300.0);
        assertEquals(26.85, result, 0.01);
    }

    /**
     * Tests the complete kelvin to celsius conversion process in the app.
     */
    @Test
    public void testConvertKelvinToCelsiusInApp() {
        UnitConverterApp app = new UnitConverterApp();
        app.selectConversionType("kelvin to celsius");
        app.enterValue(300.0);
        app.convert();
        assertEquals(26.85, app.getResult(), 0.01);
    }
}