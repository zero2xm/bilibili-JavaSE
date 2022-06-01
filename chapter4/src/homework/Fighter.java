package homework;

/**
 * @Description: 战斗机,是武器，可移动，可攻击
 * @User:
 * @Date:
 */
public class Fighter extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮！");
    }

    @Override
    public String toString() {
        return "Fighter";
    }
}
