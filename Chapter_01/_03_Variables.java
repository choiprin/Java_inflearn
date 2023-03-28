package Chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "윤섭";
        int hour = 10;
        char test = 'A';
        boolean bleStatus = true;
        System.out.println(name);

        double d = 3.1412345312535;
        float f = 3.14346546456345F;
        System.out.println(d);
        System.out.println(f);

        //int i = 101010101010100; // i 자료형의 최대치 초과
        long i = 101010101010100L;
        i = 101_010_101_010_100L; // 가시성을 높이기 위해 _ 추가
        System.out.println(i);
    }
}
