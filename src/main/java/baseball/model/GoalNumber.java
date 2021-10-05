package baseball.model;

import baseball.constants.Constants;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GoalNumber {
    private List<Character> goalNumberList;

    public GoalNumber() {
        goalNumberList = generateGoalNumber();
    }

    public List<Character> getGoalNumberList() {
        return goalNumberList;
    }

    public List<Character> generateGoalNumber() {
        Set<Character> goalNumberSet = new LinkedHashSet<>();
        while (goalNumberSet.size() < Constants.DIGIT_SIZE) {
            goalNumberSet.add(Character.forDigit(Randoms.pickNumberInRange(1, 9), 10));
        }
        return new ArrayList<>(goalNumberSet);
    }
}
