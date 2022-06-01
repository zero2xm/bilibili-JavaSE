package IOTest;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description:
 *
 * FileWriter:
 *      �ļ��ַ��������д��
 *      ֻ�������ͨ�ı���
 *
 * @User:
 * @Date:
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //�����ļ��ַ����������
            //out = new FileWriter("file");
            out = new FileWriter("file",true);

            //��ʼд��
            char[] chars = {'��','��','��','��','��'};
            out.write(chars);
            out.write(chars,2,3);

            out.write("����һ��java�������ʦ��");
            //д��һ�����з���
            out.write("\n");
            out.write("hello world!");

            //ˢ��
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
