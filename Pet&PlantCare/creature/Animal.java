package creature;
import tasks.*;
import java.util.*;

public abstract class Animal extends Creature
{
   //properties
   protected ArrayList<Dog> dogs;
   protected ArrayList<Cat> cats;
   protected ArrayList<Fish> fishes;
   protected ArrayList<Bird> birds;
   
   public Animal()
   {
      super();
      
      dogs = new ArrayList<Dog>();
      cats = new ArrayList<Cat>();
      fishes = new ArrayList<Fish>();
      birds = new ArrayList<Bird>();    
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
      
      public void createCustomTask()
      {
         //for costomized tasks
            addTask( AnimalTask.CUSTOM_ANIMAL);
      }
   }
