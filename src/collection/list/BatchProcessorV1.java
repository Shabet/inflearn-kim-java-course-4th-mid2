package collection.list;

public class BatchProcessorV1 {

    //MyArrayList 구현체에 의존하는 문제점
    private final MyArrayList<Integer> list = new MyArrayList<>();

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
    }
}
