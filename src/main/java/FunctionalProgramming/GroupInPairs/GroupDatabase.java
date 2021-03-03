package FunctionalProgramming.GroupInPairs;

import java.util.*;
import java.util.stream.Collectors;

public class GroupDatabase {


    public static List<Group> groupList = new ArrayList<>();

    public static Set<Student> studentsGroup1 = new HashSet<>();
    public static Set<Student> studentsGroup2 = new HashSet<>();
    public static Set<Student> studentsGroup3 = new HashSet<>();
    public static Set<Student> studentsGroup4 = new HashSet<>();

    public static void constructGroupList() {
        groupList.add(new Group("JavaVilnius10", TrainerDatabase.trainerList.get(0), studentsGroup1));
        groupList.add(new Group("JavaVilnius13", TrainerDatabase.trainerList.get(2), studentsGroup3));
        groupList.add(new Group("JavaVilnius21", TrainerDatabase.trainerList.get(1), studentsGroup4));
        groupList.add(new Group("JavaKaunas20", TrainerDatabase.trainerList.get(1), studentsGroup2));
    }

    public static void groupStudents() {

        studentsGroup1.add(StudentDatabase.studentList.get(0));
        studentsGroup1.add(StudentDatabase.studentList.get(1));
        studentsGroup1.add(StudentDatabase.studentList.get(2));
        studentsGroup1.add(StudentDatabase.studentList.get(11));


        studentsGroup2.add(StudentDatabase.studentList.get(3));
        studentsGroup2.add(StudentDatabase.studentList.get(4));
        studentsGroup2.add(StudentDatabase.studentList.get(5));
        studentsGroup2.add(StudentDatabase.studentList.get(13));
        studentsGroup2.add(StudentDatabase.studentList.get(11));
        studentsGroup2.add(StudentDatabase.studentList.get(12));
        studentsGroup2.add(StudentDatabase.studentList.get(9));

        studentsGroup3.add(StudentDatabase.studentList.get(6));
        studentsGroup3.add(StudentDatabase.studentList.get(2));
        studentsGroup3.add(StudentDatabase.studentList.get(2));
        studentsGroup3.add(StudentDatabase.studentList.get(10));

        studentsGroup4.add(StudentDatabase.studentList.get(7));
        studentsGroup4.add(StudentDatabase.studentList.get(8));
        studentsGroup4.add(StudentDatabase.studentList.get(9));


    }

    public static void findLargestGroup() {

        System.out.println("Largest group: " + groupList.stream()
                .max(Comparator.comparing(group -> group.getStudentList()
                        .size())).get().getName());
    }


    public static void findStudentYoungerThan25() {

        System.out.println("Students that are younger that 25");
        groupList.stream().forEach(group -> group.getStudentList()
                .stream().filter(x -> x.calculateAge() < 25)
                .forEach(s -> System.out.println(s.getFirstName() + " "
                        + s.getLastName() + " his age is: "
                        + s.calculateAge())));
    }

    public static void printStudentsWithTeacher() {

        for (Group group : groupList) {
            String trainerNames = group.getTrainer().getFirstName();
            System.out.println("Trainer  " + trainerNames + " has students: ");
            group.getStudentList().stream().forEach(student -> System.out.println(student.getFirstName()));
        }
    }

    public static void findStudentsWithJava() {

        groupList.stream().forEach(group -> group.getStudentList()
                .stream().filter(x -> x.isHasPreviousJavaKnowledge() == true)
                .forEach(s -> System.out.println(s.getFirstName() + " has java knowledge")));

    }

    public static void checkIfValidGroupSize(Set<Student> studentsGroup) {
        if (studentsGroup.size() < 5) {
            System.out.println("Group is below 5");
        } else {
            System.out.println("Cannot have more than 5 people at group");
        }
    }
}






