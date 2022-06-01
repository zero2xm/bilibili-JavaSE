package bean;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/lifenghao/Downloads/.file.md");
        if (!file.exists()) {
            //以文件形式新建
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        boolean ww = file.isHidden();
        System.out.println(ww);
    }
}
