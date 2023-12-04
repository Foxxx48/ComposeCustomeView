package com.foxxx.composecustomeview

fun main(){
    val result1 = makeComplement("TTTT")
    val result2 = makeComplement("AAAA")
    println(result1)
    println()
    println(result2)

}

fun makeComplement(dna : String) : String {
    return dna.replace(Regex("[ATCG]")) {
        when (it.value) {
            "A" -> "T"
            "T" -> "A"
            "C" -> "G"
            "G" -> "C"
            else -> it.value
        }

    }
}
