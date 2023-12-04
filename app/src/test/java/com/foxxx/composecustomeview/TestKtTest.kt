package com.foxxx.composecustomeview

import org.junit.Assert.assertEquals
import org.junit.Test


internal class TestKtTest {

    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"))
    }
    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"))
    }
}