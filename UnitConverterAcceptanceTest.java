
/**
* Acceptance tests for the UnitConverter application.
* These tests verify the application's behavior from a user's perspective.
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitConverterAcceptanceTest {

    /**
     * Tests that a user can convert miles per hour to kilometers per hour.
     */

    @Test
    public void userCanConvertMilesToKilometers() {
        // 1. Set up the application
        UnitConverterApp app = new UnitConverterApp();

        // 2. User selects mph to kph conversion
        app.selectConversionType("mph to kph");

        // 3. User enters a value to convert
        app.enterValue(65.0);

        // 4. User performs the conversion
        app.convert();

        // 5. System shows the result
        assertEquals(104.60, app.getResult(), 0.01);
    }

    /**
     * Tests that a user can convert temperatures from kelvin to celsius.
     */

    @Test
    public void userCanConvertKelvinToCelsius() {
        // 1. Set up the application
        UnitConverterApp app = new UnitConverterApp();

        // 2. User selects kelvin to celsius conversion
        app.selectConversionType("kelvin to celsius");

        // 3. User enters a value to convert
        app.enterValue(300.0);

        // 4. User performs the conversion
        app.convert();

        // 5. System shows the result
        assertEquals(26.85, app.getResult(), 0.01);
    }
}