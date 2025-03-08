package Feb5_TaskProgram.whileloop;

public class while_OddEven {
    public static void main(String[] args) {
        int a=1;

      while(a<=20)
    {
            if(a%2==0)
            {
                System.out.println("Even no:"+a);
            }
            else {
                System.out.println("Odd no:"+a);
            }
            a++;
        }
    }
}
