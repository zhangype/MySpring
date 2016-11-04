package helloworld;
/**
 * 静态工厂
 * @author zhangype@yonyou.com
 *
 */
public class HelloApiStaticFactory {
	
	public static HelloApi newInstance(String message) {
		// 返回需要的Bean实例
		System.out.println("使用静态工厂实例化bean");
		return new HelloImpl2(message);
	}
	
	public HelloApi getInstance(String message) {
		System.out.println("使用实例工厂方法");
		return new HelloImpl2(message);
	}
}
