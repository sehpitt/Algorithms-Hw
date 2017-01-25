package phifunction;

import java.util.ArrayList;

/**
 *
 * @author Eliezer Hashimi
 */
public class PhiFunction {

    public static void main(String[] args) {
    ArrayList <Integer>listOfNum = new ArrayList();
    listOfNum = fi(24);
        for (Integer listOfNum1 : listOfNum) {
            System.out.println(listOfNum1);
        }
        
    }
     public static ArrayList<Integer> fi(int num){ 
    ArrayList <Integer> numbers = new ArrayList();
    for(int a=1;a<num;a++){ 
      if(GCD(num,a)==1){
        numbers.add(a);
      }
    }
    return numbers;
 }
public static int GCD(int a, int b){
    int temp;
    if(a<b){
      temp=a;
      a=b;
      b=temp;
    }
    if(a%b==0){
      return(b);
    }
    return(GCD(a%b,b));
  }  
}
