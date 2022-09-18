package Conversions;

import Interfaces.CurrencyConversionFromZloty;
import Downloader.Downloader;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FromZlotyConversions extends Downloader implements CurrencyConversionFromZloty {
    private double amount;

    public FromZlotyConversions(double amount) throws IOException {
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
    public String toEuros() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " Polish Zloty = " + df.format(amount/euroIntoZlotyAsDouble()) + " Euros");
    }

    @Override
    public String toDollars() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " Polish Zloty = " + (df.format(amount/dollarIntoZlotyAsDouble()) + " Dollars"));
    }

    @Override
    public String toPounds() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format(amount + " Polish Zloty = " + df.format(amount/poundIntoZlotyAsDouble()) + " Pounds");
    }
}
