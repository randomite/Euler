#include <stdio.h>

int main(int argc, char *argv[]) {
	int sum = 0;
	int y = 1; 
	int z = 2;
	sum = 2;
	for (int x=3;x<=4000000;x=y+z) {
		y=z;
		z=x;
		if (x%2 == 0) {
			sum += x;
		}
	}
	printf("%d",sum);
}
