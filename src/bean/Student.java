package bean;

public class Student {

    int Id;//学号
    String Name;//姓名
    String birDate;//出生日期
    boolean gender;//性别

    public Student(int id, String name, String birDate, boolean gender) {
        this.Id = id;
        this.Name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}

