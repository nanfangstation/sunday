
package everyobject;

import org.junit.Test;

/**
 * super和this的异同：

 super（参数）：调用基类中的某一个构造函数（应该为构造函数中的第一条语句）
 this（参数）：调用本类中另一种形成的构造函数（应该为构造函数中的第一条语句）
 super:　它引用当前对象的直接父类中的成员（用来访问直接父类中被隐藏的父类中成员数据或函数，基类与派生类中有相同成员定义时如：super.变量名    super.成员函数据名（实参）
 this：它代表当前对象名（在程序中易产生二义性之处，应使用this来指明当前对象；如果函数的形参与类中的成员数据同名，这时需用this来指明成员变量名）
 调用super()必须写在子类构造方法的第一行，否则编译不通过。每个子类构造方法的第一条语句，都是隐含地调用super()，如果父类没有这种形式的构造函数，那么在编译的时候就会报错。
 super()和this()类似,区别是，super()从子类中调用父类的构造方法，this()在同一类内调用其它方法。
 super()和this()均需放在构造方法内第一行。
 尽管可以用this调用一个构造器，但却不能调用两个。
 this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，其它的构造函数必然也会有super语句的存在，所以在同一个构造函数里面有相同的语句，就失去了语句的意义，编译器也不会通过。
 this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：static变量,static方法，static语句块。
 从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字。

 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-25 12:51
 */
public class ThisAndSuper {
    // 形参与成员名字重名，用this来区分
    @Test
    public void test() {
//        Person lydia = new Person();
//        System.out.println("lydia's age is " + lydia.getAge(12));

        Chinese cn = new Chinese();
//        cn = new Chinese("codersai");
        cn = new Chinese("codersai", 18);
    }
}

class Person {
    private int age = 10;

    public static void prt(String s) {
        System.out.println(s);
    }

    Person() {
        prt("父类·无参数构造方法： " + "A Person.");
    }//构造方法(1)

    Person(String name) {
        prt("父类·含一个参数的构造方法： " + "A person's name is " + name);
    }//构造方法(2)

    public int getAge(int age) {
        this.age = age;
        return this.age;
    }
}

class Chinese extends Person {
    Chinese() {
        super(); // 调用父类构造方法（1）
        prt("子类·调用父类”无参数构造方法“： " + "A chinese coder.");
    }
//
    Chinese(String name) {
        super(name);// 调用父类具有相同形参的构造方法（2）
        prt("子类·调用父类”含一个参数的构造方法“： " + "his name is " + name);
    }

    Chinese(String name, int age) {
        this(name);// 调用具有相同形参的构造方法（3）
        prt("子类：调用子类具有相同形参的构造方法：his age is " + age);
    }
}
