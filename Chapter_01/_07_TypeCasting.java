package Chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        //int score = 90 + 93.7; int 형에 정수+실수 저장 불가능
        int score = 99;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        System.out.println("--------------------");

        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        System.out.println("--------------------");

        score = 93 + (int)98.8;
        System.out.println(score);

        score_d = 93 + 98.8;    // score_d 자체가 실수형이라서 93을 93.0으로 자동 인식
        System.out.println(score_d);

        double convertedDouble = score; // int형인 score을 자동으로 double 변환

        // int convertedInt = score_d; // 191.8을 191로 변환 불가능 ( 큰범위 -> 작은범위 불가능 )
        int convertedInt = (int) score_d; // 191.8을 191로 변환 불가능 ( 수동으로 int 선언 시 가능 )

        String s1 = String.valueOf(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");
        System.out.println(error);
    }
}
