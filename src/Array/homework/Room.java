package Array.homework;

import java.util.Objects;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Room extends Object{
    //房间编号：一楼：101 102 103 104 205 二楼：201 202 203 204 205 .....
    private int no;

    //房间类型：标间、单间、总统套
    private String type;

    //房间状态：true表示空闲，房间可以被预订。 flase：表示占用，房间不能被预定。
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //set和get方法
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Idea工具对于boolean类型的变量，生成的get方法的方法名是：isXxx()
    //如果你不喜欢，可以修改为getXxx
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //toString方法重写的目的就是将java对象转换成字符串形式。
    //怎么转，转成什么格式，程序员自己定，目的就是简单明了。
    //我不要看对象内存地址，我要看具体的信息。

    @Override
    public String toString() {
        //return "[102，单人间，空闲]";

        //动态(把一个变量赛道一个字符串当中，口诀：加一个双引号，双引号中间加两个加号，两个加号中间加变量名)
        return "[" + no + "," + type + "," + (status ? "空闲" : "占用") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof  Room)) return false;
        if (this == o) return true;
        Room room = (Room)o;
        //当前房间编号 等于 传过来的房间对象的房间编号。认为是同一个房间。
        return this.no == room.getNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNo(), getType(), getStatus());
    }
}
