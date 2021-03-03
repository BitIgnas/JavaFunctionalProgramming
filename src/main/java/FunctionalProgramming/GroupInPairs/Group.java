package FunctionalProgramming.GroupInPairs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter

public class Group {

    private String name;
    private Trainer trainer;
    private Set<Student> studentList;

    public Group(String name, Trainer trainer, Set<Student> studentList) {
        this.name = name;
        this.trainer = trainer;
        this.studentList = studentList;

    }

    public Group() {

    }

    public void addStudent(Student s) throws MaximumNumberOfStudentsReached {
        if (studentList.size() <= 5) {
            throw new MaximumNumberOfStudentsReached("Maximum student amount reached");
        } else {
            studentList.add(s);
        }
    }



    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", studentList=" + studentList +
                '}';
    }
}
