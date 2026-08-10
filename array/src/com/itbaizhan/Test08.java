package com.itbaizhan;

//使用javabean和数组保存表格数据
public class Test08 {
    public static void main(String[] args) {
        Emp[] emps = {
                new Emp(1001,"line1",18,"讲师","2-14"),
                new Emp(1002,"line8",19,"助教","10-10"),
                new Emp(1003,"line10",20,"班任","5-5")
        };

        for(Emp e:emps){
            System.out.println(e);
        }
    }
}

class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiredate;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }

    public Emp(int id, String name, int age, String job, String hiredate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
