package section01.generic.ex01;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        GenericBox<Object> integerBox2 = new GenericBox<>(); //권장
        integerBox.set(10);
//        String result = (String) integerBox.get(); //에러
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
