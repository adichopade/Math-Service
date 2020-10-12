package com.sapient.service;

import java.util.ArrayList;

public class MathService {
	
	
	public int fibonacci(int n) {
		
		if (n <= 1) {
			return n; 
		}       
		return fibonacci(n-1) + fibonacci(n-2); 
	}
	
	
	public long factorial(int n) {
		long ans = 1;
        for(int i = 1; i <= n; ++i)
        {    
            ans *= i;
        }
        return ans;
	}
	
	public boolean isPrime(int n) {
		if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) {
            	return false;
            }
                 
  
        return true; 
		
	}
	public int[] primeArray(int a,int b) {
		ArrayList<Integer> ans=new ArrayList<>();
		if(a<b) {
			for(int i=a;i<=b;i++) {
				if(isPrime(i)) {
					ans.add(i);
				}
			}
		}else {
			for(int i=b;i>=a;i--) {
				if(isPrime(i)) {
					ans.add(i);
				}
			}
		}
		int[] result=new int[ans.size()];
		
		for(int i=0;i<ans.size();i++) {
			result[i]=ans.get(i).intValue();
		}
		return result;
	}
	
	
	
	
	

}
