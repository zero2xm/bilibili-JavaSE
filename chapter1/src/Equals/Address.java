package Equals;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class Address {
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    //注意：这里并没有重写equals方法
    //这里的equals方法判断的是：Address对象和Address对象是否相等。

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Address)) return false;
        if(this == o) return true;

        Address a = (Address) o;
        if (this.city.equals(a.city) && this.street.equals(a.street) && this.zipcode.equals(a.zipcode)){
            return true;
        }
        return false;
    }
}