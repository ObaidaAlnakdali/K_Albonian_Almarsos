function countDown(x){
    if(x == 0){
        console.log("done!")
        return
    }else{
        console.log(x, "..")
        countDown(x-1);
        console.log("Obaida") // important concept print text finly
    }
}

countDown(10)