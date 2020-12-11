class Animal 
{
   protected String type;
   private String color;
   public void eat()
   {
        System.out.println("I can eat");
   }
   public void sleep()
   {
        System.out.println("I can sleep");
   } 
   public void setColor(String col)
   {
        this.color=color;
   }
   public String getColor()
   {
        return color;
   }
}
class Dog extends Animal 
{
    public void displayInfo(String c)
    {
        System.out.println("I am a "+type);
        System.out.println("My colour is "+c);
    }
    public void bark()
    {
        System.out.println("i can bark");
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();    
        d.type = "mammal";
        d.setColor("Black");
        d.displayInfo(d.getColor());
    }
}