package IOTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 *
 * 日志工具
 *
 * @User:
 * @Date:
 */
public class Logger {
    public static void log(String msg) {
        //记录日志的方法
        try {
            //指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
            //改变输出方向
            System.setOut(out);
            //日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);


            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
