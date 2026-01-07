public class StudentAnalyzer(){
    int ountExcellentStudents(List<Double> scores){
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
}