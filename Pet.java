package GroupPresentation;

public class Pet {
//    private boolean docile;
//    private boolean naughty;
    private int age;
    private String name;
    private String docile;

    public Pet(int age,String docile,String name) {
        this.age = age;
        this.name = name;
        this.docile = docile;
//        this.docile = docile;
//        this.naughty = naughty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocile() {
        return docile;
    }

    public void setDocile(String docile) {
        this.docile = docile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "This is " + name + " and it is "
                + age + " years old." + "\nHobbies : "
                + docile;
    }
}
