package Day_03_Practice;
/*
4.编程题：
        打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于
        该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
*/

public class PracticeFour {
    int i = 0;
    int shiwei = 0;
    int baiwei = 0;
    int gewei = 0;
    for(i = 100;i<1000;i++)
    {
        baiwei = i /100;
        shiwei = i /10%10;
        gewei = i % 10;
        if(baiwei * baiwei *baiwei + shiwei * shiwei *shiwei + gewei * gewei*gewei == i)
        {
            System.out.println(i);
        }
    }

}
