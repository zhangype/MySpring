package chapter3;

import java.beans.ConstructorProperties;

import helloworld.HelloApi;

public class HelloImpl3 implements HelloApi {

	/**
	 * 
	 * Spring IoC容器注入依赖资源主要有以下实现方式：
	 * 1、构造器注入：就是容器实例化Bean时注入那些依赖，通过在在Bean定义中指定构造器参数进行注入依赖，包括实例工厂方法参数注入依赖，但静态工厂方法参数不允许注入依赖；
	 * 2、setter注入：通过setter方法进行注入依赖；
	 * 3、方法注入：能通过配置方式替换掉Bean方法，也就是通过配置改变Bean方法 功能。
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
