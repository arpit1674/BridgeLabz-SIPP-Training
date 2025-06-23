package day1_ProgrammingElements.level1PracticePrograms;
public class q5_PensDistribution {
    public static void main(String[] args) {
        int totalPens = 14, students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
