package note1;

/**
 * @author solang
 * @date 2021-03-20 10:16
 */
public class BasicNote {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte b_=10;

        short s=100;
        int x=1000;
        long l=10000L;

        char c='s';

        float f=123.45F;
        double d=12345.5;

        int a=20;
        int b=20;
        if(a>b){
            System.out.println("a>b");
        }else if(a<b) {
            System.out.println("a<b");
        }else {
            System.out.println("a=b");
        }

        switch (a){
            case 10:{
                System.out.println("a=10");
                break;
            }
            case 20:{
                System.out.println("a=20");
                break;
            }
            default:{
                System.out.println("a=30");
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i="+i);
        }

        int i=0;
        while (i<10){
            System.out.println("i="+i);
            i++;
        }

        i=0;
        do {
            System.out.println("i="+i);
            i++;
        }while (i<10);

        int[] array1=new int[5];
        int[] array2=new int[]{1,2,3};
        int[] array3={1,2,3};
        System.out.println("array的地址:"+array1);

        for (int i1 = 0; i1 < array2.length; i1++) {
            System.out.println("array["+i1+"]="+array2[i1]);
        }

        System.out.println("较大的数是："+max(10,20));
    }
    public static int max(int n1,int n2){
        return n1>n2?n1:n2;
    }
}
