package Demo;

public class RecursiveFactorial {
        public static int ReFac(int num){
        int i = 0;
        int ret = 1;
        for(i = 1; i <= num ;i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args){
        int num = 3;
        System.out.println("20的阶乘："+ ReFac(num));
    }
}
