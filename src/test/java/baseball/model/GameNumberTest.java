package baseball.model;

import baseball.constants.Constants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {

    @DisplayName("GameNumber 생성자가 Character List로 정상적으로 변환하는지, 사이즈가 맞는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"123", "456", "789"})
    void gameNumberTest(String input) {
        GameNumber gameNumber = new GameNumber(input);
        assertThat(gameNumber.getGameNumberList()).isInstanceOf(List.class);
        assertThat(gameNumber.getGameNumberList().size()).isEqualTo(Constants.DIGIT_SIZE);
    }

    @DisplayName("input값 validate가 올바르게 동작하는지 확인")
    @ParameterizedTest
    @CsvSource(value = {"12|123", "ipsumlorel|932", "12345abc67def89|432"}, delimiter = '|')
    void validateInputTest(String incorrectInput, String correctInput) {
        assertThat(GameNumber.validateInput(incorrectInput)).isFalse();
        assertThat(GameNumber.validateInput(correctInput)).isTrue();
    }
}
