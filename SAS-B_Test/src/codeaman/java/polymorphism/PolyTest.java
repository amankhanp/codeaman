package codeaman.java.polymorphism;

class Poly1 {
    void poly1_Method1(){
        System.out.println("Poly1-poly1_Method1: Method-1");
    }
    void x_overload(){
        System.out.println("Poly1-x_overload: Overloaded with Default params");
    }
    void x_overload(int int_params){
        System.out.println("Poly1-x_overload: Overloaded with Int params & Int value is :" +int_params);
    }
    void x_overload(String string_params){
        System.out.println("Poly1-x_overload: Overloaded with Int params & String value is :" +string_params);
    }
    void x_overload1(){
        System.out.println("Poly1-x_overload1: Overloaded with Default params");
    }
}
public class PolyTest extends Poly1 {
    void poly_Method1(){
        System.out.println("PolymorphismTest-poly_Method1: Method-1");
    }

    void x_overload1(){
        System.out.println("PolyTest-x_overload1: OverRide method with Default params");
    }

    public static void main(String[] args) {
        PolyTest polyTest_obj_polyTest = new PolyTest();
        /**
         * [Object] Initialization of PolyTest-class obj with PolyTest-class obj reference.
         * PolyTest is child class of Poly1(act as parent)
         * PolyTest extends Poly1.
         * All the member variables and member functions present in Poly1 are present in extended class(PolyTest).
         * Child class objVariable can hold Child-class object reference.
         */

        polyTest_obj_polyTest.poly_Method1();
        //Using child-class-object calling Child-Class method 'method-name: poly1_Method1'.

        /*
        * If this.Class not extends "poly1_method1" related class.
        * Syntax: polyTest_obj_polyTest.poly1_method1();
        * CompileTime Error: Cannot resolve method 'poly1_method1' in 'PolyTest'
        * */

        polyTest_obj_polyTest.poly1_Method1();
        //Using child-class-object calling Parent-Class method 'method-name: poly1_Method1'.

        polyTest_obj_polyTest.x_overload();
        //Using child-class-object calling overloaded method with 'default parameters'.

        polyTest_obj_polyTest.x_overload(10);
        //Using child-class-object calling overloaded method with 'int parameters'.

        polyTest_obj_polyTest.x_overload('C');
        //Using child-class-object calling overloaded method with 'int parameters'.

        polyTest_obj_polyTest.x_overload("JAVA");
        //Using child-class-object calling overloaded method with 'String parameters'.

        /*
        * [Object] Initialization of PolyTest-class obj with Poly1-class obj reference.
        * If 'PolyTest' is a child class and 'Poly1' parent class.
        * Then Child-class objVariable can't hold Parent-class object reference.
        * Syntax: PolyTest poly_obj_Poly1 = new Poly1();
        * CompileTime Error: Incompatible types.
        * */

        polyTest_obj_polyTest.x_overload1();
        /**
         * 'polyTest_obj_polyTest' is a object of child-class, it overrides the parent-class method.
         * If you want to get parent class method then create an object of parent-class and call the same method.
         */

        Poly1 poly1_obj_poly1 = new Poly1();
        /**
         * [Object] Initialization of Poly1-class obj with Poly1-class obj reference.
         * Parent-class object can't hold Child-class member variable & member functions.
         */
        poly1_obj_poly1.x_overload1();
        /**
         * 'poly1_obj_poly1' is a object of parent-class.
         * it simply runs parent-class method even though class contains the same over-ridden method,
         * because here, object is of parent-class type.
         */

        /*
        * 'poly1_obj_poly1' is Parent-class objVariable with Parent-Class obj reference.
        * Syntax: poly1_obj_poly1.poly_Method1();
        * Using parent.object we can't call child-class member functions.
        * CompileTime Error: cannot find symbol.
        * */
    }
}
