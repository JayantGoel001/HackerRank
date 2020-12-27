class Polygon
{
    constructor(ar)
    {
        this.ar = ar;
    }
    perimeter()
    {
        var sum = 0;
        for (var i = 0; i < this.ar.length; i++)
        {
            sum = sum + this.ar[i];
        }
        return sum;

    }
}