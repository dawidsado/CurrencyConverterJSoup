package Conversions;

import Downloader.Downloader;
import org.junit.Test;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

public class IntoZlotyConversionsTest {
    private Downloader downloader = new Downloader();
    private IntoZlotyConversions intoZlotyConversionsTests = new IntoZlotyConversions(1);
    private DecimalFormat df;

    {
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
    }

    public IntoZlotyConversionsTest() throws IOException {
    }

    @Test
    public void negativeOrZeroAmountShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    IntoZlotyConversions intoZlotyConversionsExc = new IntoZlotyConversions(-1);
                    IntoZlotyConversions intoZlotyConversionsExc2 = new IntoZlotyConversions(0);
                });
    }

    @Test
    public void fromEurosConversionMethodTest(){
        assertEquals(String.format(intoZlotyConversionsTests.getAmount() + " Euro = " + df.format(intoZlotyConversionsTests.getAmount()/downloader.zlotyIntoEuroAsDouble())+ " Polish Zloty"), intoZlotyConversionsTests.fromEuros());
    }

    @Test
    public void fromDollarsConversionMethodTest(){
        assertEquals(String.format(intoZlotyConversionsTests.getAmount() + " Dollar = " + df.format(intoZlotyConversionsTests.getAmount()/downloader.zlotyIntoDollarAsDouble()) + " Polish Zloty"), intoZlotyConversionsTests.fromDollars());
    }

    @Test
    public void fromPoundsConversionMethodTest(){
        assertEquals(String.format(intoZlotyConversionsTests.getAmount() + " British Pound = " + df.format(intoZlotyConversionsTests.getAmount()/downloader.zlotyIntoPoundAsDouble()) + " Polish Zloty"), intoZlotyConversionsTests.fromPounds());
    }
}