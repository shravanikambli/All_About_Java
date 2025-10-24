package ex09_switch;

public class lab09_ex {
    public static void main(String []args){
        int itemcode=6;
        switch(itemcode){
            case 1,2,5:
                System.out.println("all of them are electronic gadget");
                break;
            case 4,6,8:
                System.out.println("this is matched");
                break;
            default:
                System.out.println("none of them are electronic gadget");




        }
    }
}
