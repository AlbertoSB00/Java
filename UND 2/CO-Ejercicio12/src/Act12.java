public class Act12 {
    private Person[] people;

    public Act12(){
        people = new Person[10];
    }

    public boolean addPerson (Person p, int index){
        if( this.people[index] != null ){
            return false;
        }

        this.people[index] = p;
        return true;
    }

    public Person getPerson(int index){
        return this.people[index];
    }
}
