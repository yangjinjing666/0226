package com.yangjinjing;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjinjing.math.service.CalulateService;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext contxt;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("输入A");
		int a = scanner.nextInt();
		System.err.println("输入B");
		int b = scanner.nextInt();
		contxt = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		CalulateService calulateService = contxt.getBean(CalulateService.class);
		
		int jiafa = calulateService.jiafa(a, b);
		System.out.println("----" + a +"+"+ b +"="+ jiafa);
		
		int jianfa = calulateService.jianfa(a, b);
		System.out.println("----" + a +"-"+ b +"="+ jianfa);
		
		int chegnfa = calulateService.chegnfa(a, b);
		System.out.println("----" + a +"*"+ b +"="+ chegnfa);
		
		int chufa = calulateService.chufa(a, b);
		System.out.println("----" + a +"/"+ b +"="+ chufa);
		
		
	}
}
