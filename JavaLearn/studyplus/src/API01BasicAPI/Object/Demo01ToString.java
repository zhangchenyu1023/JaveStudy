package API01BasicAPI.Object;

public class Demo01ToString{
    public static void main(String[] args) {

        Person p = new Person("张三",18);
        System.out.println(p.toString()); // (地址) com.itheima.demo01.API01.Object.Person@75412c2f | abc | Person{name=张三 ,age=18}

    }
}
