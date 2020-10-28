package homeworks.level2.homework1;

import java.util.Random;

public class HW1L2ClassMain {
    public static void main(String[] args) {

        // test
        //RelayParticipant human = new Human("Ivan", 220, 20);
        //human.run();

        RelayParticipant[] participants = {
                new Human("Ivan", 200, 10 ),
                new Robot("00110010111", 220, 5),
                new Cat1("Murka", 105, 20)
        };
        Obstacle[] obstacles = {new Wall(), new Treadmill()};
                for (RelayParticipant p : participants){
            for (Obstacle o : obstacles){
                o.pass(p);
            }
        }
    }
}
