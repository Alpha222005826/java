public class ifelse{// creating class called compare
  public static void main(String args[]){  
    int PRICE=900;   
    if (PRICE>=100 && PRICE<=200) 
    {
        System.out.println("PRICE OF ITEM IS cheap");
    }
        else if (PRICE>=300&&PRICE<=400)
    {
        System.out.println("price of item is little average");
    }
    else if (PRICE>=500 && PRICE<=600 ){
        System.out.println("price of item is  average");}
    else if (PRICE>=700 && PRICE<=700 ){
        System.out.println("price of item is most average");}
    else if (PRICE>=800 && PRICE<=900 ){
        System.out.println("price of item is Expensive");}
    else  {
        System.out.println("price of item is is not available");}
    } }