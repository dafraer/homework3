#include <stdio.h>

int main() {
    int n;
    printf("Enter a range for a FizzBuzz sequence:\n");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            printf("FizzBuzz\n");
            continue;
        }
        if (i % 3 == 0) {
            printf("Fizz\n");
            continue;
        }
        if (i % 5 == 0) {
            printf("Buzz\n");
            continue;
        }
        printf("%d\n", i);
    }
}