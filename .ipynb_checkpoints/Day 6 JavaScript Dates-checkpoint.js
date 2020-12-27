function getDayName(dateString) {
    let date = new Date(dateString);
    var x = date.getDay();
    var day;
    if (x == 0)
    {
        day = "Sunday";
    }
    else if (x == 1)
    {
        day = "Monday";
    }
    else if (x == 2)
    {
        day = "Tuesday";
    }
    else if (x == 3)
    {
        day = "Wednesday";
    }
    else if (x == 4)
    {
        day = "Thursday";
    }
    else if (x == 5)
    {
        day = "Friday";
    }
    else
    {
        day = "Saturday";
    }
    return day;
}

