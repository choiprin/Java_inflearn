package Chapter_05;

public class _01_Array {
    public static void main(String[] args) {
//        String[] coffee = new String[4];
//        coffee[0] = "아메리카노";
//        coffee[1] = "카페모카";
//        coffee[2] = "라떼";
//        coffee[3] = "카푸치노";

//        String[] coffee = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        String[] coffee = {"아메리카노","카페모카","라떼","카푸치노"};
        System.out.println(coffee[0]+" 하나");
        System.out.println(coffee[1]+" 하나");
        coffee[2]="에스프레소";
        System.out.println(coffee[2]+" 하나");
        System.out.println(coffee[3]+" 하나");
        System.out.println("주세요.");

        int[] i=new int[3];
        i[0]=1;
        i[1]=2;
        i[2]=3;
        double[] d = new double[] {10.0,11.2,13.5};
        boolean[] b = {true,false,false};
    }
}
