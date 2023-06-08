package setter.primitive_dependeny;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Entry point
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("setter/primitive_dependeny/springconfig.xml");
		Employee e1 = (Employee)c1.getBean("emp");
		System.out.println(e1);
	}
}
