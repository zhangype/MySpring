package chapter3;

import helloworld.HelloApi;

public class DependencyInjectByInstanceFactory {
	public HelloApi newInstance(String message, int index) {
		return new HelloImpl3(message, index);
	}
}
