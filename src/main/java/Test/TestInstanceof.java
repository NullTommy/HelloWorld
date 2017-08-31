package Test;

public class TestInstanceof {

    public static void main(String[] args) {
        //Test.C Test.B Test.A
        A a = null;
        B b = null;
        boolean res;

//        System.out.println("instanceoftest test case 1: ------------------");
//        res = a instanceof Test.A;
//        System.out.println("a instanceof Test.A: " + res);
//
//        res = b instanceof Test.B;
//        System.out.println("b instanceof Test.B: " + res);
//
//        System.out.println("/ninstanceoftest test case 2: ------------------");
//        a = new Test.B();
//        b = new Test.B();
//
//        res = a instanceof Test.A;
//        System.out.println("a instanceof Test.A: " + res);
//
//        res = a instanceof Test.B;
//        System.out.println("a instanceof Test.B: " + res);
//
//        res = b instanceof Test.A;
//        System.out.println("b instanceof Test.A: " + res);
//
//        res = b instanceof Test.B;
//        System.out.println("b instanceof Test.B: " + res);
//
//        System.out.println("/ninstanceoftest test case 3: ------------------");
//        Test.B b2 = (Test.C) new Test.C();
//        Test.C b2 =  new Test.C();
//        Test.B b2 =  new Test.B();
        B b2 = (B) new C();
//        Test.C b2 = (Test.C) new Test.B();



        res = b2 instanceof A;
        System.out.println("b2 instanceof Test.A: " + res);

        res = b2 instanceof B;
        System.out.println("b2 instanceof Test.B: " + res);

        res = b2 instanceof C;
        System.out.println("b2 instanceof Test.C: " + res);


    }
}


interface A{}
class B implements A{

}
class C extends B {

}