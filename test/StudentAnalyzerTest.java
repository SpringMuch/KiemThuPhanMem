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
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        List<Double> mixedScores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.166, analyzer.calculateValidAverage(mixedScores), 0.01);
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 15.0)));
    }
}