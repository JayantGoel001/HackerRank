#include <stdio.h>
int main() {
  int n, k, x;
  scanf("%d%d", &n, &k);
  int ar[n];
  int i;
  for (i = 0; i < n; i++) {
    x = (n + i - k) % n;
    scanf("%d", &ar[x]);
  }
  for (i = 0; i < n; i++) {
    printf("%d ", ar[i]);
  }
}
