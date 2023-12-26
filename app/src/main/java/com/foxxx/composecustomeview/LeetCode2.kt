package com.foxxx.composecustomeview

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
//fun twoSum(nums: IntArray, target: Int): IntArray {
//    val map = hashMapOf<Int, Int>()
//    nums.forEach {
//        val complement = target - nums[it]
//        if (map.containsKey(complement)) {
//            val array = intArrayOf(map[complement] ?: 100500, it)
//            println(array.toList())
//            return array
//            map.put(nums[it], it)
//        }
//
//    }
//    return intArrayOf()
//
//}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    // In case there is no solution, we'll just return null
    return null
}
