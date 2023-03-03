package Session10;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.NumberFormat;
public class InternationalApplication2 {
    static public void printValue(Locale currentLocale){
        Integer value = new Integer(123456);
        Double amt = new Double(345987.246);
        NumberFormat numFormatObj;
        String valueDisplay;
        String amtDisplay;
        numFormatObj = NumberFormat.getInstance(currentLocale);
        valueDisplay = numFormatObj.format(value);
        amtDisplay = numFormatObj.format(amt);
        System.out.println(valueDisplay + " " + currentLocale.toString());
        System.out.println(amtDisplay + " " + currentLocale.toString());
    }

    public static void main(String[] args) {
        String language;
        String country;
        if (args.length != 2){
            language = new String("en");
            country = new String("US");
        }
        else {
            language = new String(args[0]);
            country = new String(args[1]);
        }
        Locale currentLocale;
        ResourceBundle messages;
        currentLocale = new Locale(language, country);
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
        printValue(currentLocale);
    }
}
