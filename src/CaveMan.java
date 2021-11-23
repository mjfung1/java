public class CaveMan {
    
    private String name;
    private int age;
    private float weight;

    
    // public CaveMan(String name, int age, float weight) {
    //     this.name = name;
    //     this.age = age;
    //     this.weight = weight;
    // }

    // parameter constructor
    public CaveMan(String n, int a, float w) {
        this.name = n;
        this.age = a;
        this.weight = w;
    }

    // default constructor
    public CaveMan() {
        this.name = "They haven't given me a name yet";
        this.age = 8;
        this.weight = 100f;
    }



    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public float getWeight() {
    //     return weight;
    // }

    // public void setWeight(float weight) {
    //     this.weight = weight;
    // }

    


}
