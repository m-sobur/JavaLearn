package function;

public class MyFunction {
    public static void main(String[] args) {
        Object res = new Integer(6);

        // TODO: 15/11/2023
        //  1)
        StringToInt<? super String, Object> parse = str -> Integer.parseInt(str);

        Object result = parse.apply((String) res);
        System.out.println(result);

    }
}

interface StringToInt<T, R> {
    R apply(T element);

    default <U> StringToInt<T, U> andThen(StringToInt<R, U> afterFunction) {
        return x -> afterFunction.apply(apply(x));
    }
}
