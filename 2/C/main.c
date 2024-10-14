#include <stdio.h>

int max(int a, int b) {
    if (a > b) {
        return a;
    }
    return b;
}

int main() {
    int n;
    printf("Input the size of the array:\n");
    scanf("%d", &n);
    int a[n];
    printf("Input the the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < n; i++) {
        if ((i == 0 && max(a[i], a[i+1]) == a[i]) || (i == n-1 && max(a[i], a[i-1]) == a[i]) || (max(max(a[i], a[i+1]), a[i-1]) == a[i])) {
            printf("%d ", a[i]);
        }
    }
}
