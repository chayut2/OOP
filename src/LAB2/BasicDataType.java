package LAB2;

public class BasicDataType {
    public static void  main(String[]args){
        //boolean => T,F(1,0)
        boolean myboo = true;
        System.out.println(myboo);
        myboo=false;
        System.out.println(myboo);

        //character => only 1 character such as 'a','X'
        char c = 'a';

        //integer => -2 -1 0 1 2 3 ...1000
        int number;
        number = 100;
        System.out.println(number);//100
        System.out.println(number*5);//500
        //number = ?100

        //real number => float,double => 10.11,-22.1
        float a =10.10f;
        double b = 20.20;
        System.out.println(a+b); // 30.30

        //string => message => "...." => "HellO"
        //string

        String msg = "Hello RUTS Saiyai 2020";
        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        System.out.println(msg.length());

        //constant varible
        final  int num = 100;

    }//main
}//class