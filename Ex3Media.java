

public class Ex3Media{
    public static void main(String[] args){
        double n1=10,n2=8,n3=1,n4=5,n5=7;
        
        System.out.println("Media de n1, n2, n3, n4, n5: " + media(n1,n2,n3,n4,n5));
        
    }
    public static double media(double... numeros){
        double total=0;
        for (double d: numeros)
           total += d;
        return total/numeros.length;
    }
}

