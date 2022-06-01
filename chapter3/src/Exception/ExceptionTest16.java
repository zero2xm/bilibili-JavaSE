package Exception;

/**
 * @Description:
 * @User:
 * @Date:
 */
//测试改良之后的MyStack
public class ExceptionTest16 {
    public static void main(String[] args) {
        //创建栈对象
        MyStack stack = new MyStack();
        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            //这里栈满了
            stack.push(new Object());
            stack.push(new Object());
        } catch (MyStackOperationException e) {
            //输出异常简单信息
            System.out.println(e.getMessage());
        }

        //弹栈
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            //弹栈失败
            stack.pop();
            stack.pop();
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
