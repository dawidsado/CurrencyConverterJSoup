package Conversions;

import Downloader.Downloader;
import Downloader.DownloaderTest;
import org.junit.Test;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

public class FromZlotyConversionsTest {
    private DecimalFormat df;
    private Downloader downloader = new Downloader();
    private FromZlotyConversions fromZlotyConversionsTests = new FromZlotyConversions(1);

    {
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
    }

    public FromZlotyConversionsTest() throws IOException {}

    @Test
    public void negativeOrZeroAmountShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    FromZlotyConversions fromZlotyConversionsExc = new FromZlotyConversions(-1);
                    FromZlotyConversions fromZlotyConversionsExc2 = new FromZlotyConversions(0);
                });
    }

    @Test
    public void toEurosMethodTest(){
        assertEquals(String.format(fromZlotyConversionsTests.getAmount() + " Polish Zloty = " + df.format(fromZlotyConversionsTests.getAmount()/downloader.euroIntoZlotyAsDouble()) + " Euros"), fromZlotyConversionsTests.toEuros());
    }

    @Test
    public void toDollarsMethodTest(){
        assertEquals(String.format(fromZlotyConversionsTests.getAmount() + " Polish Zloty = " + df.format(fromZlotyConversionsTests.getAmount()/downloader.dollarIntoZlotyAsDouble()) + " Dollars"), fromZlotyConversionsTests.toDollars());
    }

    @Test
    public void toPoundsMethodTest(){
        df.setRoundingMode(RoundingMode.DOWN);
        assertEquals(String.format(fromZlotyConversionsTests.getAmount() + " Polish Zloty = " + df.format(fromZlotyConversionsTests.getAmount()/downloader.poundIntoZlotyAsDouble()) + " Pounds"), fromZlotyConversionsTests.toPounds());
    }
}