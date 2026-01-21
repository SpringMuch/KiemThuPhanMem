import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_MixedValidAndInvalidScores() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores),
                "Nên bỏ qua điểm ngoài khoảng 0–10");
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllInvalidScores() {
        List<Double> scores = Arrays.asList(-1.0, 12.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllExcellentScores() {
        List<Double> scores = Arrays.asList(8.0, 9.0, 10.0);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCalculateValidAverage_MixedScores() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.166, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_TwoValidBoundaryScores() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalidScores() {
        List<Double> scores = Arrays.asList(-5.0, 15.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores));
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_SingleValidScore() {
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(8.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_TwoNormalScores() {
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(4.0, 6.0)), 0.01);
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(
            -0.1, 0.0, 0.1,
            7.99, 8.0, 8.01,
            9.99, 10.0, 10.1
        );
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }
}
