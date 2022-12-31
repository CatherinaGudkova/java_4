public class Human {
    int id;
    String name;
    String gender;
    Division division;
    int salary;
    String birth;

    public Human(int id, String name, String gender, Division division, int salary, String birth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birth = birth;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public String getBirthday() {
        return birth;
    }


    public String toString() {
        return
                "ID = " + id + ", ИМЯ " + name  + ", ПОЛ " + gender    +", ЗАРПЛАТА " + salary + ", ДАТА РОЖДЕНИЯ " + birth+ ",[ПОДРАЗДЕЛЕНИЕ: "+ division.toStringDivision() + "]"  ;
    }
}



