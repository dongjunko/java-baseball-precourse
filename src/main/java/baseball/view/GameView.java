package baseball.view;


import baseball.constants.Constants;
import baseball.model.GameNumber;
import baseball.model.GameResult;
import nextstep.utils.Console;

public class GameView {

    public String getGameNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = getInput();
        if(!GameNumber.validateInput(input)) {
            System.out.println(Constants.ERROR_MESSAGE_BADINPUT);
            return getGameNumber();
        }
        return input;
    }

    public String showYouWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return getInput();
    }

    public void showGameResult(GameResult gameResult) {
        System.out.print( gameResult.getStrikeCount() > 0 ? gameResult.getStrikeCount() + Constants.GAME_RESULT_STRIKE : "" );
        System.out.print( (gameResult.getStrikeCount() > 0 && gameResult.getBallCount() > 0) ? " " : "");
        System.out.print( gameResult.getBallCount() > 0 ? gameResult.getBallCount() + Constants.GAME_RESULT_BALL : "");
        System.out.print( gameResult.getStrikeCount() == 0 && gameResult.getBallCount() == 0 ? Constants.GAME_RESULT_NOTHING : "");
        System.out.println("");
    }

    public String getInput() {
        String input = Console.readLine();
        return input;
    }
}
