#include <iostream>
using namespace std;

int main() {
    unsigned N, S, P, Q;
    cin >> N >> S >> P >> Q;

    unsigned constexpr M = 0x7fffffff;
    unsigned i = N;
    unsigned a = S;
    unsigned b = (S * P + Q) & M;
    while(--i && a != b) {
        a = (a * P + Q) & M;
        b = (b * P + Q);
        b = (b * P + Q) & M;
    }
    i = N - i;

    cout << i << '\n';
}
