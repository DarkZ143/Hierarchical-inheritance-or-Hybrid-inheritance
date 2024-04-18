//Coded by DarkZ143
import java.util.Scanner;
class A{
    private int x;
    protected int y;
    public void sum(){
        int z;
        x = 5;
        y = 6;
        z = x + y;
        System.out.println("A = "+z);
    }
}
class B extends A{
    protected int s;
    public void sub(){
        int z;
        s = 100;
        y = 50;
        z = s - y;
        System.out.println("B = "+z);
    }
}
class C extends A{
    protected int c;
    public void multiply(){
        int z;
        c = 5;
        y = 5;
        z = c * y;
        System.out.println("C = "+z);
    }
}
class E extends B{
    private int x;
    public void sumx(){
        int z;
        x = 50;
        s = 25;
        y = 25;
        z = x + s + y;
        System.out.println("E = "+z);
    }
}
class F extends B{
    private int x;
    public void subx(){
        int z;
        x = 50;
        s = 25;
        y = 25;
        z = x - s - y;
        System.out.println("F = "+z);
    }
}
class G extends C{
    private int x;
    public void mulx(){
        int z;
        x = 2;
        c = 4;
        y = 8;
        z = x * c * y;
        System.out.println("G = "+z);
    }
}
class H extends C{
    private int x;
    public void muly(){
        int z;
        x = 50;
        c = 25;
        y = 25;
        z = x * c - y;
        System.out.println("H = "+z);
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Input for getting elements: ");
        System.out.println("1 for E / 2 for F / 3 for G / 4 for H ");
        int choice = myObj.nextInt();
        if (choice==1)
        {
            System.out.println("Parent and Inherit classes are A, B and E :");
            E obj = new E();
            obj.sum();
            obj.sub();
            obj.sumx();
        }
        else if(choice==2)
        {
            System.out.println("Parent and Inherit classes are A, B and F :");
            F obj = new F();
            obj.sum();
            obj.sub();
            obj.subx();
        }
        else if(choice==3)
        {
            System.out.println("Parent and Inherit classes are A, C and G :");
            G obj = new G();
            obj.sum();
            obj.multiply();
            obj.mulx();
        }
        else if(choice==4)
        {
            System.out.println("Parent and Inherit classes are A, C and H :");
            H obj = new H();
            obj.sum();
            obj.multiply();
            obj.muly();
        }
        else{
            System.out.println("Invalid input !");
        }
    }
}

