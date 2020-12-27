Rectangle.prototype.area=function()
{
    return this.w * this.h;
}
class Square extends Rectangle
{
    constructor(s)
    {
        super(s,s);
    }
}