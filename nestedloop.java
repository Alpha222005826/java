//using for loop to  display five different names of top five student and their grade

public class nestedloop  {
        public static void main(String[] args) {  
            //Declaring an array  
         System.out.println("list of Top five student in class and their Grades");
    String NAME[]={"NDAHIRO","KALISA","VALENCE","CLAUDE","EMMAULE"};  
     int grade[]={94,86,78,75,64};  
    //Printing array using for-each loop  
    for(String i:NAME){
    for(int j:grade){  
        System.out.println(i+"\t"+":"+j);  
    }//end  for statement
    }
}  
}//end of class