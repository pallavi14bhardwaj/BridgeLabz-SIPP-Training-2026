package programmingelements.level1;
//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
//I/P => NONE
//O/P => Sam’s average mark in PCM is ___

public class AveragePCMMarks {
    public static void main(String[] args) {

        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;

        System.out.println("Harry's average mark in PCM is " + averageMarks);
    }
}
