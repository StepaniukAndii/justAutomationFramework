package Pashkovsky;

public class Cat {
    private String name;
    private int age;

    public void check(){
        System.out.println(getName() + " " + getAge());
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
  public void setName(String name) {
        this.name = name;

  }
  public void setAge(int age){
    this.age = age;

  }

}
