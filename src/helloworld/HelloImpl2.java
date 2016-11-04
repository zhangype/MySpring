package helloworld;

public class HelloImpl2 implements HelloApi{

	@Override
	public void sayHello() {
		System.out.println("Hello World2!");
	}

	public HelloImpl2(String message){
		System.out.println("非默认构造器" + message);
	}
	
	public HelloImpl2(){
		System.out.println("默认构造器");
	}
}
