package Chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //주차요금 시간당 4000원(일일 최대 요금 30000원)
        //경차, 장애인 차량 50% 할인
        // 일반 차 5시간 20000원
        // 경차 5시간 10000원
        //장애인 10시간 15000원
        int hour=10;
        int price = 4000;
        int fee=hour*price;
        boolean light = false;
        boolean disabled = true;


        if(fee>30000){
            fee=30000;
        }
        if(light || disabled){
            fee /= 2;
        }

        System.out.println("주차 요금은 "+fee+"원 입니다.");
    }
}
