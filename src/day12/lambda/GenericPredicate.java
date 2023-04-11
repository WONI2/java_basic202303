package day12.lambda;

@FunctionalInterface
public interface GenericPredicate<Type> {
    //지정된 타입에 대한 검사를 수행

    boolean test(Type t); //타입을 변경할 수 있도록 만듦

}
