public class StudentAnalyzer(){
    public int countExcellentStudents(List<Double> scores){
        if(scores == null || scores.IsEmpty()){
            return 0;
        }
        int count = 0;
        for(Double scores : scores){
            if(scores >= 0 && scores <= 10){
                count++;
            }
        }
        return count;
    }
    public double calculateValidAverage(List<Double> scores){
        if(scores == null || scores.IsEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        int validCount = 0;
        for(double scores : scores){
            if(scores >= 0 && scores <= 10){
                sum += scores;
                validCount++;
            }
        }
        return (validCount == 0) ? 0.0 : sum / validCount; 
    }
}