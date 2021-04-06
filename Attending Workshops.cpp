#include<bits/stdc++.h>

using namespace std;
struct Workshop{
    int start;
    int duration;
    int end;
};
const unsigned int N = 100001;
struct Available_Workshops{
    int n;
    Workshop *ar = new Workshop[N];
};
Available_Workshops* initialize(int *start_time,int *duration,int n){
    Available_Workshops *availableWorkshops = new Available_Workshops();
    availableWorkshops->n = n;
    for (int i = 0; i < n; ++i) {
        Workshop workshop;
        workshop.start = start_time[i];
        workshop.duration = duration[i];
        workshop.end = start_time[i] + duration[i];
        availableWorkshops->ar[i] = workshop;
    }
    return availableWorkshops;
}
bool operator<(Workshop const &w1,Workshop const &w2){
    return w1.end<w2.end;
}
int CalculateMaxWorkshops(Available_Workshops *ptr){
    int maxi = 1;
    int n = ptr->n;
    Workshop *workshop = ptr->ar;
    sort(workshop,workshop+n);
    Workshop prev = workshop[0];
    for (int i = 1; i < n; ++i) {
        Workshop current = workshop[i];
        if (current.start>=prev.end){
            maxi+=1;
            prev = current;
        }
    }
    return maxi;
}
int main(int argc, char *argv[]) {
    int n;
    cin >> n;
    int* start_time = new int[n];
    int* duration = new int[n];

    for(int i=0; i < n; i++){
        cin >> start_time[i];
    }
    for(int i = 0; i < n; i++){
        cin >> duration[i];
    }

    Available_Workshops * ptr;
    ptr = initialize(start_time,duration, n);
    cout << CalculateMaxWorkshops(ptr) << endl;
    return 0;
}
