package IOTest;

import java.io.File;

/**
 * @Description:
 *
 * File中的listFiles方法
 *
 * @User:
 * @Date:
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下所有的子文件
        File f = new File("/Users/lifenghao/Downloads/达内课程");
        File[] files = f.listFiles();
        //foreach
        for (File file : files) {
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
