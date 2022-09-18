package Downloader;

import Interfaces.ParseIntoDoubles;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Downloader implements ParseIntoDoubles {
    //Class which enables to download the currency exchange rates, I will focus on euro, dollar, and pound (info from site of Polish National Bank, xe.com, and themoneyconverter.com)

    private Document doc = Jsoup.connect("https://www.nbp.pl/home.aspx?f=/kursy/kursya.html").get(); //from euro, dollar, pound into zl
    private Document doc2 = Jsoup.connect("https://www.xe.com/currencyconverter/convert/?Amount=1&From=PLN&To=EUR").get();
    private Document doc3 = Jsoup.connect("https://themoneyconverter.com/PLN/USD").get();
    private Document doc4 = Jsoup.connect("https://themoneyconverter.com/PLN/GBP").get();

    //Exchange rates into zloty, I made it public bc of the tests
    public String euroExchangeRate = doc.select("h2 + div + table").select("tr").select("td").eq(1).text();
    public String dollarExchangeRate = doc.select("h2 + div + table").select("tr").select("td").eq(3).text();
    public String poundExchangeRate = doc.select("h2 + div + table").select("tr").select("td").eq(7).text();

    //From zloty into analysing values
    public String zlotyIntoEuroExchange = doc2.getElementsByClass("result__BigRate-sc-1bsijpp-1 iGrAod").text().substring(0,6);
    public String zlotyIntoDollarExchange = doc3.select("span").text().substring(9,16);
    public String zlotyIntoPoundExchange = doc4.select("span").text().substring(9,16);

    public Downloader() throws IOException {}

    @Override
    public double euroIntoZlotyAsDouble() {
        return Double.parseDouble(euroExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", "."));
    }

    @Override
    public double dollarIntoZlotyAsDouble() {
        return Double.parseDouble(dollarExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", "."));
    }

    @Override
    public double poundIntoZlotyAsDouble() {
        return Double.parseDouble(poundExchangeRate.substring(0,6).replaceAll("[^a-zA-Z0-9]", "."));
    }

    @Override
    public double zlotyIntoEuroAsDouble() {
        return Double.parseDouble(zlotyIntoEuroExchange.replaceAll("[^a-zA-Z0-9]", "."));
    }

    @Override
    public double zlotyIntoDollarAsDouble() {
      return Double.parseDouble(zlotyIntoDollarExchange.replaceAll("[^a-zA-Z0-9]", ".").substring(1,7));
    }

    @Override
    public double zlotyIntoPoundAsDouble() {
        return Double.parseDouble(zlotyIntoPoundExchange.replaceAll("[^a-zA-Z0-9]", ".").substring(1,7));
    }
}