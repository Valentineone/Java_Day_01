package Day_02_Practice;
//1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
/*

2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。



        3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是
        前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的
        所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。

        4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";再为这个类添
        加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把"Hello Constructor"和接收的参数
        一起打印出来。*/

class Text1{
    private int index;
    private char ch;
    public int getIndex() {
        return this.index;
    }
    public char getChar() {
        return this.ch;
    }
}
class Person {
    public static int age;
    public  String name;
    public static String country;
}
class Fibonacci {
    public int fibonacci(int n) {
        if(n <= 2)
        {
            return 1;
        }
        else
        {
            return  fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
class Hello{
    Hello() {
        System.out.println("Hello Constructor");
    }
    Hello(String str) {
        System.out.println("Hello Constructor");
        System.out.println(str);
    }
}
public class PracticeOne{
    public static void main(String[] args) {
        Text1 text = new Text1();
        System.out.println(text.getIndex()+"--"+text.getChar()+"--");
//--------------------------------------------------------------------
        Person perone = new Person();
        perone.name = "wangchong";
        perone.age = 19;
        perone.country = "China";
        Person pertwo = new Person();
        pertwo.name = "Peter";
        pertwo.age = 29;
        pertwo.country = "British";
        System.out.println(perone.country);
        System.out.println(pertwo.country);
        //3
        int i = 0;
        Fibonacci fibo = new Fibonacci();
        for(i = 1 ;i <= 5 ; i++)
        System.out.print(fibo.fibonacci(i) + " ");
//4
        Hello hello = new Hello();
        Hello hellotwo = new Hello("Hello world");
    }
}
