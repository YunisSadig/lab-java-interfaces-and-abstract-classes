package Operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BdOperating {
    public static  double hundreadRound(BigDecimal bd) {
        if (bd == null) {
            throw new IllegalArgumentException("BigDecimal number cannot be null");
        }
        BigDecimal rounded = bd.setScale(2, RoundingMode.DOWN);
        return rounded.doubleValue();
    }
    public static BigDecimal reverseAndRound(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        BigDecimal reversed = number.negate();

        BigDecimal round = reversed.setScale(1, RoundingMode.HALF_UP);

        return round;
    }
}
