def method(Closure c){
    def firstValue = 'a'
    def secondValue = 'b'
    if (c.maximumNumberOfParameters == 1)
        c(firstValue)
    else
        c(firstValue, secondValue)
}

//execute
method { a ->
    println "I just need $a"
}
method { a, b ->
    println "I need both $a and $b"
}

method() { a -> println "I just need $a, version 2 "}
method({ a -> println "I just need $a, version 3 "})

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// I just need a                                  //
// I need both a and b                            //
// I just need a, version 2                       //
// I just need a, version 3                       //
////////////////////////////////////////////////////
