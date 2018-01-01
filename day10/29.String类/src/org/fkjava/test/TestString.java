package org.fkjava.test;

public class TestString
{
    public static void main(String[] aregs)
    {
        String s1 = "abcd";
        System.out.println( s1 );//abcd

        //s1的内容在前面声明以后，是不会改变的，下面这句话做的事情比较多
        /*
            1.把s1转换为StringBuilder
            2.把1234追加到StringBuilder里面
            3.把StringBuilder转换为String，这个时候得到一个新的String
            4.把新的String赋值给s1变量`
        */
        s1 = s1 + "1234";
        System.out.println( s1 );//abcd1234


        //下面这两行代码，产生了几个String对象？
        //Java 5之后，提供了字符串池的概念，在声明String的时候直接赋值，会把String内容放到池子里面
        //后面还使用相同的内容的String，会从池子里面获取已有的对象，不会产生两个String。
        //产生的一个String对象
        String s2 = "9876";
        String s3 = "9876";

        System.out.println( s2 == s3 );//true


        //下面两行代码，产生了几个String对象？
        String s4 = new String("qwer");//2个
        String s5 = new String("qwer");//1个
        System.out.println( s4 == s5 ); //false

        //把s4放到池子里面，如果s4的内容已经在池子里面，则直接返回池子里面的对象。
        //因为s4和s5被重新赋值，之前的String对象没有其他的变量指向该对象，将会被自动销毁。
        s4 = s4.intern();
        s5 = s5.intern();
        System.out.println( s4 == s5 ); //true

        //String里面常用的方法：
    }
}






