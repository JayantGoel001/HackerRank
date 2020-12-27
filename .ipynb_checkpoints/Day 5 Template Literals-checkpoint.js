
function sides(literals, ...expressions) {
    var s1 = (expressions[1] + Math.sqrt(expressions[1] * expressions[1] - 16 * expressions[0])) / 4;
    var s2 = (expressions[1] - Math.sqrt(expressions[1] * expressions[1] - 16 * expressions[0])) / 4;
    return [s1, s2].sort();
}

