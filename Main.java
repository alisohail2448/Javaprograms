class Main {

   public static void main(String args[]) {

      int[] marks = { 98, 97, 95 };
      try {
         System.out.println(marks[4]);
      } catch (Exception e) {
         System.out.println("An exception for caught while accessing an index the 'marks' array");
      }

      System.out.println("We tried to print marks & an exception must have occurred with index >=3");
   }
}