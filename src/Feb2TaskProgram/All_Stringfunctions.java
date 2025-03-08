package Feb2TaskProgram;

public class All_Stringfunctions {
    public static void main(String[] args) {
        String strname = "Priyanka";
        System.out.println(strname.length()); //finding the length of the string

        //1. charAt()
        System.out.println("charAt Function: ");
        System.out.println(strname.charAt(3));
        // System.out.println(name.charAt(10)); out of bound exception (range)
        //2. Concat
        System.out.println("Concat : ");
        System.out.println(strname.concat("Hingmire"));

        //3. contains
        System.out.println("Contains: ");
        System.out.println(strname.contains("Priyanka"));
        System.out.println(strname.contains("PriyankaH"));//false


        //4. equals
        System.out.println("Equals: ");
        System.out.println(strname.equals("Priyanka"));//true
        System.out.println(strname.equals("PriyankaH"));//False
        //5. equalsIgnoreCase
        System.out.println("equalsIgnoreCase: ");
        System.out.println(strname.equalsIgnoreCase("priyanka"));

        //6. indexOf()
        System.out.println(strname.indexOf('i'));


        //7. length()
        System.out.println(strname.length());

        //8. replace( , )
        System.out.println(strname.replace('P','p'));
        //9.Split()
        String Strname1 = "Priyanka Hingmire";
        String[] split1 = Strname1.split("H");
        System.out.println(split1[0]);
        System.out.println(split1[1]);

        String str1 = "priyankahingmire03@gmail.com";
        String[] str2 = str1.split("@");
        System.out.println(str2[0]);
        System.out.println(str2[1]);


        String s1 = "Priyanka Vaijinath Hingmire";
        String s2 = s1.substring(0,9);
        System.out.println("substring  : "+s2);

        //11. toLowerCase
        System.out.println(Strname1.toLowerCase());

        //12. toUpperCase
        System.out.println(Strname1.toUpperCase());

        //13. startsWith()
        System.out.println(Strname1.startsWith("P"));

        //14. endsWith()
        System.out.println(Strname1.endsWith("S"));

        //15. trim()
        String name3 = "  Priyanka Vighnesh  ";
        System.out.println(name3.trim());


        //16. compareTo
        String s3 = "Vighnesh";
        System.out.println("CompareTo function: "+(s3.compareTo("vighnesh")));

        //17. compareToIgnoreCase
        String s4 = "Vighnesh";
        System.out.println("CompareToIgnoreCase function: "+s4.compareToIgnoreCase("vighnesh"));

    }
}
