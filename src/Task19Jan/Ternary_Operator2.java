package Task19Jan;

public class Ternary_Operator2 {
    public static void main(String[] args) {
        /*a=20
(--a)=>a=20=>A=>ExpA=19
//ExpA=19
//+
a++=>a=19 ExpB=>19 B=20(after post)
ExpB=19
+
a--=>20=>ExpC=20 C=19
ExpA+ExpB+ExpC
19+19+20
58*/
        int a=20;

        System.out.println(--a +a++ + a--);
    }
}
