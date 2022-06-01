package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(1);//注意：参数是一个毫秒

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        //北京是东8区，插8个小时。
        System.out.println(strTime);//1970-01-01 08:00:00 001

        //获取昨天的此时的时间。
        Date time2 = new Date(System.currentTimeMillis()- 1000 * 60 * 60 *24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);//2022-04-07 16:53:33 750

        //获取去年的今天的时间
        Date time3 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24 * 365);
        String strTime3 = sdf.format(time3);
        System.out.println(strTime3);
    }
}
