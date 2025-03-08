package Feb5_TaskProgram;

public class forloop_OddEven {
    public static void main(String[] args) {
        int a=20;
        for(int i=0;i<=a;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even no:"+i);
            }
            else {
                System.out.println("Odd no:"+i);
            }
        }
    }
}
