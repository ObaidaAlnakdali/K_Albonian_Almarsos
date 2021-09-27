function gcd(a, b){
    while (b != 0) {
        t = a;
        a = b;
        b = t % b;
    }
    return a;
}


console.log(gcd(20, 8));
console.log(gcd(100, 49));