class Stack {
    myArray = [String];
    //push
    push(item) {
        this.myArray.push(item)
    }

    //pop
    pop(){
        if (this.myArray.length != 0) {
            let lastString = this.myArray.length
            this.myArray.pop()
            console.log(lastString) ;
        } else {
            console.log(0)
        }
    }
    
    //peek
    peek(){
        if (this.myArray.length != 0) {
            console.log(this.myArray.length) ;
        } else {
            console.log(0)
        }
    }
}

var deck = new Stack()

deck.push("Heart : Queen")
deck.push("Spade : Jack")
deck.push("Heart : 9")
deck.push("Diamond : 4")
console.log(deck.peek())
console.log(deck.peek())

var firstItemPopped = deck.pop()
var secondItemPopped = deck.pop()
console.log(firstItemPopped)
console.log(secondItemPopped)