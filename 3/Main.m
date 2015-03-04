/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

#import <Foundation/Foundation.h>

bool checkIfPrime(long y){
	long x;
	for(x=2l;x<y;x++) {
		if (y%x == 0) {
			return false;
		}
	}
	return true;
}


int main(int argc, char *argv[]) {
	@autoreleasepool {
		long DIVIDEND = 600851475143;
		long largestPrimeFactor = 0;
		long x; 	
		for(x=DIVIDEND;x>2;x--) {
			if (DIVIDEND%x == 0 && checkIfPrime(DIVIDEND/x)==true) {
				largestPrimeFactor = DIVIDEND/x;
			}		
		}
		NSLog(@"%d",largestPrimeFactor);
	}
}