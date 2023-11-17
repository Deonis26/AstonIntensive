package HomeWork.Lesson_4;

public class Person {
    private String nameLastName;
    private String jobTitle;
    private String email;
    private String telephone;
    private int age;
    private int salary;

    public Person(String nameLastName, String jobTitle, String email, String telephone, int age, int salary) {
        this.nameLastName = nameLastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "фамилия имя: " + nameLastName + ", должность: " + jobTitle + ", email: " + email + ", телефон: " + telephone
                + ", возраст= " + age + ", зарплата: " + salary + ".";


    }


}
