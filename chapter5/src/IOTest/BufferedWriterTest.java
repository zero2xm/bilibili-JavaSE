package IOTest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @Description:
 *
 * BufferedWriter:带有缓冲的字符输出流
 * OutputStreamWriter:转换流
 *
 * @User:
 * @Date:
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        //带有缓冲区的字符输出流
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy02",true)));
        //开始写
        out.write("hewllo world!");
        out.write("\n");
        out.write("hello kitty!");

        //刷新
        out.flush();

        //关闭最外层
        out.close();
    }
}
