package FunctionalProgramming.GroupInPairs;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupSortingService {

    public static void displayStudentNameAlphabetically(List<Group> groupList) {

        System.out.println("Names alphabetically: ");
        groupList.get(0).getStudentList().stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .forEach(student -> System.out.println(student.getFirstName()));




    }
}
