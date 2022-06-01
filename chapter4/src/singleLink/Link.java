package singleLink;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Link {
    //头节点
    Node header = null;

    //向链表中添加元素的方法
    public void add(Object data){
        //创建一个新的节点对象
        //让之前但链表的末尾节点next指向新节点对象。
        //有可能这个元素是第一个，也可能是第二个，也可能是第三个。
        if (header == null){
            //说明还没有节点
            //new一个新的节点对象，作为头节点对象。
            //这个时候的头节点即时一个头节点，又是一个末尾节点。
            header = new Node(data,null);
        }else{
            //说明不是空！
            //头节点已经存在了！
            //找出当前末尾节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
    }

    /**
     * 专门查找末尾节点的方法。
     * @param
     * @return
     */
    private Node findLast(Node node){
        if (node.next == null) {
            return node;
        }
        return findLast(node.next);//递归算法
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object newobj){

    }

    //查找链表中某个元素的方法
    public int find(Object obj){

        return 1;
    }
}
