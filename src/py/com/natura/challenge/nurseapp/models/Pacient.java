package py.com.natura.challenge.nurseapp.models;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class Pacient {

    private Integer pacientId;
    private String name;
    private String lastName;
    private Integer age;


    public Pacient() {
    }

    public Integer getPacientId() {
        return pacientId;
    }

    public void setPacientId(Integer pacientId) {
        this.pacientId = pacientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " pacientId=" + pacientId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
