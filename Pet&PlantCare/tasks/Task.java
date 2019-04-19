package tasks;
import creature.*;
public abstract class Task
{
   
   // Reminder reminder;
   Creature creature;
   int taskType;
   boolean active;
   boolean repeat;
   
   public Task(Creature creature, int taskType)
   {
      this.creature = creature;
      this.taskType = taskType;
      selected = false;
      active = true;
   }
   
   public Creature getCreature()
   {
      return creature;
   }
   
   public int getTaskType()
   {
      return taskType;
   }
   
   public void setActive(boolean option)
   {
      active = option;
   }
   
   public boolean getActive()
   {
      return active;
   }
   
   public void setRepeat(boolean option)
   {
      repeat = option;
   }
   
   public boolean getRepeat()
   {
      return repeat;
   }
      
}