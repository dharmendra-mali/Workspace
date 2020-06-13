package com.dharmendra.main;

public class ParenthesesBalance {

	public static void main(String[] args) {
		 char [] arr ={')','(','(',')',')','(','(',')'};
		 int ans =balance(arr);
		 if(ans==0){
			 System.out.println("balance ");
		 }else {
			 System.out.println("minimum parenthess "+ans+" is required ");

		 }

	}
	
	public static int balance(char [] arr){
		int r=0 ,l=0;
		
		for(char c:arr){
			
			if(c=='('){
				l++;
			}else{
				if(l==0){
					r++;
				}else{
					l--;
				}
				
			}
		}
		return Math.abs(l)+Math.abs(r); 
	} 

}
