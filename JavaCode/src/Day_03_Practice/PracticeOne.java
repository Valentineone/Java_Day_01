package Day_03_Practice;
/*1.定义一个Father和Child类，并进行测试。
        要求如下：
        1）Father类为外部类，类中定义一个私有的String类型的属性name，name的值为“zhangjun”。
        2）Child类为Father类的内部类，其中定义一个introFather()方法，方法中调用Father类的name属性。
        3）定义一个测试类Test，在Test类的main()方法中，创建Child对象，并调用introFather ()方法。

        2.简述下列程序运行结果:
class A{
    int y=6;
    class Inner{
        static int y=3;
        void show(){
            System.out.println(y);
        }
    }
}
class Demo{
    public static void main(String [] args){
        A.Inner inner=new A().new Inner();
        inner.show();
    }
}

3.写出下面程序运行结果:
class A{
    public A(){
        System.out.println(“A”);
    }
}

class B extends A{
    public B(){
        System.out.println(“B”);
    }

    public static void main(String[] args){
        B b=new B();
    }
}

4.编程题：
        打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。

        5.编程题：
        定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
        1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
        再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，
        该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
        2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
        并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
        同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法，
        并提供一个final sing()方法。
        3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle"
        在main()方法中制造Manager和Employee对象,并测试这些对象的方法。*/
public class PracticeOne {
}
