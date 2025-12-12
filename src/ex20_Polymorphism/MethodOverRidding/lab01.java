package ex20_Polymorphism.MethodOverRidding;


public class lab01{
    public static void main(String[] args) {
        // Runtime Polymophism.


//        Shravani p1  = new Shravani();
//        p1.home();

//        father f1 = new father();
//        f1.home();

        father f2 = new Shravani(); // Dynamic Dispatch /
        f2.home();


    }
}


class father{
    void home(){
        System.out.println("2BHK");
    }
}

class Shravani extends father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}