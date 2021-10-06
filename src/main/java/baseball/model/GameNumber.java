package baseball.model;

import baseball.constants.Constants;
import nextstep.utils.StructUtils;

import java.util.List;

public class GameNumber {
    private List<Character> gameNumberList;

    public GameNumber(String input) {
        gameNumberList = StructUtils.convertStringToCharList(input);
    }

    public List<Character> getGameNumberList() {
        return gameNumberList;
    }

    public static boolean validateInput(String input) {
        if(!isNumeric(input)) {
            return false;
        }
        if(!(StructUtils.convertStringToCharList(input).size() == Constants.DIGIT_SIZE)) {
            return false;
        }
        return true;
    }

    /*
        String이 Number인지 체크
        https://www.baeldung.com/java-check-string-number
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
