
function factorial(n)
{
    var fact = 1;
    for(var i = 1; i <= n; i++)
    {
        fact *= i;
    }
    return fact;
}