public class operators {

    public static void main(String args[]) {

        // Arithmetic Operators

        int A = 10;
        int B = 12;
        System.out.println("add = " + (A+B));
        System.out.println("subtract = " + (A-B));
        System.out.println("multiply = " + (A*B));
        System.out.println("divide = " + (A/B));
        System.out.println("modulo = " + (A%B));


        // Increment and Decrement Operators or Unary Operators

        int a = 55;
        int b = ++a;
        int c = b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Relational Operators

        int e = 13;
        int d = 23;
        System.out.println(e==d);
        System.out.println(e!=d);
        System.out.println(e>=d);
        System.out.println(e<=d);
        System.out.println(e>d);
        System.out.println(e<d);

        // Logical Operators

        System.out.println( (3>2) && (5>2));
        System.out.println( (3<2) || (5<2));
        System.out.println( !(3>2) );

        // Assignment Operators

        int y = 5;
        y = y +3;
        System.out.println(y);
        
        y += 3;
        System.out.println(y);

        int x = 2;
        x = x-5;
        System.out.println(x);
        x -=5;
        System.out.println(x);
        x *=3;
        System.out.println(x);
        x /=2;
        System.out.println(x);


    }
    
}
