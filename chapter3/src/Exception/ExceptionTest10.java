package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description: finally语句的用法
 * @User:
 * @Date:
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建输入流对象
            fis = new FileInputStream("Image/battleship.png");
            //开始读文件.....

            String s = null;
            //这里一定会出现空指针异常！
            s.toString();

            //流使用完需要关闭，因为流是占用资源的。
            //即使以上程序出现异常，流也必须关闭
            //放在这里有可能流管不了。
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("hellow 浩克！");
            //流的关闭放在这里比较保险
            //finally中的代码是一定会执行的。
            //即使try中出现了异常
            if (fis != null) {
                try {
                    //close()方法有异常，采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Hello Kitty！");
    }
}
