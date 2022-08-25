//While Loop in Java
//repeat the loops forever until a specified trigger occurs
pulic calss WhileLoops {

  public static void main (String[] args) {
//while(boolean) == while (statement that is True OR False)

  while(true){
    System.out.println("a");
  }

  int a = 0;

  while (a < 10){
    System.out.println("a is less than 0:" + a);
 //increment a by 1?
    a++;
  }
//While loop vs. For loop
  for(int i = 0; i < 10; i++){
    System.out.println("i is less than 10:" + i);
  }
//do/while loop
//do always run what is in the{} regardless of whether while(true/false)
//do is NOT followed by "()" <= condition

   int a = 0;

//Result in the Console: a gets run for infnite times bc of while(true), which equals to while(a == 0)
  do{
    System.out.println("a");
  } while(true);

//Result in the Console: a only get to run for 1 time (stopped by while (a == 1) )
  do{
    System.out.println("a");
  } while(a == 1);
//the sequence of while() and do{} matter
 }
}

//ForLoop in Java
pulic calss WhileLoops {

  public static void main (String[] args) {

 //1.repeat code over & over for a desirable times
  //a < 10 ==> print "I love cats!" for 10 times

   //for()loop is always followed by int...
    for(int a = 0; a < 10; a++){
      System.out.println("I love cats!");
    }

 //2. repeat code with the special variable
    for(inte b = 0, b < 5, b++){
      System.out.println(b);
    }

 //3.Access elements in an Array
  //Create an Array
   String[] events = {"Carnival","Cookout","Coke Toast"};

//objects'name.length ==> number of items in an Array, which is 3 in this case
 for(int i = 0; i < events.length, i++){
//events[1] ==> output the events in the first place
    System.out.println(events[i]);

    }

 }
}

//Convert String into Integer (Int)

public class StringtoInteger {

  public static void main (String[] args) {
    //Can not do math with String
      String a = "1130";
      //This function turn ur Srting into an Integer
      Integer.parseInt(a);
      Integer.parseInt("1130");
      //Output:1133 instead of 11303
      System.out.println(a+3);
  //From Integer to String
      Int b = 8;
      Integer.toString(8);
      //Output: 81 instead of 9
      System.out.println(b+1);

      String c = "age: 20";
    //Regular Expression????
    // .replaceAll() substitues non-digits of the string with an empty string
      c = c.replaceAll("\\D+","");


      int d = Integer.parseInt(c);
    //Output: 20+1=21
      System.out.println(c+1);
  }
}
