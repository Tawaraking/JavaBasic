import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.print("ป้อนอาการของโรค  = ");
        String panic = kb.nextLine();
        String name;
        // if(month == 1){
        //     name = "มกราคม";
        // }else if(month == 2){
        //     name = "กุมภา";
        // }else if(month == 3){
        //     name = "มีนา";
        // }else{
        //     name = "เดือนอื่นๆ";
        // }
        // System.out.println(name);
        switch (panic) {
            case "ปวดหัว":
                name = "ไมเกรน";
                break;
            case  "ปวดท้อง":
                name = "กะเพราะ";
                break;
            case "ปวดไหล่":
                name = "ข้อไม่ดี";
                break;
            default:
                name = "โรคอื่นๆ";
                break;
        }
        System.out.println(name);
    }
}