package creature;
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
   public abstract void addTask( int taskType) {
      Task newTask = new Task( this, taskType);
      tasks.add( newTask);
   }
}
