package helloworld;
/**
 * ��̬����
 * @author zhangype@yonyou.com
 *
 */
public class HelloApiStaticFactory {
	
	public static HelloApi newInstance(String message) {
		// ������Ҫ��Beanʵ��
		System.out.println("ʹ�þ�̬����ʵ����bean");
		return new HelloImpl2(message);
	}
	
	public HelloApi getInstance(String message) {
		System.out.println("ʹ��ʵ����������");
		return new HelloImpl2(message);
	}
}
