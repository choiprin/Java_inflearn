package Chapter_04;

import java.sql.SQLOutput;

public class _01_if {
    public static void main(String[] args) {
        int hour = 10; //오전 10시
        if(hour<14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

    }
}
