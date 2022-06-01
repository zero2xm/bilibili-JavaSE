package Final;

public class Chinese {
    // 身份证号，每个人都不一样，对象级别的
    String idCard;
    //姓名，对象不同姓名不一样。
    String name;
    //国家的值是一个固定值："中国"
    //实例变量在堆中，一个对象一份。100个对象100份。
    //实例变量既然使用final修饰了，说明该实例变量值不会随着对象的变化而变化。
    //该实例变量前面应该添加：static关键字，变为静态的，存储在方法区。
    static final String COUNTRY = "中国";
}
