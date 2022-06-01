package annotation4;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class OtherAnnotationTest {

    //数组是大括号
    @OtherAnnotation(age = 25,email = {"zhangsan@gmail.com","zhangsan@sohu.com"},seasonArray = Season.SPRING)

    public void doSome(){}

    //如果数组中只有一个元素:大括号可以省略
    @OtherAnnotation(age = 25,email = "zhangsan@gmail.com",seasonArray = {Season.SPRING,Season.SUMMER})
    public void doOther(){}
}
