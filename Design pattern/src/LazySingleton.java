package com.cn.test.DesignPattern.Singleton;
public class LazySingleton{

	public static LazySingleton ls = null;
	public static LazySingleton getInstance(){

		if(ls == null)
			ls = new LazySingleton();
		return ls;
	}

	public void show(){

		System.out.println("123");
	}

	public static void main(String[] args){

		LazySingleton lazy = LazySingleton.getInstance();
		lazy.show();
	}
}
