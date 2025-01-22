package Task19Jan;

public class Ternary_operator1 {
    public static void main(String[] args) {
        int a=10;
        //++a ->A->ExpA=11 pre-increment a=11
        //+
        //a++->B->ExpB=11 post increment (12) value of a=12
        //+
        //a++->C->ExpC=> 12 post increment (13) value of a after increment is 13
        //add expA+ExpB+ExpC
        System.out.println(++a + a++ + a++);
    }
}
