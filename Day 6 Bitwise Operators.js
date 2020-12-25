
function getMaxLessThanK(n, k)
{
    var max = -1;
    for (var i = 1; i <= n; i++)
    {
        for (var j = i + 1; j <= n; j++)
        {
            var x = i & j;
            if (x < k && x > max)
            {
                max = x;
            }
        }
    }
    return max;
}
