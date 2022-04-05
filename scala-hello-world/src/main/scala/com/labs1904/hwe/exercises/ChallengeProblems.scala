package com.labs1904.hwe.exercises

object ChallengeProblems {
  /*
    1. Define a function that takes in a String and returns that string with no changes
    Write your function below this comment - refer to Challenge Tests to have your test pass
    Params - String
    Returns - String
  */
  def sameString(someStr: String ): String = {
    someStr
  }

  /*
  2. Write a function that returns "Hello World!" and takes in nothing as a parameter
  Params - None
  Returns - String
   */
  def helloWorld(): String = {
    "Hello World!"
  }

  /*
  3. Write a function that takes in a list and returns the total size of the list
  -Note - Use the .size method
  Params - List[Int]
  Returns - Int
   */
  def listSize (numList: List[Int]): Int = {
    numList.size
  }


  /*
  4. Write a function that takes in an int and adds an int that you create within the function and returns the addition of the two together
  Note - Your variable must be a val and must be equal to 25
  Params - Int
  Returns - Int
   */

  def sumInts (num: Int): Int = {
    num + 25
  }


  /*
   5. Write a function that takes in a list of strings, and return a list of strings where every letter is capitalized
   Hint - you can use .map here
   Params - List[String]
   Returns - List[String]
*/
  def upper (words: List[String]): List[String] = {
    words.map( x => x.toUpperCase())
  }
  /*
  6. Write a function that returns a new list, where only elements of the list passed in that are 0 or positive numbers are kept.
  Params - List[Int]
  Returns - List[Int]
   */
  def filterNegatives (valueList: List[Int]): List[Int] = {
      valueList.filter( x => x >= 0)
  }

  /*
  7. Returns a new list, where only the elements passed in containing "car" are kept to the new list.
  Params - List[String]
  Returns - List[String]
 */
  def containsCar (wordList: List[String]): List[String] = {
    wordList.filter(x => x.contains("car"))
  }
  /*
    8. Returns the sum of all numbers passed in.
    Params - List[Int]
    Returns - Int
   */
 def sumList (numList: List[Int]): Int = {
   numList.sum
 }
  /*
  9. Write a function that takes in an integer with a cats age, and return the human age equivalent.
    A human year is equivalent to 4 cat years
    Params - Int
    Returns - Int
   */
  def catsAge (humanAge: Int): Int = {
    humanAge * 4
  }
  /*
  10. Same question as #9, but this time you are given a Option[Int]
    If an int is provided, returns a cats age for the human's age equivalent.
    If None is provided, return None
    A humanYear is equivalent to four catYears
    -Params - Option[Int]
    -Returns - Option[Int]
 */
 def catsAgeOption (opAge: Option[Int]): Option[Int] = {
   opAge.get * 3
   val result = opAge.map(x => x * 4);
   result.orElse(None)

   /*opAge match {
     case Some(value) => Some(value * 4)
     case None => None
   }
  */

 }
  /*
  11. Write a function that takes in a list of ints, and return the minimum of the ints provided
  Params - List
  Returns - Int
   */
def minimum (numList: List[Int] ): Int = {
  numList.min
}

  /*
  12. Same as question 11, but this time you are given a list of Option[Ints], returns the minimum of the Ints provided.
  If no ints are provided, return None.
 */
def minimumOption(numList: List[Option[Int]]): Option[Int] = {
  numList.min.orElse(None)
}










}
