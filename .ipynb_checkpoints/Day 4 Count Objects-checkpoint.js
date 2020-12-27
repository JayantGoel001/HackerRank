function getCount(o) {
    var c = 0;
    for (var i=0; i < o.length;i++)
    {
        if (o[i].x==o[i].y)
        {
            c++;
        }   
    }
    return c;
}