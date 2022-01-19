import java.util.Scanner;

/**
 * This app derives and prints out the area of a rectangle that is 8 units wide
 * and 3 units high.
 * 
 * @author EECS1710 
 * 
 */
public class Question01 {

	public static void main(String[] args) {
		/*
		 * Q1Step 0a : replace all X's with specified info and move
		 * this comment block before the class header but after the import
		 * statement. (Notice how this task requires you to be able to identify
		 * the class header.)
		 * 
		 * FAMILY NAME: XXXXXXXX GIVEN NAME(S): XXXXXXXX STUDENT NUMBER:
		 * ZZZZZZZZZ
		 */

		/*
		 * Q1Step 0b : code is properly formatted. You should know how
		 * to quickly and easily format code using the Eclipse shortcut (See
		 * Source -> Format)
		 * 
		 */

		/*
		 * Q1Step 1 : In the code below, identify all of SYNTACTIC
		 * ERRORS and fix them.  
		 * 
		 * A syntactic error is a error in conforming to the rules of the Java
		 * programming language.  As such, the java file will not compile if they
		 * are present.
		 * 
		 * You will know you have completed this task when the program compiles 
		 * and runs correctly.
		 * 
		 * Use your mouse to HOVER over the error symbol in the left ribbon and
		 * a tip will appear. The tip will contain the compiler error message.
		 * PRACTISE reading the messages and use the information to assist you
		 * with the debugging.
		 */
         double x = 100000;
         //0,1,1,2,3,5,8,13,21,34;
         //0,1,2,3,4,5,6,7 ,8 ,9;
         
         for(int i=0;i<10;i++) {
        	 x = x*0.02 + x;
         }
         System.out.println(x);
         
         //!(str=sc.nextLine()).equals("exit")
         //while(!(a=input.nextLine()).equals("exit")) {
        // for(int i=1;i<=c;i++) {
        //	 fa = fa*i;
        //  }
       //  System.out.print(fa);
       // }
		 //input.close();
		 
		 int c =3%2;
		 System.out.println(c);
		 
		 
		 Scanner ad = new Scanner(System.in);
		 String a = ad.next();
		 String ab = reverse(a);
		 System.out.println(ab);
		 
	}
	
	public static String reverse(String m) {
		if(m.length()<2){
			return m;
		}
		else {
			char a = m.charAt(0);
			m = m.substring(1);
			return reverse(m) + a;
		}
	}
	
	public static String Sum(String m) {
		String[]a = m.split("");
		return a[0] + Sum(m.substring(1));
		
	}
	
	public static int Sum(int m) {
		if(m>30){
		      return 0;
		   }
		   else {
		      return m + Sum(m+1);
		   }
	}
	
	
     public static Integer count37(Integer m,Integer n) {
    	 String l = m.toString();
    	 int[] o = new int[l.length()];
    	 for(int i=0;i<l.length();i++) {
    		 o[i] = Integer.parseInt(String.valueOf(l.charAt(i)));
    	 }
    	 if(n > o.length) {
    		 return 0;
    	 }
    	 else {
    		 if((o[n]==3||o[n]==7)&&n+1<o.length) {
    			 return 1 + count37(m,n+1);
    		 }
    		 else if (n+1<o.length){
    			 return count37(m,n+1);
    		 }
    		 else {
    			 return 1;
    		 }
    	 }
     }
	
}


