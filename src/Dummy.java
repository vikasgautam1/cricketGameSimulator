import java.util.Objects;

public class Dummy {

    private String firstName;
    private String lastName;

    private Integer age;
    public Dummy(){

    }
    public Dummy(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // TODO Auto-generated method stub
//        if(obj instanceof Dummy)
//        {
//            Dummy temp = (Dummy) obj;
//            if(this.firstName.equals(temp.firstName) && this.lastName.equals(temp.lastName))
//                return true;
//        }
//        return false;
//    }

}
