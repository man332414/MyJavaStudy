package exam;

class Animal 
{ 
	   void breath( ) { System . out . println("숨쉬기"); } 
} 

class Lion extends Animal 
{ 
   public String toString( ) { return "사자"; }
}

class Rabbit extends Animal 
{ 
   public String toString( ) { return "토끼"; } 
}

class Monkey extends Animal
{ 
   public String toString( ) { return "원숭이"; } 
}

class ZooKeeper 
{ 
   void feed(Animal ani) 
   { 
      System . out . println(ani + "에게 먹이 주기"); 
   } 
}

public class exam_3 
{ 
   public static void main(String[] args) 
   { 
      ZooKeeper james = new ZooKeeper( );      
      Animal lion1 = new Lion( );  
      james . feed(lion1); 
      Animal rabbit1 = new Rabbit( ); 
      james . feed(rabbit1); 
      Animal monkey1 = new Monkey( ); 
      james . feed(monkey1);
   }
}	
