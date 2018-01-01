public class TestDouble
{
    public static void main(String[] args)
    {
        double d1 = 1;
        System.out.println( d1 );

        //1默认是int，int的范围比float范围小，所以会自动类型转换
        float f1 = 1;

        //1.0默认是double，赋予给float就必须强制类型转换，或者在数字的后面加上F。
        //在数字后面加上F，用于告诉javac，数字不是double，而是float。
        float f2 = 1.0F;

        double d2 = 0.0005;
        double d3 = 0.0001;

        // 浮点在小数转换为十进制的时候，可能产生误差。这种误差是在IEEE里面规定的。
        // 为了解决这种误差，在以后会使用BigDecimal类来解决问题。BigDecimal在讲“常用API的时候会讲到”
        double d4 = d2 + d3;
        System.out.println( d4 );

        double d5 = 5 / 0.0;
        double d6 = 100000/ 0.0;
        //判断d5是否等于d6，如果相等返回true
        System.out.println( d5 == d6 );//true

        double d7 = -5 / 0.0;//负无穷大
        System.out.println( d5 == d7 );//false

        double d8 = 0.0 / 0;
        double d9 = 0.0 / 0;
        System.out.println( d8 == d9 );//false
    }
}
