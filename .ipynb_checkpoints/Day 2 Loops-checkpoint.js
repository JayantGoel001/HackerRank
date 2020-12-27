
function vowelsAndConsonants(s) {
    for (var i = 0; i < s.length; i++)
    {
        var x = s.charAt(i);
        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
        {
            console.log(s.charAt(i));
        }
    }
    for (var i = 0; i < s.length; i++)
    {
        var x = s.charAt(i);
        if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u')
        {
            console.log(s.charAt(i));
        }
    }
}

