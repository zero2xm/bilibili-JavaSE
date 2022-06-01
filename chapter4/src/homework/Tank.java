package homework;

/**
 * @Description: 坦克是一个武器，可移动，可射击
 * @User:
 * @Date:
 */
public class Tank extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
