package Array.homework;

/**
 * @Description: 酒店对象，酒店中有二维数组，二维数组模拟大厦
 * @User:
 * @Date:
 */
public class Hotel {
    //二维数组，模拟大厦所有的房间
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼。
    public Hotel(){
        //一共有基层，每层的房间类型是什么，每个房间的编号是什么。
        //我们可以先写死，一共三层，一层单人间，二层标准间，三层总统套房
        //动态初始化
        rooms = new Room[3][10];//3行10列，三层楼，每层10个房间。

        //创建30个Room对象，放到数组当中。
        //二维数组遍历
        for (int i = 0; i < rooms.length; i++) {//i是下标：0 1 2，i+1是楼层：1，2，3
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print(){
        //打印所有房间状态，就是遍历二维数组
        for (int i = 0; i < rooms.length; i++) {
            //里面for循环负责输出一层
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            //换行
            System.out.println();
        }
    }
    /**
     * 订房方法。
     * @param roomNo 调用此方法时需要传递一个房间编号过来，这个房间编号是前台输入的
     */
    public void order(int roomNo){
        //订房最主要的是将房间对象的status修改为false。
        //Room对象的status修改为false。
        //假设房间编号207(下标是[1][6])
        //通过房间编号演算出下标。获取房间对象。
        Room room = rooms[roomNo / 100-1][roomNo % 100 -1];
        //修改为占用。
        room.setStatus(false);
        System.out.println(roomNo + "已订房！");
    }

    /**
     * 退房
     * @param roomNo
     */
    public void exit(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 -1];
        //修改为空闲。
        room.setStatus(true);
        System.out.println(roomNo + "已退房！");
    }
}
