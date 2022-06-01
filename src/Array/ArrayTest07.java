package Array;

/**
 * @Description: 一维数组的深入，数组中存储的类型为：引用数据类型
 *               对于数组来说，实际上只能存储java对象的"内存地址"。数组中存储的每个元素是"引用"
 * @User:
 * @Date:
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
            /*Animal a = animals[i];
            a.move();*/
            //代码合并
            animals[0].move();//这个move()方法不是数组的，是数组当中Animal对象的move()方法。
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move....");
    }
}