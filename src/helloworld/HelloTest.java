package helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	BeanFactory bf = new ClassPathXmlApplicationContext("helloworld.xml");
	
//	@Test
//	public void testHelloWorld() {
//		// 1、读取配置文件实例化一个IoC容器
//		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
//		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
//		HelloApi helloApi = context.getBean("hello", HelloApi.class);
//		
//		// 直接获得HelloImpl
//		HelloImpl helloImpl = context.getBean("hello", HelloImpl.class);
//		
//		// 3、执行业务逻辑
//		helloApi.sayHello();
//		helloImpl.sayHello();
//	}

	/*
	@Test
	public void testBeanFactory(){
		// 一、  不指定id，只配置必须的全限定类名，由IoC容器为其生成一个标识，客户端必须通过接口“T getBean(Class<T> requiredType)”获取Bean
		HelloApi hi = bf.getBean(HelloApi.class);
		hi.sayHello();
	}
	 */
	
	/**
	 * 从定义来看，name或id如果指定它们中的一个时都作为“标识符”，那为什么还要有id和name同时存在呢？
	 * 这是因为当使用基于XML的配置元数据时，在XML中id是一个真正的XML的id属性，因此当其他的定义来引用这个id时就体现出id的好处了。
	 * 可以利用XML解析器来验证引用的这个id是否存在，从而更早的发现是否引用了一个不存在的bean，
	 * 而使用name，则可能要在真正使用bean时才能发现引用一个不存在的bean。
	 */
//	@Test
//	public void testGetBeanByAlias(){
//		// bf.getAliases("hello4")获取除“hello4”的所有限定名
//		String[] a = bf.getAliases("hello4");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		// bf.getAliases("alias1")获取除“alias1”的所有限定名
//		String[] b = bf.getAliases("alias1");
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
//		
//		//根据id获取bean
//	    HelloApi hello6 = bf.getBean("hello6", HelloApi.class);
//	    hello6.sayHello();
//	    
//	    //根据别名获取bean
//	    HelloApi name6 = bf.getBean("name6", HelloApi.class);
//	    name6.sayHello();
//	    HelloApi name7 = bf.getBean("name7", HelloApi.class);
//	    name7.sayHello();
//	    
//	    String[] beanAlias = bf.getAliases("hello6");
//	    for(String alias : beanAlias) {
//	        System.out.println(alias);
//	    }
//	}
	
//	@Test
//	public void testInstantiatingBeanByConstructor(){
//		HelloApi hello7 = bf.getBean("hello7", HelloImpl2.class);
//		hello7.sayHello();
//		HelloApi hello8 = bf.getBean("hello8", HelloImpl2.class);
//		hello8.sayHello();
//	}
	
//	@Test
//	public void testInstantiatingBeanByStaticFactory(){
//		HelloApi hello9 = bf.getBean("hello9", HelloImpl2.class);
//		hello9.sayHello();
//	}
	
	@Test
	public void testInstantiatingBeanByInstanceFactory(){
//		HelloApi hello10 = bf.getBean("hello10", HelloImpl2.class);
//		hello10.sayHello();
	}
}
