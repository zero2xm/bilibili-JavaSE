package Interface;
//动物类子类：猫类
class Cat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞猫起飞，翱翔太空的一只猫，很神奇，我想做一只猫！！");
    }
}
