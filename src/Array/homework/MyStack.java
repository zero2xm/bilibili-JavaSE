package Array.homework;

/**
 * @Description:   编写程序，使用一维数组，模拟栈数据结构。
 * 要求：
 * 1、这个栈可以存储java中的任何引用类型的shuju。
 * 2、在栈中提供push方法模拟压栈。(栈满了，要有提示信息)
 * 3、在栈中提供pop方法模拟弹栈。(栈空了，也要有提示信息)
 * 4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
 * 5、假设栈的默认初始化容量是10.(请注意无参数构造方法的编写方式)
 *
 * @User: 李丰豪
 * @Date: 2022月4月6日
 */
public class MyStack {
    //向栈当中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存储到数组中。
    //因为数组是我们学习java的一个容器。
    //为什么选择Object类型数组？因为这个栈可以存储java中的任何引用类型的数据
    //包括String也可以存储进去。因为String父类也是Object。
    //Object[] 是一个万能的口袋，口袋中可以装任何引用数据类型的数据。
    private Object[] elements;

    //栈帧，永远指向栈顶部元素
    //那么这个默认初始值是多少
    //private int index = 0;//如果index采用0，表示栈帧指向了顶部元素的上方。
    //如果index采用-1，表示栈帧指向了顶部元素。
    private int index = -1;

    public MyStack() {
        //一维数组动态初始化
        //默认初始化容量是10
        this.elements = new Object[10];
        this.index = -1;
    }

    /**
     * 压栈的方法
     * @param obj 被压入的元素
     */
    public void push(Object obj){
        if (this.index >= this.elements.length - 1){
            System.out.println("压栈失败，栈已满！");
            return;
        }
        //程序能够走到这里，说明栈没满
        //向栈中加一个元素，栈帧向上移动一个位置
        this.elements[++index] = obj;
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
    }

    /**
     * 弹栈的方法，从数组中往外取元素。每取出一个元素，栈帧向下移动一位
     * @param
     */
    public void pop(){
        if (index < 0){
            System.out.println("弹栈失败，栈已空！");
            return;
        }
        System.out.print("弹栈" + elements[index] + "元素成功,");
        //栈帧向下移动一位。
        index--;
        System.out.println("栈帧指向" + index);
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
