package FunctionalProgramming.GroupInPairs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class Student extends Person {

    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;

    }


    public int calculateAge() {
        if ((this.getDateOfBirth() != null) && (LocalDate.now() != null)) {
            return Period.between(this.getDateOfBirth(), LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }


}

