package com.labs1904.hwe.exercises

object StretchProblems {

  /*
  Checks if a string is palindrome.
 */
  def isPalindrome(s: String): Boolean = {
    s == s.reverse
  }

  /*
For a given number, return the next largest number that can be created by rearranging that number's digits.
If no larger number can be created, return -1
 */
  def getNextBiggestNumber(i: Integer): Int = {
    val iAsString = i.toString;
    val allNumberPermutationsList = i.toString.permutations.mkString.grouped(iAsString.length).toList.map(x => x.toInt).sorted
    val listOfLargerNumbers = allNumberPermutationsList.filter( x => x > i)
    val theNextLargest = listOfLargerNumbers.headOption
    theNextLargest match {
      case Some(value) => value
      case None => -1
    }

  }

}
