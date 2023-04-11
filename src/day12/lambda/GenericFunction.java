package day12.lambda;

public interface GenericFunction<X, Y> {
    //x를 주면 y을 내줌
    Y apply(X x);

}
