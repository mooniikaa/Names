public class Human {
    private String name;
    private String family;
    private int age;
    public Human(String name, String family, int age){
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getFamily(){
        return family;
    }
    public void setFamily(String family) {this.family = family;}
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return name + " " + family + " age = " + age;
    }
}
