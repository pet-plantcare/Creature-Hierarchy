package tasks;
/**
 * @author AsyaDoğaÖzer
 * @date 19.04.2019
 */
public class PlantTask extends Task
{
   //properties
   public static final int WATER           = 0;
   public static final int FERTILIZATION   = 1; 
   public static final int PRUNNING        = 2;
   public static final int CUSTOM          = 3;
   
   //constructor
   PlantTask()
   {
      public PlantTask(Creature creature, int taskType) //bundan da emin değilim... 
      {
         super( creature , taskType );
      }
   }
   
   //methods
   
   
}
