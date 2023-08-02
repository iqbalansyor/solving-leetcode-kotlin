/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * 1   -2-3-4 
 * 3-4
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) { return list2 }
        if (list2 == null) { return list1 }
        
        var longList = list1
        var shortList = list2
        
        if (list1!!.`val` > list2!!.`val`) {
            return mergeTwoLists(list2, list1)
        }
        
        
        var currentListNode = list1
        
        // if (list1.next == null) {
        //     list1.next = list2
        //     return list1
        // } else {
        //     if (list1!!.next!!.`val` > list2.`val`) {
        //         shortList = list2.next
        //         list1.next = list2
        //         return mergeTwoList(list1, )
        //     }
        // }
        
        
        if (currentListNode!!.next == null) {
            if (currentListNode!!.`val` < shortList.`val`) {
                currentListNode.next = shortList
                shortList = null
                return mergeTwoLists(currentListNode, null)
            }
        }
        
        
        while(currentListNode != null) {
            println("start")
            println(currentListNode.`val`)
            println(currentListNode!!.next)
            println(list2!!.`val`)
            
            if (currentListNode!!.next == null) {
                currentListNode.next = shortList
                shortList = null
                break
            } else {
                if (currentListNode!!.next!!.`val` > list2!!.`val`) {
                    shortList = currentListNode!!.next
                    currentListNode!!.next = list2
                    println("disini")
                    println(currentListNode.`val`)
                    println(currentListNode.next.`val`)
                    println("stophere")
                    break
                }
            }
            
            currentListNode = currentListNode!!.next
        }

        println("break")
        println(longList!!.`val`)
        println(shortList) 
        println("break end")
        
        return mergeTwoLists(longList, shortList)
        
//         // if (list1!!.`val` > list2!!.`val`) {
//         //     return list1
//         // } else {
//         //     return list2
//         // }
        
//         var currentListNode = list1
//         var currentList1 = list1
//         var currentList2 = list2
//         var isIn1 = true
        
//         while (currentListNode!!.next != null) {
            
//             if ((currentList2!!.`val` >=  currentListNode!!.next!!.`val`) && isIn1 ) {
//                 println(currentListNode!!.`val`)
//                 currentListNode!!.next = currentList2
//                 currentList1 = currentList1!!.next
//                 isIn1 = false
//             }
            
//             if ((currentList1!!.`val` >=  currentListNode!!.next!!.`val`) && !isIn1 ) {
//                 println(currentListNode!!.`val`)
//                 currentListNode!!.next = currentList1
//                 currentList2 = currentList2!!.next
//                 isIn1 = true
//             }
//         }
        
        // return currentListNode
    }
}