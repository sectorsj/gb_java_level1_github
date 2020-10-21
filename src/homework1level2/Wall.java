package homework1level2;

public class Wall extends Obstacle {
    protected String name;
    protected int maxHeight;

    public Wall (String name, int maxHeight) {
        super(name);
        this.maxHeight = maxHeight;
    }
    public int getMaxHeight() {
        return this.maxHeight;
    }

    protected boolean moving (Human human) {
        System.out.println("Высота стены " + super.getName() + " составляет " + this.maxHeight);
        human.jump();
        if(this.getMaxHeight() <= human.getJumpLimit()) {
            System.out.println("Человеку удалось перебраться через стену");
            return true;
        } else {
            System.out.println("Человек не смог перебраться через стену");
            return false;
        }
    }

    protected boolean moving (Cat1 cat1) {
        System.out.println("Высота стены " + super.getName() + " составляет " + this.maxHeight);
        cat1.jump();
        if(this.getMaxHeight() <= cat1.getJumpLimit()) {
            System.out.println("Коту удалось перебраться через стену");
            return true;
        } else {
            System.out.println("Кот не смог перебраться через стену");
            return false;
        }
    }

    protected boolean moving (Robot robot) {
        System.out.println("Высота стены " + super.getName() + " составляет " + this.maxHeight);
        robot.jump();
        if(this.getMaxHeight() <= robot.getJumpLimit()) {
            System.out.println("Роботу удалось перебраться через стену");
            return true;
        } else {
            System.out.println("Робот не смог перебраться через стену");
            return false;
        }
    }
}
