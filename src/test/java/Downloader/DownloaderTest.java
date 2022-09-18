package Downloader;

import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class DownloaderTest {
    private Downloader downloader = new Downloader();

    public DownloaderTest() throws IOException {
    }

    @Test
    public void testIfEuroExchangeRateIntoZlotyParseIsCorrect() throws IOException {
        assertEquals(Double.parseDouble(downloader.euroExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", ".")) ,(downloader.euroIntoZlotyAsDouble()));
    }


   @Test
    public void testIfDollarExchangeRateIntoZlotyParseIsCorrect(){
        assertEquals(Double.parseDouble(downloader.dollarExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", ".")), (downloader.dollarIntoZlotyAsDouble()));
    }

    @Test
    public void testIfPoundExchangeRateIntoZlotyParseIsCorrect(){
        assertEquals(Double.parseDouble(downloader.poundExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", ".")), (downloader.poundIntoZlotyAsDouble()));
    }

    //Methods which enables to convert from Zloty into other values
    @Test
    public void testIfZlotyIntoEuroParseIsCorrect(){
        assertEquals(Double.parseDouble(downloader.zlotyIntoEuroExchange.replaceAll("[^a-zA-Z0-9]", ".")), downloader.zlotyIntoEuroAsDouble());
    }

    @Test
    public void testIfZlotyIntoDollarParseIsCorrect(){
        assertEquals(Double.parseDouble(downloader.zlotyIntoDollarExchange.replaceAll("[^a-zA-Z0-9]", ".").substring(1,7)), downloader.zlotyIntoDollarAsDouble());
    }

    @Test
    public void testIfZlotyIntoPoundParseIsCorrect(){
        assertEquals(Double.parseDouble(downloader.zlotyIntoPoundExchange.replaceAll("[^a-zA-Z0-9]", ".").substring(1,7)), downloader.zlotyIntoPoundAsDouble());
    }
}