class Solution {
    public int findNumbers(int[] nums) {
	int sol = 0;                            
	for(int n : nums)                       
		if(getNumberOfDigits(n) % 2 == 0)  
			sol++;         
	return sol;                             
}

public int getNumberOfDigits(int num) {
	int count = 1;                        
	while((num /= 10) != 0)                 
		count++;                          
	return count;
}
}


// Example
// Let's say we have a number 124. The count is already initialised to 1 and every number will be atleast 1 digit long.
// The while loop goes as follows:

// At num = 124, num /= 10 would give 12, and count now becomes 2
// At num = 12, num /= 10 would give 1, and count would become 3
// At num = 1, num /= 10 would give 0, so now count remains unchanged.
// And we return 3, which is odd. So for this number, 3%2 != 0. Hence sol is not incremented for this number.