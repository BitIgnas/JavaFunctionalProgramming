package FunctionalProgramming.GroupInPairs;

public class Main {
    public static void main(String[] args) {
        StudentDatabase.constructStudentList();
        TrainerDatabase.constructTrainerList();
        GroupDatabase.constructGroupList();
        GroupDatabase.groupStudents();


        StudentDatabase.printAllElement();
        System.out.println("------------------------------");
        StudentDatabase.displayStudentNameAlphabetically();
        System.out.println("------------------------------");
        GroupDatabase.findLargestGroup();
        System.out.println("------------------------------");
        GroupDatabase.findStudentYoungerThan25();
        System.out.println("------------------------------");
        GroupDatabase.printStudentsWithTeacher();
        System.out.println("------------------------------");
        GroupDatabase.findStudentsWithJava();










    }
}
