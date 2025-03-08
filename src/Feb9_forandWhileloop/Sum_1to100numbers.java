package Feb9_forandWhileloop;

public class Sum_1to100numbers {
    public static void main(String[] args) {
        System.out.println("---Using For loop----");
        int sum=0;
        for(int i=1;i<=100;i++)
        {

            sum=sum+i;

        }
        System.out.println("Addition of 1 to 100 no is: "+sum);
        System.out.println("---Using While loop----");
        int sum1=0,a=1;
        while(a<=100)
        {
            sum1=sum1+a;
            a++;
        }
        System.out.println("Addition of 1 to 100 no is: "+sum1);

    }
}
