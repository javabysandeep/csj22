package collectionFramework.revision;

public class Person /*implements Comparable<Person>*/ {
    private Integer personId;
    private String personName;
    private Integer personaBankBalance;

    public Person(Integer personId, String personName, Integer personaBankBalance) {
        this.personId = personId;
        this.personName = personName;
        this.personaBankBalance = personaBankBalance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personaBankBalance=" + personaBankBalance +
                '}';
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonaBankBalance() {
        return personaBankBalance;
    }

    public void setPersonaBankBalance(Integer personaBankBalance) {
        this.personaBankBalance = personaBankBalance;
    }

   /* @Override
    public int compareTo(Person person) {
        return person.personaBankBalance - this.personaBankBalance;
    }*/
}
