import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();
    @Test
    public void testCountExcellentStudents() {
        List<Double> mixedScores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(mixedScores), "Nên bỏ qua điểm ngoài 0-10");
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 12.0)));
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        List<Double> mixedScores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.166, analyzer.calculateValidAverage(mixedScores), 0.01);
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 15.0)));
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(8.0)), 0.01);
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(4.0, 6.0)), 0.01);
    }
    @Test
    public void testBoundaryValues() {
        List<Double> scores = Arrays.asList(
            -0.1, 0.0, 0.1,
            7.99, 8.0, 8.01,
            9.99, 10.0, 10.1
        );
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }
}
