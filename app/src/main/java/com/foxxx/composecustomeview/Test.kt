package com.foxxx.composecustomeview

fun main(){
    val result = makeComplement("TTTT")
    println(result)

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
