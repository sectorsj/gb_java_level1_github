package homeworks.level2.homework1;

public class Cat1 implements RelayParticipant {
    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    protected Cat1 (String name, int runLimit, int jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run() {
        System.out.println("Кот по кличке " + name + " бежит " + this.getRunLimit());
        return false;
    }

    @Override
    public boolean jump() {
        System.out.println("Кот по кличке " + name + " прыгает " + this.getJumpLimit());
        return false;
    }

    public int getRunLimit() {
        return this.runLimit;
    }

    public int getJumpLimit() {
        return this.jumpLimit;
    }
}
