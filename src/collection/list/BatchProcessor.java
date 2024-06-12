package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    //생성자를 통하여 의존관계 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + " , 계산 시간: " + (endTime - startTime) + "ms");
    }
}
