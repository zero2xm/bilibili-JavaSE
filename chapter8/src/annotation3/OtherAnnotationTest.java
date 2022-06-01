package annotation3;

/**
 * @Description:
 *
 * 因为属性名是name，不能省略
 * @MyAnnotation("test")
 *
 * @User:
 * @Date:
 */
public class OtherAnnotationTest {

    @OtherAnnotation(name = "test")
    public void doSome(){}
}
