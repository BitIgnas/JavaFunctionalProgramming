package FunctionalProgramming.GroupInPairs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrainerDatabase {


    public static List<Trainer> trainerList = new ArrayList<>();

    public static void constructTrainerList() {

        trainerList.add(new Trainer("Tomas", "Valancius", LocalDate.of(1986, 12, 15), true));
        trainerList.add(new Trainer("Mikas", "Jakobaitis", LocalDate.of(1990, 5, 3), true));
        trainerList.add(new Trainer("Vasilijus", "Stancevko", LocalDate.of(2000, 11, 1), false));

    }
}
