package chapter3;

import java.beans.ConstructorProperties;

import helloworld.HelloApi;

public class HelloImpl3 implements HelloApi {

	/**
	 * 
	 * Spring IoC����ע��������Դ��Ҫ������ʵ�ַ�ʽ��
	 * 1��������ע�룺��������ʵ����Beanʱע����Щ������ͨ������Bean������ָ����������������ע������������ʵ��������������ע������������̬������������������ע��������
	 * 2��setterע�룺ͨ��setter��������ע��������
	 * 3������ע�룺��ͨ�����÷�ʽ�滻��Bean������Ҳ����ͨ�����øı�Bean���� ���ܡ�
	 */
	private String message;  
	private int index;  

//	@ConstructorProperties({"message", "index"})
	public HelloImpl3(String message, int index) {
		this.message = message;
		this.index = index * index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}
}
