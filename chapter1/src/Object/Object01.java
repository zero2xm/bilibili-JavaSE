package Object;
/*
        面向对象更符合人的思维模式，更容易分析现实世界，所以在程序设计当中也采用了面向对象的技术
        面向对象的三大特征   【独立显卡开发思维】
            - 封装
            - 继承
            - 多态
          所有面向对象的编程语言都有这三大特征
          采用面向对象的方式开发一个软件，生命周期当中：
            * 面向对象的分析：OOA
            * 面向对象的设计：OOD
            * 面向对象的编程：OOP

        类和对象的概念
            * 什么是类？
                - 类是现实世界当中不存在的，是一个模版，是一个概念，是人类大脑思考抽象的结果。
                - 类代表了一类事物。
                - 在现实世界当中，对象A与对象B之间具有共同特征，进行抽象总结出一个模版，这个模版被称为类。
            * 什么是对象？
                - 对象是实际存在的个体。现实世界当中实际存在。
            * 描述一下整个软件开发的过程：
                * 程序员先观察现实世界，从现实世界当中寻找对象
                * 寻找了N多个对象之后，发现所有的对象都有共同特征
                * 程序员在大脑中形成了一个模版【类】
                * Java程序员可以通过java代码来表述一个类
                * java程序中有了类的定义
                * 然后通过类就可以创建对象
                * 有了对象之后，可以让对象直接协作起来形成一个系统。
            * 类--【实例化】->对象
            * 对象又被称为实例/instance
            * 对象--【抽象】-->类
            * 重点：
                类描述的是对象的共同特征。
                共同特征例如：身高特征
                这个身高特征在访问的时候，必须先创建对象，通过对象去访问这个特征。
                因为这个特征具体的某个对象上之后，值不同。有的对象1.80，有的对象身高2.80
            * 一个类主要描述什么信息呢？
            * 一个类主要描述的是状态 + 动作。
              状态信息：名字、身高、性别、年龄
              动作信息：吃、唱歌、跳舞、学习
            * 类{
                属性；//描述对象的状态信息
                方法：//描述对象的动作信息
              }
              注意：状态和动作当具体到某个对象上之后，发现最终的结果可能不一样。
                   对象和对象之间有共同特征，但是具体到对象之后有数据的差异。
            *


        * 类的定义【从这里开始编写代码】
            语法结构：
                【修饰符列表】 class 类名{}
            学生类，描述所有学生对象的共同特征：
                学生对象有哪些状态信息:
                    * 学号【int】
                    * 名字【String】
                    * 性别【boolean】
                    * 年龄【int】【年龄是一个属性，年龄是一个数据，是数据就应该有数据类型】
                    * 住址【String】
                学生对象有哪些动作信息:
                    * 吃饭
                    * 睡觉
                    * 学习
                    * 唱歌
                    * 跳舞
            重点：属性通常是采用一个变量的形式来完成定义的。
                 int no；
                 int age;
                 String neam;
                 String address;
                 boolean sex;
        * java语言中包括两种数据类型：
            - 基本数据类型
                byte
                short
                int
                long
                float
                double
                boolean
                char
            - 引用数据类型
                String.class SUN提供
                System.class SUN提供

                Object01.class 程序员自定义的
            - java语言中所有的class都属于引用数据类型。
 */

//引用类型
//定义一个类，类名Object01
//Object01是一个类，属于引用数据类型，名字就是Object，代表了所有的学生对象。是一个学生模版
//描述了所有学生的共同特征【状态+行为】
public class Object01 {//定义一个公开的类，起名Object01
    //类体=属性+方法

    //属性【描述的对象的状态信息】
    //属性通常采用变量的方式来定义
    //在类体当中，方法体之外的变量被称为"成员变量"
    //成员变量没有赋值，系统默认赋值：一切向0看起。

    //所有学生都有学号信息
    //但是每一个学生的学号都是不同的
    //所以访问这个学号必须先创建对象，通过对象去访问学号信息
    //学号信息不能直接通过"类"去访问，所以这种成员变量又被叫做：实例变量
    //对象又被称为实例，实例变量又被称为对象变量。【对象级别d的变量】
    //不创建对象，这个学号no变量的内存空间是不存在的，只有创建了对象，这个no变量内存空间才会创建


    //学号
    int no;
    //姓名
    String name;
    //性别
    boolean sex;
    //年龄
    int age;
    //住址
    String address;
    //成员变量没有手动赋值的化，系统赋默认值
    /*
        数据类型                        默认值
        --------------------------------------
        byte,short,int,long            0
        float,double                   0.0
        boolean                        false
        char                           \u0000
        引用数据类型                     null 空值
     */

    //方法
    //方法描述的是对象的动作信息
    //当前例子就只描述属性了，不描述方法。
}