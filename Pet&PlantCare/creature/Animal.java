package creature;
public abstract class Animal extends Creature
{
   public Animal()
   {
      super();
   }
   
   //methods
   @Override
   public abstract void addTask( int taskType) {
      Task newTask = new Task(this, taskType);
      tasks.add( newTask);
   }
}
