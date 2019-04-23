package creature;

public class SamplePlant extends Plant
{
   public SamplePlant()
   {
      super();
      addTask( this,PlantTask.WATER);
      addTask( this,PlantTask.FERTILIZATION);
      addTask( this,PlantTask.PRUNNING);
       
   }
   
   public void createCustomTask()
   {
      addTask( this,PlantTask.CUSTOM);  
   }
}
