#include <stdio.h>

int main(int argc, char *argv[]) {
	int x=0;
	for (int i=1;i<1000;i++) {
		if (i%3 == 0 || i%5 == 0) {
			x+=i;
		}	
	}
	printf("%d",x);
}
