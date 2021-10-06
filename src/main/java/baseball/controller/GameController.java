package baseball.controller;


import baseball.constants.Constants;
import baseball.model.GameNumber;
import baseball.model.GameResult;
import baseball.model.GoalNumber;
import baseball.view.GameView;

public class GameController {

    public void runBaseBallApplication() {
        while(true) {
            String continueFlag = startGame();
            if (continueFlag.equals(Constants.INPUT_EXIT)) break;
            if (continueFlag.equals(Constants.INPUT_NEWGAME)) continue;
        }
        return;
    }

    public String startGame() {
        GameView gameView = new GameView();
        GoalNumber goalNumber = new GoalNumber();
        boolean gameWin = false;
        while(!gameWin) {
            GameNumber gameNumber = new GameNumber(gameView.getGameNumber());
            GameResult gameResult = new GameResult(gameNumber.getGameNumberList(), goalNumber.getGoalNumberList());
            gameView.showGameResult(gameResult);
            gameWin = gameResult.checkGameWin();
        }
        return gameView.showYouWin();
    }

}