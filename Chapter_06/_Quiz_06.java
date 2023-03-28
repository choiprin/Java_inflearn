package Chapter_06;

public class _Quiz_06 {
    public static String getHiddenData(String data,int number){
        String addData = "";
        String editData = data.substring(0,number);
        for (int i = 0; i < data.length()-editData.length(); i++) {
            addData +="*";
        }
        editData += addData;
        return editData;
    }

    public static void main(String[] args) {
        String name = "홍길동";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : "+getHiddenData(name,1));
        System.out.println("주민등록번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));
    }
}
