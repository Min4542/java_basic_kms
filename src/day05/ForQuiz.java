package day05;

public class ForQuiz {

    public static void main(String[] args) {
        int Rannum = (int) (Math.floor(Math.random()*(10-2+1))+2);


            for (int j=1;j<10;j++){
                System.out.printf("%d * %d= %d\n",Rannum,j,Rannum*j);
            }
        System.out.println("\n=============================\n");
            int i=1;
            while (i<10){
                System.out.printf("%d * %d= %d\n",Rannum,i,Rannum*i);
                i++;
            }


    }
}
