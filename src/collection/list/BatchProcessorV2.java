package collection.list;

public class BatchProcessorV2 {

    //MyLinkedList 구현체에 의존하는 문제점
    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
    }
}
