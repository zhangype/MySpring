package chapter3;

import helloworld.HelloApi;

public class HelloImpl4 implements HelloApi {
    private String message;
    private int index;

    @Override  
    public void sayHello() {  
        System.out.println(index + ":" + message);  
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
