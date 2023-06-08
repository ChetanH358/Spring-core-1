package setter.reference_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("setter/reference_dependency/sprinfconfig2.xml");
		Person c2 = (Person) c1.getBean("person");
		System.out.println(c2);	

		System.out.println(c2.getAddress().getClass());
	}

}
