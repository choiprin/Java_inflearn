package Chapter_06;

public class _07_VariableScope {
    public static void methodB(){
        int result=1; //지역 변수
    }

    public static void main(String[] args) {
        int number=3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        {
            int j=0;
            System.out.println(j);
            System.out.println(number);
        }
    }
}
