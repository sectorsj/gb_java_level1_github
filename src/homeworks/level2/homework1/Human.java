package homeworks.level2.homework1;

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
    public boolean run() {
        System.out.println("Человек по имени " + name + " бежит " + this.getRunLimit());
        return false;
    }

    @Override
    public boolean jump() {
        System.out.println("Человек по имени " + name + " прыгает " + this.getJumpLimit());
        return false;
    }

    public int getRunLimit() {
        return this.runLimit;
    }

    public int getJumpLimit() {
        return this.jumpLimit;
    }
}

