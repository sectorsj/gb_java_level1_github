package homework1level2;

public class Treadmill extends Obstacle {
    protected String name;
    protected int maxDistance;

    public Treadmill(String name, int maxDistance) {
        super(name);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    protected boolean moving (Human human) {
        System.out.println("Длинна дорожки " + super.getName() + " составляет " + this.maxDistance);
        human.run();
        if(this.getMaxDistance() <= human.getRunLimit()) {
            System.out.println("Человеку удалось пробежать дистанцию");
            return true;
        } else {
            System.out.println("Человек не смог пробежать дистанцию");
            return false;
        }
    }
    protected boolean moving (Cat1 cat1) {
        System.out.println("Длинна дорожки " + super.getName() + " составляет " + this.maxDistance);
        cat1.run();
        if(this.getMaxDistance() <= cat1.getRunLimit()) {
            System.out.println("Коту удалось пробежать дистанцию");
            return true;
        } else {
            System.out.println("Кот не смог пробежать дистанцию");
            return false;
        }
    }

    protected boolean moving (Robot robot) {
        System.out.println("Длинна дорожки " + super.getName() + " составляет " + this.maxDistance);
        robot.run();
        if(this.getMaxDistance() <= robot.getRunLimit()) {
            System.out.println("Роботу удалось пробежать дистанцию");
            return true;
        } else {
            System.out.println("Робот не смог пробежать дистанцию");
            return false;
        }
    }
}
