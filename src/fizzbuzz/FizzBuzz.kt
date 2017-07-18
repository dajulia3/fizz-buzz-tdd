fun fizzBuzzList(): List<Any> {
    return listOf(1..100).flatten().map { x ->
        if (x % 3 == 0 && x % 5 == 0){
            "FizzBuzz"
        }
        else if (x % 3 == 0) {
            "Fizz"
        } else if (x % 5 == 0) {
            "Buzz"
        } else {
            x
        }
    }
}


fun printFizzBuzz(){
    print(fizzBuzzList().joinToString(", "))
}