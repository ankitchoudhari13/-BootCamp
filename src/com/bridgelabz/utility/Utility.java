package com.bridgelabz.utility;






public class Utility {

	public void operation(int firstnumber, int secandnumber, int thirdnumber) {
		// TODO Auto-generated method stub
		
		int result1=firstnumber+(secandnumber*thirdnumber);
		int result2=(firstnumber*secandnumber)+thirdnumber;
		
		System.out.println("operation :a+b*c="+result1);
		System.out.println("operation :a*b+c="+result2);
		
	}

	public void douoper(double firstnuber, double secandnumber, double thirdnumber) {
		double result4=firstnuber+(secandnumber+thirdnumber);
		double result5=(firstnuber*secandnumber)+thirdnumber;
		double result6=thirdnumber+firstnuber/secandnumber;
		double result7=(firstnuber%secandnumber)+thirdnumber;
		
		System.out.println("operation :a+b*c="+result4);
		System.out.println("operation :a*b+c="+result5);
		System.out.println("operation :c+a/b="+result6);
		System.out.println("operation :a%b+c="+result7);
	}

	

	public void month(int month, int day) 
	{
		
	
		
	}

	public void quadraticopt(int firstnumber, int secandnumber, int thirdnumber) {
		int result1=firstnumber+(secandnumber*thirdnumber);
		
	}

	public void operatio(double firstnumber, double secandnumber, double thirdnumber) {
	double delta = secandnumber*secandnumber-4*firstnumber*thirdnumber;
			double	  x = (-secandnumber + Math.sqrt(delta))/(2*firstnumber);
		    double x1 = (-secandnumber-Math.sqrt(delta))/(2*firstnumber);
		    System.out.println("The roots of the Quadratic Equation \"a*x*x + b*x + c = 0\" are "+x+" and "+x1);
		
		
	}

	

	public void distopt(int x, int y) {
		// TODO Auto-generated method stub
		int result4=x*x+y*y;
		System.out.println("Math.pow(x, y)="+result4);
		
	}

	public void addition(int dice1, int dice2) {
      
        int result = dice1 + dice2;
        System.out.println(result);
		
	}

	
	public void add(double x, double y, double z, double a, double b) {
		// TODO Auto-generated method st
		double minumum=(Math.min(x, Math.min(y, Math.min(z, Math.min(a, b)))));
		double maxmimum=(Math.max(x, Math.max(y, Math.max(z, Math.max(a, b)))));
		double average=(x+y+z+a+b)/5;
		System.out.println(minumum);
		System.out.println(maxmimum);
		System.out.println(average);
		
	}

	public void wether(double firstnumber, double secandnumber) {
		
		
	}

	public  int mdy(int d, int m, int y) {
		
		
		 int y0=(y- (14-m) / 12);
		 int x=(y0+ y0/4 - y0/100 + y0/400);
		 int m0 = m + 12 * ((14 - m) / 12) - 2;
		 int d1 = (d+x+31* m0/ 12) % 7;
		return d1;
	}

	public void amount(float principal, float intrest, float year) {
		float n=12*year;
		float r=intrest/(12*100);
		
		  double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	        double interest = payment * n - principal;
	
		System.out.println(payment);
		System.out.println(intrest);
	}

	public void temcon(double fahrenheit, double celsius) {
		double tem= (celsius*9/5)+32;
		double tem1=( fahrenheit-32)*5/9;
		
		System.out.println("conversion "+tem);
		System.out.println("conversion "+tem1);
		
		
	}


	public void mathfun(double x) {
		 System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
		 System.out.println("Math.sin("+x+")="+Math.sin(x));
	  double y1=Math.toRadians(x);
	  System.out.println(y1);
		
	}

	public void table(int number) {
		
		int power=1;
		for(int i =0;i<=10;i++) {
System.out.println(+i+" "+power);
			power=2*power;
			
			
		}
		
	}

	public void harm(int number) {
		double sum=0.0;
		int n=1;
		for(int i=1;i<=10;i++) {
			sum = 1.0/i;
			System.out.println(sum);
		}
		
	}

	public void possi(float number) {
		if(Math.random()>0.5) {
			System.out.println("heads");
		}
		else {
			System.out.println("tails");
		}
	
	}

