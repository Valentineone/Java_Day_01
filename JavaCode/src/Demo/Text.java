package Demo;

public class Text {
    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        //TODO
        int i = 0;
        int j = 0;
        for(i = 0; i < data.length - 1;i++)
        {
            int max = i;
            for(j = i + 1; j < data.length; j++)
            if(data[j] > data[max]) {
                max = j;
            }
            return data[max];
        }
        return 0;
    }

    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        //TODO
        int i = 0;
        int j = 0;
        for(i = 0; i < data.length - 1;i++)
        {
            int min = i;
            for(j = i + 1; j < data.length - 2; j++)
                if(data[j] < data[min]) {
                    min = j;
                }
            return data[min];
        }
        return  0;
    }


    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        //TODO
        int i = 0;
        int sum = 0;
        for(i = 0;i < data.length;i++)
        {
            sum += data[i];
        }
        return sum;
    }

    //4.数组拼接
    // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
    public static int[] arrayJoin(int[] a, int[] b){
        //TODO
        int i = 0;
        int j = 0;
        int[] newarray = new int[a.length + b.length];
        for(i = 0; i < a.length;i++)
        {
            newarray[i]  = a[i];
        }
        for(j = 0; j < b.length ;j++)
        {
            newarray[i++] = b[j];
        }
        return newarray;
    }

    //5.数组截取
    //[start, end)
    // A {1,3,5,7,9} ->(A,1,3) > {3,5}
    public static int[] arraySub(int[] data, int start , int end){
        //TODO
        int j = start;
        int i = 0;
        int[] searray = new int[end - start];
        for(i = 0; i < end - start; i++)
        {
            searray[i] = data[j++];
        }
        return searray;
    }

    //6.数组打印
    public static void printArray(int[] data){
        //TODO
        int i = 0;
        for(i = 0; i < data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
    }

    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        //TODO
        int i = 0;
        int len = data.length - 1;
        for(i = 0; i < len/2;i++,len--)
        {
            int temp = 0;
            temp = data[i];
            data[i] = data[len];
            data[len] = temp;
        }
    }

    public static void main(String[] args){
        //TODO 测试
        int[] data = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[]{2,3,3,3};
        System.out.println("数组中最大值："+arrayMaxElement(data));
        System.out.println("数组中最小值："+arrayMinElement(data));
        System.out.println("数组元素之和："+arrayElementSum(data));
        System.out.println("数组拼接后：");
        printArray(arrayJoin(data,b));
        System.out.println();
        System.out.println("数组截取后：");
        printArray(arraySub(data,1,3));
        System.out.println();
        System.out.println("数组反转后：");
        printReversal(data);
        printArray(data);
    }
}
