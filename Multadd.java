
public class Multadd {
    public static void multadd(double a, double b,double c){
        double ans = a * b + c;
        System.out.println(ans+" \n");
        //double Dist = Math.sqrt(dx*dx + dy*dy);
        
        
    }
    
    public static void expSum(double x){
        double ans1 = x*Math.exp(-x) + Math.sqrt(1-Math.exp(-x));
        System.out.println(ans1);
        //double Dist = Math.sqrt(dx*dx + dy*dy);
        
        
    }
    
    
    
    public static void main(String[] args) {
    
    multadd(1.0, 2.0, 3.0);
    expSum(3.0);
    System.out.println(Math.sin(Math.PI/4) + Math.cos(Math.PI/4)*0.5);
    //multadd((double)(Math.sin(Math.PI/4)), (double)(Math.cos(Math.PI/4)*0.5), 0.0);
    }
}