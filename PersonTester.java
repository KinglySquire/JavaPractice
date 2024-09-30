public class Person {
    private String PersonName;
    private int PersonAge;

    public Person(int _PersonAge){
        this.age = _PersonAge;
    }

    public Person(String _PersonName, int _PersonAge){
        this.age = _PersonAge;
        this.name = _PersonName;
    }

    public int getPersonAge(){
        return this.age;
    }
}

class PersonTester {
    public static void main(String args[]){
        Person thinker = new Person(27);
        System.out.println(thinker.getPersonAge);
    }
}
