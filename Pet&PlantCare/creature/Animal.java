package creature;
import tasks.*;
public abstract class Animal extends Creature
{
   public Animal()
   {
      super();
   }
   
   //methods
   @Override
   /**
    * adds new tasks to animal.
    * @param taskType, sign of the task that will be added.
    */ 
   public void addTask( int taskType) { //INSTANTIATING TO ANIMALTASK SINCE ABSTRACT CLASSES CAN NOT BE INSTANTIATED!!
      Task newTask = new AnimalTask( this, taskType);
      tasks.add( newTask);
   }
}
