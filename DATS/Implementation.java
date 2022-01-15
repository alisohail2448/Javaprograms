public class Implementation extends Node {
    public static void main(String[] args) {
      LinkedList MyList = new LinkedList();
  
      //Add three elements at the end of the list.
      MyList.push_back(10);
      MyList.push_back(20);
      MyList.push_back(30);
  
      //traverse to display the content of the list.
      MyList.PrintList(); 
    }
  }