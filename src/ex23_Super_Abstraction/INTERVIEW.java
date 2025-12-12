package ex23_Super_Abstraction;

public class INTERVIEW {
}
interface I11{}
interface  I12{}
class A1{}
class B1{}
class Test3 implements I11{}
class Test4 implements I12,I11{}
class Test5 extends A1 implements I11,I12{}
//class Test2 extends A1,B1{} not possible

//class Test5 implements I11 extends A{} not possible

//interface I3 extends A1{} not possible
