package creature;
import java.util.ArrayList;
//import tasks.*;
public abstract  class Creature
{
   static int no = 0;
   String name;
   int age;
   String notes;
   protected ArrayList<Task> tasks;
   
   public Creature()
   {
      name = "Creature " + no;
      age = 0;
      notes = "";
      no++;
      tasks = new ArrayList<Task>();
   }
   
   //methods
   public String getName() {
      return name;
   }
   
   public void setName( String name) {
      this.name = name;
   }
   
   
   public int getAge() {
      return age;
   }
   
   public void setAge( int age) {
      this.age = age;
   }
   
   public void setNotes( String notes) {
      this.notes = notes;
   }
   
   public String getNotes(){
      return notes;
   }
   
   public abstract void addTask(int taskType);
      
}
