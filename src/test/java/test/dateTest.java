package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateTest {

    public static void main(String[] args) {
//

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss", Locale.CHINA);

        try {
            Date parse = dateFormat.parse("1991-13-29 23:59:00");
            System.out.println(parse);
            String format = dateFormat.format(parse);
            System.out.println(format);
        } catch (ParseException e) {

            e.printStackTrace();
        }

    }
}
