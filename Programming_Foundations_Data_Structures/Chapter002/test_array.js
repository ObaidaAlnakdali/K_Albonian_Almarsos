num = [2, 34, 34, 23, 4, 1, 0, 22];
console.log(num);

count = num.length;

console.log(count);

sum = 0;

for(let item of num) {
    sum += item;
    console.log(item);
}

console.log(sum);

