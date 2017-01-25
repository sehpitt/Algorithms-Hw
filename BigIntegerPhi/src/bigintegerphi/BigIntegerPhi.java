package bigintegerphi;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Eliezer Hashimi
 */
public class BigIntegerPhi {

    public static void main(String[] args) {
           ArrayList <BigInteger>listOfNum = new ArrayList();

    listOfNum = fi(BigInteger.valueOf(24));
        for (int i = 0; i < listOfNum.size(); i++) {
            System.out.println(listOfNum.get(i));
        }
        System.out.println(findArray());
    }
         public static ArrayList<BigInteger> fi(BigInteger num){ 
    ArrayList <BigInteger> numbers = new ArrayList();
    for(int a=1;a<num.intValue();a++){ 
        BigInteger x = BigInteger.valueOf(a);
        BigInteger answer = num.gcd(x);
      if(answer.intValue() == 1){
        numbers.add(x);
      }
    }
    return numbers;
 }
         
 public static boolean findArray(){
       int[] x = new int[10];
        int[] y = new int[3];
      y[0]=1;
      y[1]=2;
      y[2]=3;
        for (int i = 0; i < x.length; i++) {
            x[i]=i+1;
        }
        for (int j = 0; j < y.length; j++) {
        for (int i = 0; i < x.length; i++) {  
            if(y[j]== x[i]){
                if(y[j+1] == x[i+1]){
                      if(y[j+2] == x[i+2]){
                          return true;
                }
                }
            }
        }}
        return false;
 } 
}


