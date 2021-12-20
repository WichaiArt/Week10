package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข เเล้วบอกให้ได้วง่า ตัวเลขนั้นเป็นจำนวนตัว บวก หรือไม่
        int number = 22;
        String result = "";

        if (number > 0) {// กรณีการตรวจสอบจำนวนเต็มบวก
            result = number+" เป็นจำนวนเต็มบวก";
        } else if (number < 0) {// กรณีการตรวจสอบจำนวนเต็มลบ
            result =number+" เป็นจำนวนเต็มลบ";
        } else {// กรณีการตรวจสอบจำนวนเต็ม 0
            result =number+" เป็นจำนวนเต็มศูนย์";
        }
        System.out.println("result");

        //...การเขียนเเบบ IF อย่างเดียว
        // // กรณีการตรวจสอบจำนวนเต็มบวก
        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // // กรณีการตรวจสอบจำนวนเต็มลบ
        // if (number < 0) {
        // System.out.println("เป็นจำนวนเต็มลบ");

        // }
        //// กรณีการตรวจสอบจำนวนเต็ม 0
        // if (number == 0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        // }
    }
}
