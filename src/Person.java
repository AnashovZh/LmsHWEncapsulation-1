public class Person {
    private  String name;
    private int age;
    private String group;


    public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0){
        this.age=age;}
        else System.out.println(" on jash beriniz:");
    }public int getAge(){
        return age;
    }
    public void setGroup(String group){
        this.group=group;
    }public String getGroup(){
        return group;
    }




}
