package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GameResultTest {

    @DisplayName("게임결과 검사가 제대로 동작하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1|2|3", "4|5|6"}, delimiter = '|')
    void checkGameWinTest(char first, char second, char third) {
        List<Character> goalNumberList = Arrays.asList(new Character[]{'1', '2', '3'});
        GameResult gameResult1 = new GameResult(Arrays.asList(new Character[]{'4', '5', '6'}), goalNumberList);
        GameResult gameResult2 = new GameResult(Arrays.asList(new Character[]{'1', '3', '2'}), goalNumberList);
        GameResult gameResult3 = new GameResult(Arrays.asList(new Character[]{'1', '2', '3'}), goalNumberList);
        assertThat(gameResult1.checkGameWin()).isFalse();
        assertThat(gameResult2.checkGameWin()).isFalse();
        assertThat(gameResult3.checkGameWin()).isTrue();
    }

}
