package API03Generic;

/**
含有泛型的类
 */
public class GenericClass <M>{
    private M name;

    public GenericClass() {
    }

    public GenericClass(M name) {
        this.name = name;
    }

    public M getName() {
        return name;
    }

    public void setName(M name) {
        this.name = name;
    }

    // 含有泛型的方法
    public <N> void method (N a){
        System.out.println(a);
    }
}
