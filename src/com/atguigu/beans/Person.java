package com.atguigu.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person implements InitializingBean,DisposableBean {
	
	public Person(){
		System.out.println("Person's constructor...");
	}

	private Book book;

	@Autowired//这个注解不仅可以作用在属性上，还可以作用在方法上，不过作用都一样，即给Bean的对象实例的属性赋值
	public void setBook(Book book) {
		System.out.println("Person's setBook...");
		this.book = book;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Person...destroy...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person...afterPropertiesSet...");
	}

	@Override
	public String toString() {
		return "Person{" +
				"book=" + book +
				'}';
	}

}
