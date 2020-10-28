package homeworks.level2.homework1;

public class Treadmill implements Obstacle {
    @Override
    public boolean pass(RelayParticipant p) {
        return p.run();
    }
}
