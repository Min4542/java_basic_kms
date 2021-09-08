public class test {

    static int max3(int x, int y,int c ){
        int max = x;
        if(y>max) max = y;
        if(c>max) max = c;
        return  max;
    }



    public static void main(String[] args) {
        System.out.println(max3(1,3,4));
        System.out.println(max3(1,7,4));
        System.out.println(max3(1,8,3));
        System.out.println(max3(1,3,4));
        System.out.println(max3(0,3,3));
        System.out.println(max3(1,1,2));
        System.out.println(max3(1,3,4));

    }
}
