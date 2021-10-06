package baseball.model;

import baseball.constants.Constants;
import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private int strikeCount = 0;
    private int ballCount = 0;


    public GameResult(List<Character> gameNumberList, List<Character> goalNumberList) {
        checkGameResult(gameNumberList, goalNumberList);
    }

    public void checkGameResult(List<Character> gameNumberList, List<Character> goalNumberList) {
        if(gameNumberList.size() != Constants.DIGIT_SIZE || goalNumberList.size() != Constants.DIGIT_SIZE)
            return;
        for (int i = 0; i < Constants.DIGIT_SIZE; i++) {
            char number = gameNumberList.get(i);
            checkStrike(goalNumberList, number, i);
            checkBall(goalNumberList, number, i);
        }
    }

    public void checkStrike(List<Character> goalNumberList, char number, int digit) {
        if (goalNumberList.get(digit) == number)
            this.strikeCount++;
    }

    public void checkBall(List<Character> goalNumberList, char number, int digit) {
        List<Character> ballNumberList = new ArrayList<>(goalNumberList);
        ballNumberList.remove(digit);
        if (ballNumberList.indexOf(number) >= 0)
            this.ballCount++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
    public int getBallCount() {
        return ballCount;
    }

    public boolean checkGameWin() {
        if(this.strikeCount == Constants.DIGIT_SIZE)
            return true;
        return false;
    }

}
