package chapter3;

import helloworld.HelloApi;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChapter3 {
//	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/constructorDependencyInject.xml");
//	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");
//	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");
//	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/setterDependencyInject.xml");
//	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");
//  BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/propertiesInject.xml");
	BeanFactory bf = new ClassPathXmlApplicationContext("chapter3/pNamespaceInject.xml");

//	@Test  
//	public void testConstructorDependencyInjectTest() {
//		//获取根据参数索引依赖注入的Bean
//		HelloApi byIndex = bf.getBean("byIndex", HelloApi.class);  
//		byIndex.sayHello();
//		//获取根据参数类型依赖注入的Bean
//		HelloApi byType = bf.getBean("byType", HelloApi.class);  
//		byType.sayHello();
//		
//		/**
//		 * 确保编译时class文件包含“变量信息”，实现方式如下：
//		 * 1、Properties-->Java Compiler-->Add variable attributes to generated class files(used by debugger)
//		 * 2、@ConstructorProperties
//		 */
//		//获取根据参数名字依赖注入的Bean
//		HelloApi byName = bf.getBean("byName", HelloApi.class);  
//		byName.sayHello(); 
//	}

//    @Test  
//    public void testSetterDependencyInject() {
//    	HelloApi bean = bf.getBean("bean", HelloApi.class);  
//        bean.sayHello();  
//    }
	
//	@Test
//	public void testIdRefBean() {
//		IdRefTestBean bean = bf.getBean("idrefBean1", IdRefTestBean.class);
//		System.out.println(bean.getId());
//	}

    //注入Properties类型值
//    @Test
//    public void testPropertiesInject() {
//        PropertiesBean propertiesBean = bf.getBean("propertiesBean", PropertiesBean.class);
//        System.out.println(propertiesBean.getValues().size());
//        System.out.println(propertiesBean.getValues().containsValue("22"));
//
//        PropertiesBean propertiesBean2 = bf.getBean("propertiesBean2", PropertiesBean.class);
//        System.out.println(propertiesBean2.getValues().size());
//        System.out.println(propertiesBean2.getValues().containsKey("1"));
//        System.out.println(propertiesBean2.getValues().containsKey("2"));
//        System.out.println(propertiesBean2.getValues().containsKey("3"));
//        System.out.println(propertiesBean2.getValues().containsKey("4"));
//        System.out.println(propertiesBean2.getValues().containsKey("5"));
//        System.out.println(propertiesBean2.getValues().containsValue("11"));
//    }
    
//    @Test  
//    public void testLocalAndparentBeanInject() {  
//	    //初始化父容器
//	    ApplicationContext parentBeanContext = new ClassPathXmlApplicationContext("chapter3/parentBeanInject.xml");
//	    
//	    //初始化当前容器
//	    ApplicationContext beanContext = new ClassPathXmlApplicationContext(new String[] {"chapter3/localBeanInject.xml"}, parentBeanContext);
//	    HelloApi bean1 = beanContext.getBean("bean1", HelloApi.class);
//	    bean1.sayHello();//该Bean引用local bean
//	    
//	    HelloApi bean2 = beanContext.getBean("bean2", HelloApi.class);
//	    bean2.sayHello();//该Bean引用parent bean
//    }
    
    @Test
    public void testPnameSpaceInject(){
    	IdRefTestBean bean1 = bf.getBean("idrefBean1", IdRefTestBean.class);
    	System.out.println(bean1.getAbc());
    }
}
