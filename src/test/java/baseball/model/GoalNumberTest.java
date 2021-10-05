package baseball.model;

import baseball.constants.Constants;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GoalNumberTest {

    @DisplayName("정답이 올바르게 생성되는지 테스트")
    void generateGoalNumberTest() {
        GoalNumber goalNumber = new GoalNumber();
        assertThat(goalNumber.generateGoalNumber()).isInstanceOf(List.class);
        assertThat(goalNumber.generateGoalNumber().size()).isEqualTo(Constants.DIGIT_SIZE);
    }
}
