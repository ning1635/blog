package com.cn.test.DesignPattern.Singleton;

/*
 * 饿汉单例模式
 * 缺点：对象没有使用之前就被初始化。
 *
 */
public class EagerSingleton{

	public static EagerSingleton eager = new EagerSingleton();

	public static EagerSingleton getInstance(){

		return eager;
	}

	public String show(){

		return "show info";
	}

	public static void main(String[] args){

		System.out.println(
			EagerSingleton.getInstance().show());
	}
}
