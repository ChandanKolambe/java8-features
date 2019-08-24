package interfaceMethods;

public interface Java8Interface {

	/////////////////// Default methods//////////////////////

	/**
	 * Prior to Java 8, we could have only method declarations in the interfaces.
	 * But from Java 8, we can have default methods and static methods in the
	 * interfaces. A default method cannot override a method from java.lang.Object.
	 * 
	 * The reasoning is very simple, it’s because Object is the base class for all
	 * the java classes. So even if we have Object class methods defined as default
	 * methods in interfaces, it will be useless because Object class method will
	 * always be used. That’s why to avoid confusion, we can’t have default methods
	 * that are overriding Object class methods.
	 */
	default void info() {
		System.out.println("Default method in interface");
	}

	default double findSqrt(double number) {
		return Math.sqrt(number);
	}

	/////////////////// Static methods//////////////////////

	/**
	 * Java interface static method is similar to default method except that we
	 * can’t override them in the implementation classes.
	 * 
	 * Java interface static method helps us in providing security by not allowing
	 * implementation classes to override them.
	 */
	static double pow(double number, double pow) {
		return Math.pow(number, pow);
	}
}
