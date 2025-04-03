public class Lab00
{
    //function for counting num of a give char in a string
   public static int char_count(String s, char c){
      int count = 0; // init count variable
       // for loop to look through string and compare the give char to the current char and increase the count
      for(int i = 0; i<s.length(); i ++){
         char ch = s.charAt(i);//init current char
         if (ch == c){ // if current char equals given char increase count
            count ++;
         }
      }
      return count; // return count
   }
   //converted main of the give python file
   public static void main(String[] args)
   {
       //declaring and initialing some variables
        int x =5;
        String y = "hello";
        float z = 9.8F;

        //printing the variables
        System.out.println("x: "+  x + " y: " + y + " z: " + z);

        // init java array of ints
        int[] nums = {3,6,-1,2};
        for (int num : nums) {
            System.out.println(num);
        }

        // define new variable and call a function
        int numFound;
        numFound = char_count(y,'l');
        System.out.println("Found: "+numFound);

        // a counting for loop
        for (int i = 1; i<11; i++){
            System.out.print(i + " ");
        }

   }
}
