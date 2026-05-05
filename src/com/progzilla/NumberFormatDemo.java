import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double price = 98564213.891;
        double percent = 0.25;

        // Pattern-based formatting
        DecimalFormat df1 = new DecimalFormat("#,###.00");
        System.out.println("Price: " + df1.format(price));

        DecimalFormat df2 = new DecimalFormat("$#,###.00");
        System.out.println("Price: " + df2.format(price));

        DecimalFormat df3 = new DecimalFormat("0.00%");
        System.out.println("Discount: " + df3.format(percent));

        // Locale-aware formatting
        NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(currencyUK.format(price));

        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyUS.format(price));

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(2);
        System.out.println(percentFormat.format(percent));

        // adding commas to numbers
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(price));

        // limiting decimal places
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(price));

    }
}