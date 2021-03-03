package FunctionalProgramming.GroupInPairs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Trainer extends Person {


    private boolean isAuthorized;

    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;

    }

    @Override
    public String toString() {
        return "Trainer{" +
                "isAuthorized=" + isAuthorized +
                '}';
    }
}
