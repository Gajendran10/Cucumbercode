package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Priorityexe {
	
	@Before
	public static void beforepr() {
		System.out.println("before method with no priority");
	}

	@Before(order = 10)
	public static void before10pr() {
		System.out.println("before method with + 10 priority");
	}

	@Before(order = -20)
	public static void before20pr() {
		System.out.println("before method with -20 priority");
	}

	@After
	public static void afterpr() {
		System.out.println("after with no priority");
	}

	@After(order = -10)
	public static void after10pr() {
		System.out.println("after method with -10 priority");
	}

	@After(order = 8)
	public static void after8pr() {
		System.out.println("after with +8  priority");
	}

}
