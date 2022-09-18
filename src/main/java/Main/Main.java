package Main;

import Calculator.Calculator;
import Downloader.Downloader;

import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.logginSign();
        /* Test other functionalities of the converter
        System.out.println(calculator.zlotyIntoOtherCurrencies());
        System.out.println(calculator.fromPoundIntoZloty());
        System.out.println(calculator.fromDollarIntoZloty());
         */
        System.out.println(calculator.fromEuroIntoZloty());

     }
}
