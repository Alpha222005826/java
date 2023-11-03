public class simpleinterest //creatino of class simpleinterest
{
    public  double interest(double deposit,double r,double y)//creation of method interest
    {
        System.out.println("the simple interest of mr Bob is  ");// displaying message that shows simple interest of mr Bob is
        return(deposit*r*y) ;// return statement that will return values 
    }

    public static void main(String args[])//main method
    {
double d=100000;//variable initialization
double r= 0.05;//variable initialization
double y= 5;//variable initialization
      simpleinterest obj=  new simpleinterest();//object creation statement
double SI=obj.interest(d,r,y);//object and method calling by new variables
System.out.println(SI);//displaying the result of simple interest
}   

    }   

}   
