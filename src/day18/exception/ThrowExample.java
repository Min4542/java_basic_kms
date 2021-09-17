package day18.exception;

class Test{
    int number;


    public Test(int number) throws Exception{
        this.number = aaa(number);
    }

    public int aaa(int n) throws Exception {
        return bbb(n) / n;
    }

    public int bbb(int n) throws Exception {
        return ccc(n) / n;
    }


    public int ccc(int n) throws Exception{
        return 100 / n;
    }

}

public class ThrowExample {

    public static void main(String[] args) {

        Test test = null;
        try {
            test = new Test(0);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println(test.number);

    }
}
