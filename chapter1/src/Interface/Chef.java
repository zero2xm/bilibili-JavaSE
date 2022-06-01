package Interface;
//西餐厨师
//实参菜单上的菜
//厨师是实现接口的实现者
public class Chef implements FoodMenu{
    public void chaojidan(){
        System.out.println("西餐师傅做的炒鸡蛋");
    }
    public void yuxiangrousi(){
        System.out.println("西餐师傅做的鱼香肉丝");
    }
}

