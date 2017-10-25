import scala.collection.mutable.ListBuffer

class Assignment12_2Class {
  val list = List[String]("alpha", "gamma", "omega", "zeta", "beta")
  
  //finding count of all strings with length 4
  def countWithLengthFour(){
    var count=0;
    for (name <- list) 
      {
      if(name.length()==4)
      {
        count= count+1;
      }
      }
    println("Problem 1 - Count of all strings with length 4 = "+count);
  }
  
  //converting the list of string to a list of integers, where each string is mapped to its corresponding length
  def convertListToLengthList():ListBuffer[Int] ={
    val lenList = ListBuffer[Int]();
    for (name <- list) 
      {
      lenList += name.length();
      }
    println("Problem 2 - List of string lengths = " + lenList);
    return lenList;
  }
  
  //find count of all strings which contain alphabet ‘m’
  def findCountOfStringContainingM() ={
    var count = 0;
    for (name <- list) 
      {
      if(name.contains('m') || name.contains('M'))
      {
        count = count+1;
      }
      }
    println("Problem 3 - Count of strings containing M = " + count);
   }
  
  //finding the count of all strings which start with the alphabet ‘a’
  def findCountOfStringStartsWithA() ={
    var count = 0;
    for (name <- list) 
      {
      if(name.startsWith("a") || name.startsWith("A"))
      {
        count = count+1;
      }
      }
    println("Problem 4 - Count of strings starting with A = " + count);
    }
}

object MainObj{
  def main(args:Array[String])
  {
    var obj = new Assignment12_2Class();
    obj.countWithLengthFour();
    obj.convertListToLengthList();
    obj.findCountOfStringContainingM()
    obj.findCountOfStringStartsWithA();
  }
}
