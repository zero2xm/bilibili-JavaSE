package Interface;
// 鱼（默认实际上是存在继承的，默认继承Object）
class Fish implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是六眼飞鱼（流言蜚语）！！！");
    }
}
