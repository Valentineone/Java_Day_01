package Day_03_Practice;
//2.简述下列程序运行结果:
/*class A{
    int y=6;
    class Inner{
        static int y=3;
        void show(){
            System.out.println(y);
        }
    }
}
class PracticeTwo{
    public static void main(String [] args){
        A.Inner inner=new A().new Inner();
        inner.show();
    }
}*/
/*
* 结果报错，内部类不能含有静态成员变量，内部类依赖外部类存在，而静态成员变量与类无关
*
*
* */
