

/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(o) {
    var c = 0;
    //console.log(o.length);
    for (var i=0; i < o.length;i++)
    {
        if (o[i].x==o[i].y)
        {
            c++;
            //console.log(o[i].x);
        }   
    }
    return c;
}

