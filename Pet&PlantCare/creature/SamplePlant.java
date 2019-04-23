package creature;

public class SamplePlant extends Plant
{
   public SamplePlant()
   {
      super();
      addTask( PlantTask.WATER);
      addTask( PlantTask.FERTILIZATION);
      addTask( PlantTask.PRUNNING);
       
   }
   
   
}
