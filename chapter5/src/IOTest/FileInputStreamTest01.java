package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description:
 * java.io.FileInputStream:
 *      1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
 *      2、字节的方式，完成输入的操作，完成读的操作(硬盘---> 内存)
 *      3、
 *
 * @User:
 * @Date:
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建文件字节流输入对象
            //文件路径：/Users/lifenghao/Downloads/达内课程  (IDEA自动会把\编程\\，因为java中\表示转义)
            //以下都是采用了：绝对路径的方式。
            //FileInputStream fis = new FileInputStream("/Users/lifenghao/Downloads/达内课程");
            //写成/也是可以的。
            fis = new FileInputStream("/Users/lifenghao/Downloads/temp.md");

            //开始读
            int readData = fis.read();//这个方法的返回值是：读取到的"字节"本身。
            System.out.println(readData);//97

            readData = fis.read();
            System.out.println(readData);//98

            readData = fis.read();
            System.out.println(readData);//99

            readData = fis.read();
            System.out.println(readData);//100

            readData = fis.read();
            System.out.println(readData);//101

            readData = fis.read();
            System.out.println(readData);//102

            //已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1
            readData = fis.read();
            System.out.println(readData);//-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块当中确保流一定关闭。
            if (fis != null) {//避免空指针异常
                //关闭流的前提是，流不是空
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
