package org.fkjava.test;

import java.util.regex.Pattern;
public class TestPattern
{
    public static void main(String[] args)
    {        
        System.out.println("Pattern.matchers('b', 'b'):" + Pattern.matches("b", "b"));//true
        System.out.println("Pattern.matchers('b', 'c'):" + Pattern.matches("b", "c"));//false


        System.out.println("Pattern.matchers('[abc]', 'c'):" + Pattern.matches("[abc]", "c"));//true
        System.out.println("Pattern.matchers('[abc]', 'd'):" + Pattern.matches("[abc]", "d"));//false

        System.out.println("Pattern.matchers('[^abc]', 'd'):" + Pattern.matches("[^abc]", "d"));//true
        System.out.println("Pattern.matchers('[^abc]', 'c'):" + Pattern.matches("[^abc]", "c"));//false
    }
}
