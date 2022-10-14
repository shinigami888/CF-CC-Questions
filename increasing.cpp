#//  Radhey Radhey

#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define pi (3.141592653589)
#define mod 1000000007
#define int long long
#define float double
#define pb push_back

void solve()
{
    ll n;
}
int32_t main()
{
    // SSSS...............
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }
        int cnt = 0;
        sort(a, a + n);
        for (int i = 0; i < n - 1; i++)
        {
            if (a[i + 1] == a[i])
            {
                cnt = 1;
                break;
            }
        }
        if (cnt == 0)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}
