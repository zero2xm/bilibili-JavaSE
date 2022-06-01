package Interface;
//中国厨师
//实参菜单上的菜
//厨师是接口的实现者
public class ChinaCook implements FoodMenu{
    public void chaojidan(){
        System.out.println("中餐师傅做的西红柿炒鸡蛋");
    }
    public void yuxiangrousi(){
        System.out.println("中餐师傅做的鱼香肉丝");
    }
}
