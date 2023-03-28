package Chapter_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //키 120cm 이상 탑승가능
        //삼항 연산자 사용

        //키가 115cm 이므로 탑승 불가능합니다
        //키가 121cm 이므로 탑승 가능합니다

        int tallA = 115;
        int tallB = 121;
        String checkA = (tallA>=120)? "가능" : "불가능";
        String checkB = (tallB>=120)? "가능" : "불가능";

        System.out.println("키가 " + tallA +"cm 이므로 탑승 " + checkA + "합니다");
        System.out.println("키가 " + tallB +"cm 이므로 탑승 " + checkB + "합니다");
    }
}
