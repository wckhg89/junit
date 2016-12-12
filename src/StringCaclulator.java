import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 강홍구 on 2016-12-12.
 */
public class StringCaclulator {

    private static void minusCheck(int num) throws RuntimeException {
        if (num < 0 ) {
            throw new RuntimeException("음수!");
        }
    }

    private static boolean nullEmptyCheck (String text) {
        // 빈문자열
        return text == null || text.isEmpty();
    }

    private static boolean lengthOneCheck (String text) {
        // 문자 하나
        return text.length() == 1;

    }

    private static int sum(String[] text) {
        int result = 0;
        for (String number : text) {
            int num = Integer.parseInt(number);

            minusCheck(num);

            result += num;
        }

        return result;
    }

    private static String[] sumText (String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);

        if(m.find()) {
            String customDelimeter = m.group(1);

            return m.group(2).split(customDelimeter);
        }


        return text.split(",|:");

    }

    public int add(String text) {
        if (nullEmptyCheck(text)) {
            return 0;
        }

        if (lengthOneCheck(text)) {
            return Integer.parseInt(text);
        }


        return sum(sumText(text));
    }
}
