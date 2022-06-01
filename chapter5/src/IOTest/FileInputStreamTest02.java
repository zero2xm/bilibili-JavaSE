package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream ifs = null;
        try {
            ifs = new FileInputStream("/Users/lifenghao/Downloads/temp.md");

            //while循环
            /*while (true) {
                int readData = ifs.read();
                if (readData == -1) {
                    break;
                }
                System.out.println(readData);
            }*/

            //改造while循环
            int readData = 0;
            while ((readData = ifs.read()) != -1){
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ifs != null) {
                try {
                    ifs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
