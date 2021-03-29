package API01BasicAPI.Object;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",19);

        System.out.println("p1:"+p1);//p1:com.itheima.demo01.API01.Object.Person@58ceff1
        System.out.println("p2:"+p2);//p2:com.itheima.demo01.API01.Object.Person@7c30a502

        System.out.println(p1.equals(p2));//false
    }
}
