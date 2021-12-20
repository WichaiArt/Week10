package Week10;

public class IfElse_Compare2Number {
    public static void main(String[] args) {
        // ตัวเลขที่ 1 มากกว่า ตัวเลขที่ 2 
        // ตัวเลขที่ 1 น้อยกว่า ตัวเลขที่ 2 
        // ตัวเลขที่ 1 เท่ากับ ตัวเลขที่ 2 
    
        //รับต้วเลขเข้ามา สองตัว
        int number1 = 10, number2 = 33;  
        
        //เปรียบเทียบตัวเลขทั้งสอง
        if (number1 > number2) {
            System.out.println(number1 + " มากกว่า "+ number2);
            
        } else if (number1 < number2){
            System.out.println(number1 + " น้อยกว่า "+ number2);
            
        } else {
            System.out.println(number1 + " เท่ากับ "+ number2);
        }
    }
}
