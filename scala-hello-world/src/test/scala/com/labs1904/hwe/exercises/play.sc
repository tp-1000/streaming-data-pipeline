val str: String = "1423"
val strPerm = str.permutations
val setsOfStrInts = strPerm.mkString.grouped(4).toList // last index of and then if its
val ordersListOfStrInts = setsOfStrInts.sorted
val list = strPerm.length/str.length < strPerm.mkString.lastIndexOf("1234")


val nums = List(2,3,4,5)
val nums2 = List()

def mySum(listOfNumbers: List[Int]): Int = {
  if (listOfNumbers.isEmpty) {
    0
  } else {
    listOfNumbers.head + mySum(listOfNumbers.tail)
  }

}

mySum(nums2)

val directionalStates = Array(
  "West Virginia",
  "North Dakota",
  "South Dakota",
  "North Carolina",
  "South Carolina",
  "West Virginia"
)

def myFilter(states: Array[String], output: Array[String]): Array[String] = {
  if (states.isEmpty) {
    output
  } else if (states.head.contains("North")) {
    val newOutput: Array[String] = output :+ states.head
    myFilter(states.tail, newOutput)
  } else {
    myFilter(states.tail, output)
  }
}




//subset method (must convert first to subset
//val xx = list.toSet[Int]
//val zz = xx.subsets.map(x => x.toList).toList
//val mm = zz.map(x => (x.mkString))
//val mm = zz.map(x => (x.mkString))

// number take out second to last digit and move it to the end.
//



//

//    312
//   3120
//32-12
//321

//calculate all permentations
//sort that list
//get position of current -- if not last return next
//else retun -1

//1 2 3

val placesToVisit: Map[String, String] = Map(
  "MO" -> "Missouri",
  "KS" -> "Kansas",
  "WA" -> "Washington",
  "TX" -> "Texas"
)


val placesIveVisited: List[String] = List(
  "MO",
  "KS",
  "IL"
)

placesIveVisited.flatMap(code => placesToVisit.get(code))
