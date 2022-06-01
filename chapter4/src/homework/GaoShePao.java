package homework;

/**
 * @Description: 高射炮，是武器，但不能移动，只能攻击
 * @User:
 * @Date:
 */
public class GaoShePao extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("高射炮开炮！！！");
    }

    @Override
    public String toString() {
        return "GaoShePao";
    }
}
