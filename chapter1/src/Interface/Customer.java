package Interface;

public class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu！
    private FoodMenu foodMenu;//养成封装的好习惯

    //构造方法
    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的方法
    public void order(){
        //先拿到菜单才能点菜
        //调用get方法拿菜单。
        //this.getFoodMenu();
        //也可以不调用get方法，因为在本类中私有的属性是可以访问的
        foodMenu.chaojidan();
        foodMenu.yuxiangrousi();
    }
}
