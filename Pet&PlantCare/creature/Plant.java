package creature;
public abstract class Plant extends Creature {
   
   //properties
   private int height;
   private String species;
   
   //constructor
   public Plant()
   {
      super();
      height = 0;
      species = "N/A";
   }
   //methods
   @Override
   /**
    * adds new tasks to plant.
    * @param taskType, sign of the task that will be added.
    */ 
   public abstract void addTask( int taskType) {
      Task newTask = new Task(this, taskType);
      tasks.add( newTask);
   }
   
   public int getHeight() {
      return height;
   }
   
   public void setHeight( int height)
   {
      this.height = height;
   }
   
   public void setSpecies(String species)
   {
      this.species = species;
   }
   
   public String getSpecies()
   {
      return species;
   }
   
   
   
   
   
}
