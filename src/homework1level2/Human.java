package homework1level2;

public class Human implements RelayParticipant {
    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    protected Human (String name, int runLimit, int jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println("Человек по имени " + name + " бежит " + this.getRunLimit());
    }

    @Override
    public void jump() {
        System.out.println("Человек по имени " + name + " прыгает " + this.getJumpLimit());
    }

    public int getRunLimit() {
        return this.runLimit;
    }

    public int getJumpLimit() {
        return this.jumpLimit;
    }
}

