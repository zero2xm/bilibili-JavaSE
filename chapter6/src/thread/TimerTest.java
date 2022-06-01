package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class TimerTest {
    public static void main(String[] args) throws Exception{
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);//守护线程的方式

        //指定定时任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2022-04-27 00:23:40");
        //timer.schedule(new LogTimerTask(),firstTime,1000*10);
        //timer.schedule(new LogTimerTask(),firstTime,1000*60*60*24*365);

        //匿名内部类方式
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = sdf.format(new Date());
                System.out.println(strTime+":成功完成了一次数据备份！");
            }
        },firstTime,1000*10);
    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        //编写你需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份！");
    }
}
