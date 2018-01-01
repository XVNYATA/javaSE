package org.fkjava.test;

import org.fkjava.bean.Season;
 
// 重点掌握
public class TestSwitch {

	public static void main(String[] args) {
		// 创建枚举
		Season s = Season.SPRING;
		// 测试
		switch (s) {
		case SPRING:
			System.out.println("春暖花开，正好踏青");
			break;
		case SUMMER:
			System.out.println("夏日炎炎，适合游泳");
			break;
		case FALL:
			System.out.println("秋高气爽，进补及时");
			break;
		case WINTER:
			System.out.println("冬日雪飘，围炉赏雪");
			break;
		}

	}

}
