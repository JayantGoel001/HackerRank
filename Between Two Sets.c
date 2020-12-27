#include <stdio.h>
//#include<math.h>
int main() {
  int i, m, n;
  scanf("%d %d", &m, &n);
  int ar[m], ar2[n];
  for (i = 0; i < m; i++) {
    scanf("%d", &ar[i]);
  }
  for (i = 0; i < n; i++) {
    scanf("%d", &ar2[i]);
  }
  int br[m];
  for (i = 0; i < m; i++) {
    br[i] = ar[i];
  }
  int j, k;
  int lcm = 1;
  int c = 0;
  int large = ar[0];
  for (i = 0; i < m; i++) {
    if (ar[i] > large) {
      large = ar[i];
    }
  }
  //printf("large=%d", large);
  for (i = 1; i <= large; i++) {
    c = 0;
    for (j = 0; j < m; j++) {
      if (ar[j] % i == 0) {
        c++;
      }
    }
    if (c == m) {
      lcm *= i;
      for (k = 0; k < m; k++) {
        ar[k] = ar[k] / i;
      }
    }
  }
  int hcf = lcm;
  c=0;
  for (i = 0; i < m; i++) {
    if (large % br[i] == 0) 
    {
      c++;
    }
  }
  if (c == m) {
    lcm = large;
  } else {
    for (i = 0; i < m; i++) {
      lcm *= ar[i];
    }
  }
  //printf("Hcf=%d\nLcm=%d\n", hcf, lcm);
  int small = ar2[0];
  for (i = 0; i < n - 1; i++) {
    if (ar2[i] <= ar2[i + 1]) {
      small = ar2[i];
    }
  }
  int c1 = 0;
  j = 1;
  int lcm2 = lcm;
  while (lcm2 <= small) {
    c = 0;
    for (i = 0; i < n; i++) {
      if (ar2[i] % lcm2 == 0) {
        c++;
      }
    }
    if (c == n) {
      c1++;
    }
    j++;
    lcm2 = lcm * j;
  }

  printf("%d", c1);
}
