package Conversions;

import Interfaces.CurrencyConversionIntoZloty;
import Downloader.Downloader;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class IntoZlotyConversions extends Downloader implements CurrencyConversionIntoZloty {
    private double amount;

    public IntoZlotyConversions(double amount) throws IOException {
        super();
        if (amount <= 0){
                throw new IllegalArgumentException("Please enter an amount greater than 0");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String fromEuros() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " Euro = " + df.format(amount/zlotyIntoEuroAsDouble())+ " Polish Zloty");
    }

    @Override
    public String fromDollars() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " Dollar = " + df.format(amount/zlotyIntoDollarAsDouble()) + " Polish Zloty");
    }

    @Override
    public String fromPounds() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " British Pound = " + df.format(amount/zlotyIntoPoundAsDouble()) + " Polish Zloty");
    }
}
