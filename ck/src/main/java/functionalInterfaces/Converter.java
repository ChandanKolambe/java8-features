package functionalInterfaces;

/**
 * An interface with exactly one abstract method is called Functional
 * Interface. @FunctionalInterface annotation is added so that we can mark an
 * interface as functional interface.
 * 
 * It is not mandatory to use it, but it’s best practice to use it with
 * functional interfaces to avoid addition of extra methods accidentally. If the
 * interface is annotated with @FunctionalInterface annotation and we try to
 * have more than one abstract method, it throws compiler error.
 * 
 * The major benefit of java 8 functional interfaces is that we can use lambda
 * expressions to instantiate them and avoid using bulky anonymous class
 * implementation.
 */

@FunctionalInterface
public interface Converter<F, T> {

	T convert(F from);
}
