package homework1level2;

import java.util.Random;

public class HW1L2ClassMain {
    public static void main(String[] args) {

        // test
        // RelayParticipant human = new Human("Ivan", 220, 20);
        // human.run(230);

        Random rnd = new Random();
        RelayParticipant[] participants = new RelayParticipant[3];
        int distance = rnd.nextInt(10);
        int heigth = rnd.nextInt(10);
        participants[0] = new Human("Boris", distance, heigth);
        distance = rnd.nextInt(10);
        heigth = rnd.nextInt(10);
        participants[1] = new Robot("00110010111", distance, heigth);
        distance = rnd.nextInt(10);
        heigth = rnd.nextInt(10);
        participants[2] = new Cat1("Murka", distance, heigth);
        Obstacle[] barriers = new Obstacle[6];

        int i;
        for(i = 0; i < barriers.length; ++i) {
            distance = rnd.nextInt(10);
            boolean isRoad = rnd.nextBoolean();
            if (isRoad) {
                barriers[i] = new Treadmill("Road" + i, distance);
            } else {
                barriers[i] = new Wall("Wall" + i, heigth);
            }
        }

        for(i = 0; i < participants.length; ++i) {
            boolean result = true;

            for(int j = 0; j < barriers.length; ++j) {
                if (Human.class == participants[i].getClass()) {
                    result = barriers[j].moving((Human)participants[i]);
                }

                if (Robot.class == participants[i].getClass()) {
                    result = barriers[j].moving((Robot)participants[i]);
                }

                if (Cat1.class == participants[i].getClass()) {
                    result = barriers[j].moving((Cat1)participants[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }


        //for (RelayParticipant relayParticipant : relayParticipants) {
        //    System.out.println("\n" + relayParticipant);
        //    re.run(300);

        //    animal.jump(0.6);
        //}

    }
}
