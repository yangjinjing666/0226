package com.yangjinjing.math;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	public static void main(String[] args) throws IOException {
		//加载上下文文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//家在服务到容器
		context.start();
		
		//加一个阻塞
		System.in.read();
	}
}
