package Calculator;


import Conversions.FromZlotyConversions;
import Conversions.IntoZlotyConversions;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
    private Scanner sc = new Scanner(System.in);

    public void logginSign() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        outputStreamWriter.write("Welcome to currency converter! " + "\n" +
                "Based on your needs choose the correct method to convert from currency A to currency B. " + "\n" +
                "You can only make the conversion from Polish Zloty into Euro, Dollar, British Pound and in the reverse direction.");
        outputStreamWriter.flush();
        System.out.println();
    }

    public String zlotyIntoOtherCurrencies() throws IOException {
        System.out.println();
        System.out.println("Put your amount in Zloty to conversion: ");
        double amount = sc.nextDouble();
        FromZlotyConversions fromZlotyConversions = new FromZlotyConversions(amount);
        sc.close();
        return fromZlotyConversions.toEuros() + "\n" + fromZlotyConversions.toDollars() + "\n" + fromZlotyConversions.toPounds();
    }

    public String fromEuroIntoZloty() throws IOException {
        System.out.println();
        System.out.println("Put your amount in Euro to conversion: ");
        double amount = sc.nextDouble();
        IntoZlotyConversions intoZlotyConversions = new IntoZlotyConversions(amount);
        sc.close();
        return intoZlotyConversions.fromEuros();
    }

     public String fromDollarIntoZloty() throws IOException {
        System.out.println();
        System.out.println("Put your amount in Dollar to conversion: ");
        double amount = sc.nextDouble();
        IntoZlotyConversions intoZlotyConversions = new IntoZlotyConversions(amount);
        sc.close();
        return intoZlotyConversions.fromDollars();
    }

    public String fromPoundIntoZloty() throws IOException {
        System.out.println();
        System.out.println("Put your amount in Pound to conversion: ");
        double amount = sc.nextDouble();
        IntoZlotyConversions intoZlotyConversions = new IntoZlotyConversions(amount);
        sc.close();
        return intoZlotyConversions.fromPounds();
    }
}

