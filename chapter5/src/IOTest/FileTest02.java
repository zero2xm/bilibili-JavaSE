package IOTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 *
 * File类常用方法
 *
 * @User:
 * @Date:
 */
public class FileTest02 {
    public static void main(String[] args) {
        //创建File对象
        File f1 = new File("copy");
        //获取文件名
        System.out.println(f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());//false

        //判断是否是一个文件
        System.out.println(f1.isFile());//true

        //获取文件最后一次修改时间
        long mm = f1.lastModified();//这个毫秒是从1970年到现在的总毫秒数。
        //将总毫秒数转换成日期
        Date time = new Date(mm);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTme = sdf.format(time);
        System.out.println(strTme);

        //获取文件大小
        System.out.println(f1.length());//26字节。
    }
}
