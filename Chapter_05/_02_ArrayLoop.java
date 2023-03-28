package Chapter_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffee = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i <4; i++) {
            System.out.println(coffee[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------");

        for (int i = 0; i <coffee.length; i++) {
            System.out.println(coffee[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------");

        for (String coffees : coffee){ // coffee 배열의 하나하나 값을 coffees 에 저장해서 출력함
            System.out.println(coffees+" 하나");
        }
        System.out.println("주세요");
    }
}
