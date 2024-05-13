package section01.generic.ex01;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object;

        Integer integer2 = (Integer) integerBox.get(); //Object -> Integer 캐스팅

        System.out.println("integer = " + integer);
        System.out.println("integer2 = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        hello(integerBox);
    }

    private static void hello(ObjectBox integerBox) {
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
