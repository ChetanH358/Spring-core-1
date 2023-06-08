package setter.collection.map_type_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("setter/collection/map_type_dependency/sprinfconfig2.xml");
		Country c2 = (Country) c1.getBean("country");
		System.out.println(c2);

//		interface try to create object for multiple employee as interface donot create object internally it create 
//		object for implementation classe of map interface

		System.out.println(c2.getStateandlanguage().getClass());
	}

}
