public class campound //creatino of class campound
{  
   public  double  interest(double  deposit,double  r,double  year,double  n)//creation of method interest
   {
  
        System.out.println("the campound interest of mr Bob is  ");// displaying message that shows campound interest of mr Bob is
        return deposit*(Math.pow(1+r/n,year*n)) ;// return statement that will return values 
    }

    public static void main(String args[]) //main method
    {
        double deposit=500000;//variable initialization
        double r=0.18;//variable initialization
        double year=3;//variable initialization
        double n=12;//variable initialization
    campound obj=new campound();//object creation statement
  double CI=obj.interest(deposit,r,year,n);//object and method calling by new variables 
System.out.println(CI);//displaying the result of campound interest
 }   
}   