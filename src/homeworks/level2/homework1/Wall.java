package homeworks.level2.homework1;

public class Wall implements Obstacle {
    @Override
    public boolean pass(RelayParticipant p) {
        return p.jump();
    }
}
