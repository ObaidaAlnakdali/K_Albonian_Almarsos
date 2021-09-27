items1 = [34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21]
items2 = [2, 3, 24, 50, 51, 54, 60, 66, 88, 99]


// first way to check
function is_sorted(itemlist){
    // return all(itemlist[i] <= itemlist[i+1],(for(i in range(len(itemlist)-1)))  )
}

console.log(is_sorted(items1));
console.log(is_sorted(items2));

// second way to check
function is_sorted2(itemlist){
    for (let i = 0; i < itemlist.length; i++) {
        if(itemlist[i] > itemlist[i+1]){
            return false
        }
    }
    return true
} 

console.log(is_sorted2(items1))
console.log(is_sorted2(items2))