package tekpyramid;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SumOfPhoneNumber {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the phone number");
       Long n=sc.nextLong();
       Long temp=n;
       Long sum=0l;
       while(n!=0) {
    	   Long d=n%10;
    	   sum=sum+d;
    	   n=n/10;
       }
       n=temp;
       System.out.println(sum);
	
	int max=0;
    while(n!=0) {
    	int a=(int) (n%10);
    	if(max<a) {
    	  max=a;
    	  }
    	n=n/10;
    }
   System.out.println(max);
	}
}
