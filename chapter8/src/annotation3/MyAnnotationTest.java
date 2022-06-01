package annotation3;

/**
 * @Description:
 *
 * 如果属性名的名字是value，并且只有一个属性的话，在使用的时候，该属性名可以省略。
 *
 * @User:
 * @Date:
 */
public class MyAnnotationTest {

    @MyAnnotation(value = "hehe")
    public void doSome(){}

    @MyAnnotation("haha")
    public void doOther(){}
}
