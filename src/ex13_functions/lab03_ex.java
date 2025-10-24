package ex13_functions;

public class lab03_ex {
    public static void main(String[]args){
        non_return_type_function();
        String name=return_string_type_function();
        System.out.println(name);
    }
    static void non_return_type_function(){

    System.out.println("Hi,I will return nothing");

}
static String return_string_type_function(){
    System.out.println("Hi,I will return something");
    return "shravani";
}
static boolean return_boolean(){
        return true;
}
static float return_float_pi_value(){
        return 3.14f;
}
static byte return_byte(){
        return 100;
}
static long return_long(){
        return 10l;
}
}