	public void game(int goal, int stake, int number) {
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < number; i++) {
			int cash = stake;

			while (cash > 0 && cash < goal) {
			bets++;

			if (Math.random() < 0.5)
			cash++; // win $1
			else
			cash--; // lose $1
			}
			
			if (cash == goal)
			wins++; // to find no. of wins
			}
		System.out.println(wins + " wins out of of " + number);
		System.out.println("Percent of games won = " + 100.0 * wins / number);
		System.out.println("Percent of games lost = " + 100.0 * (number- wins) / number);
		System.out.println("Total bets in " + number + " games = " + bets);

		
		
	}

	public void newt(int number) {
		
		double c = 1;
		double t=c;
		double epsilon = 1*3.14159-15;
		while(Math.abs(t-c/t) > epsilon*t)
		{
			   t = (c/t + t) / 2.0;
		}	   
		      System.out.println(t);
		
		}

	public void check(int firstnumber,int secandnumber) {
		int number;
		int startindex = 0;
		int endindex = 0;
		int count=0;
		for(number=startindex;number<=endindex;number++) {
			count=0;
		
	for(int i=2;i<=number;i++)
	
	if(  number%i==0) {
		count++;
		break;}}
		if(count==0&&number !=1) {
			System.out.println(number);
	}
	
		
	
	}

	public void conv(float number,String x) {
		
		  int power = 1;
	        while (power <= number/2) {
	            power *= 2;
	        }
	        while (power > 0) {

	          
	            if (number < power) {
	                System.out.print(0);
	            }
	            else {
	                System.out.print(1);
	                number =number- power;
	            }power =power/ 2;
	            
	        }

	      

	
		
	}

	public void taylor( double angle) {
	double t=1;double sum=0;
		angle=(angle*3.14/180);
		
		for(int i=1;i<=t;i++)
		 {
			t=(t*(-1)*angle*angle)/(2*i*(2*i+1));
			sum=angle+t;
			System.out.println(angle+""+sum);
		}
		
	}

	public void rev(int[] a) {
		// TODO Auto-generated method stub
		int i,j;
		int size=12;
		for(i=1;i<size;i++) {
			for(j=i+1;j<size;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[i]+"");
				}
			}
		}
	}

	public static void sorting(int[] array) {
		// TODO Auto-generated method stub
		int largest=array[0];
		int secondLargest=array[0];
		
		for (int i = 0; i < array.length; i++) {
			
				if (array[i]>largest) {
					secondLargest=largest;
					largest=array[i];	
				}
				else if(secondLargest<array[i]) {
				secondLargest=array[i];
				}
			
		}
		
	
		System.out.println("SECOND LARGEST - "+secondLargest);
	}

	

	public void leapp(int year) {
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}

	public void fact(int num, int fact) {
		 for(int i=1; i<=num; i++)
	        {
	            fact = fact*i;
	        }
	        
		 System.out.println(num+" "+fact);
		
	}

	public void newt(  double c)
	{
	double epsilon = 1e-15; 
		
		double t=c;
		while(Math.abs(t-c/t) > epsilon*t) {
		 t = (c/t + t) / 2.0;
		 System.out.println(t);
		
	}
	}
	

	
	

	      

	    public static void factoria(int number,int fact) {
		for(int i=1; i<=number; i++)
        {
            fact = fact*i;
            System.out.println(i+"*");
        }
        
		
        System.out.println(fact);
	
}

	public void compund(double year, double money, double intrest) {
		double tem=(money*Math.pow((1 +intrest), year));
		//double v=Math.pow(tem, year);
		
		System.out.println(tem);
		
	}

	public void min(int[] a) {
 int first=Integer.MAX_VALUE;
 for(int i=0;i<a.length;i++)
	 if(a[i]<first) {
		 first=a[i];
	 }
	 else if(a[i]<=first) {
	first=a[i];
	 }
	System.out.println(first);	
			}
		
		
		
			
		
	
		
		
		
		
	

	

	public void presentValue(int money, int year, float intrest) {
		
	double	 tem=(money/Math.pow((1 +intrest), year));
		System.out.println(tem);
	}

	public void day(int m, int d, int y) {
		 int y0=(y- (14-m) / 12);
		 int x=(y0+ y0/4 - y0/100 + y0/400);
		 int m0 = m + 12 * ((14 - m) / 12) - 2;
		 int d1 = (d+x+31* m0/ 12) % 7;
		 
		 if(d1==0) {
			 System.out.println("sunday");
		 }
		 
		 if(d1==1) {
			 System.out.println("monday");
		 }
		 
		 if(d1==2) {
			 System.out.println("tuesday");
		 }
		 if(d1==3) {
			 System.out.println("wed");
		 }
		 if(d1==4) {
			 System.out.println("tha");
		 }
		 if(d1==5) {
			 System.out.println("friday");
		 }
		 if(d1==6) {
			 System.out.println("saturday");
		 }
	}

	public void coliner(int x1, int x2, int x3, int y1, int y2, int y3) {
		 int a = x1 * (y2 - y3) +  
	                x2 * (y3 - y1) +  
	                x3 * (y1 - y2); 
		if(a==0){
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	public void string(String str1,String original,String rev) {
	
		 int length= str1.length();
	     
		  length = str1.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str1.charAt(i);
	 
	      if (str1.equals(rev))
	         System.out.println(str1+" is a palindrome");
	      else
	         System.out.println(str1+" is not a palindrome");
	         
	}

	
		
	
		

	        }
	    

	    
	
	
		
		
			
		
	

	
		
		
	

	
	

	
	


