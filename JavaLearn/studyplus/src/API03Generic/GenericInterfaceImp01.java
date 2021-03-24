package API03Generic;

/*
    含有泛型的接口,第一种使用方式:在实现类中指定接口的泛型
    public interface Iterator<E> {
        E next();
    }
*/
public class GenericInterfaceImp01 implements GenericInterface <String>{
    @Override
    public void method(String i) {
        System.out.println(i);
    }
}
