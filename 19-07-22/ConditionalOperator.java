/* to find biggest number among three and four
 variables using conditional operator */

class ConditionalOperator 
{
 public static void main(String [] args)
{
   int a= 30,b = 45,c = 88,d = 95,x,y;        //defining all varaibles 
   x = (a>b)?(b>c?b:c):(a>c?a:c);
   y = (x>d)?x:d;                     
System.out.println("the bigger number for three variables is " +x);
System.out.println("the bigger number for four variable is " +y);
}

}