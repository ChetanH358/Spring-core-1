package setter.collection.list_type_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("setter/collection/list_type_dependency/sprinfconfig2.xml");
		Company c2 = (Company)c1.getBean("company");
		System.out.println(c2);
//		interface try to create object for multiple employee as interface donot create object internally it create 
//		object for implementation classe of list interface
		System.out.println(c2.getEmployees().getClass());
	}

}
