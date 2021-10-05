package nextstep.utils;

import java.util.ArrayList;
import java.util.List;

public class StructUtils {

    public static List<Character> convertStringToCharList(String goalNumber) {
        List<Character> list = new ArrayList<>();
        for (char ch : goalNumber.toCharArray()) {
            list.add(ch);
        }
        return list;
    }
}
