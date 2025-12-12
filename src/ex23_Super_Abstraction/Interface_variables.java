package ex23_Super_Abstraction;

public class Interface_variables {
    public static void main(String[] args) {

    }
}
interface Shravani{
    final int a=10;
    void display();
}
class Kambli implements Shravani{
    int aa=10;
    @Override
    public void display(){
        System.out.println(a);
        System.out.println(this.aa);
    }
}

class Somya implements TTA{
   @Override
    public void practice(){

    }
}
class Shravani1 implements TTA{
    @Override
    public void practice(){

    }
}

interface TTA{
    void practice();
}
class Shravani_mentor implements TTA_mentor{
    @Override
    public void teach(){

    }
}

class Dipak implements TTA_mentor{
    @Override
    public void teach(){

    }
}

interface TTA_mentor{
    void teach();
}