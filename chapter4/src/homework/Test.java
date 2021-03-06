package homework;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Test {
    public static void main(String[] args) {
        //构建一个军队
        Army army = new Army(4);//军队只有4个武器

        //创建武器对象
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
        GaoShePao gaoShePao = new GaoShePao();
        Fighter fighter2 = new Fighter();

        //添加武器
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(gaoShePao);
            army.addWeapon(fighter2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
        //让所有的可移动的移动
        army.moveAll();
        //让所有的可攻击的攻击
        army.attackAll();
    }
}
