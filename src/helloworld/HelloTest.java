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
//		// 1����ȡ�����ļ�ʵ����һ��IoC����
//		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
//		// 2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�
//		HelloApi helloApi = context.getBean("hello", HelloApi.class);
//		
//		// ֱ�ӻ��HelloImpl
//		HelloImpl helloImpl = context.getBean("hello", HelloImpl.class);
//		
//		// 3��ִ��ҵ���߼�
//		helloApi.sayHello();
//		helloImpl.sayHello();
//	}

	/*
	@Test
	public void testBeanFactory(){
		// һ��  ��ָ��id��ֻ���ñ����ȫ�޶���������IoC����Ϊ������һ����ʶ���ͻ��˱���ͨ���ӿڡ�T getBean(Class<T> requiredType)����ȡBean
		HelloApi hi = bf.getBean(HelloApi.class);
		hi.sayHello();
	}
	 */
	
	/**
	 * �Ӷ���������name��id���ָ�������е�һ��ʱ����Ϊ����ʶ��������Ϊʲô��Ҫ��id��nameͬʱ�����أ�
	 * ������Ϊ��ʹ�û���XML������Ԫ����ʱ����XML��id��һ��������XML��id���ԣ���˵������Ķ������������idʱ�����ֳ�id�ĺô��ˡ�
	 * ��������XML����������֤���õ����id�Ƿ���ڣ��Ӷ�����ķ����Ƿ�������һ�������ڵ�bean��
	 * ��ʹ��name�������Ҫ������ʹ��beanʱ���ܷ�������һ�������ڵ�bean��
	 */
//	@Test
//	public void testGetBeanByAlias(){
//		// bf.getAliases("hello4")��ȡ����hello4���������޶���
//		String[] a = bf.getAliases("hello4");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		// bf.getAliases("alias1")��ȡ����alias1���������޶���
//		String[] b = bf.getAliases("alias1");
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
//		
//		//����id��ȡbean
//	    HelloApi hello6 = bf.getBean("hello6", HelloApi.class);
//	    hello6.sayHello();
//	    
//	    //���ݱ�����ȡbean
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
