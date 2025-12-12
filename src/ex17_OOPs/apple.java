package ex17_OOPs;

public class apple {
    public static void main(String[] args){
        cat c1;
        cat c2;
        cat c3=new cat();
        cat c4=new cat("Lucky");
        cat c5=new cat("spicy");
        cat c6=new cat("Mirchi");

        System.out.println(c4.name);
        System.out.println(c5.name);

        c5.running();
        c6.running();

    }
}

class cat{
    String name;
    cat(){
        name="Kitty";
    }
    cat(String name){
        this.name=name;
    }
    void running(){
        int local_var=10;
        System.out.println("Who is running"+this.name);
    }
}
