/*
 * @author KUSA VAMSHI
 */

/*
 * This is the program to estimate the total cost for constructing a house
 * This include quality of material,area of house and automation
 */

package com.vamshi;
public class HouseCostEstimation {
int materialGrade;
double areaOfHouse,totalCost;
char automation;
double costEstimation(int materialGrade, double areaOfHouse, char automation) {
try {
	switch(automation)
	   {  
	      case 'Y':  if(materialGrade==2)
	    	         totalCost=  (2500*areaOfHouse);
	   			     break;
	      case 'N': if(materialGrade==0)
		             totalCost= (1200*areaOfHouse);
	                 else if(materialGrade==1)
	        	     totalCost= (1500*areaOfHouse);
	                 else if(materialGrade==2)
	        	     totalCost= (1800*areaOfHouse);
			         break;
	      default : throw new RuntimeException();
    	}
return totalCost;
    }
catch(RuntimeException e)
{	System.out.printf("Error! operator is not correct");
	return 1;
}
}
}
