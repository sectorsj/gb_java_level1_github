package homework1level2;

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
    public void run() {
        System.out.println("Кот по кличке " + name + " бежит " + this.getRunLimit());
    }

    @Override
    public void jump() {
        System.out.println("Кот кот по кличке " + name + " прыгает " + this.getJumpLimit());
    }

    public int getRunLimit() {
        return this.runLimit;
    }

    public int getJumpLimit() {
        return this.jumpLimit;
    }
}
