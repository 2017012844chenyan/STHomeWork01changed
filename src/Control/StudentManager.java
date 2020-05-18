package Control;

import bean.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void App(List<Student> StudentList ){
        System.out.println("***************");
        System.out.println("*欢迎来到学生管理系统 *");
        System.out.println("*1：插入                    *");
        System.out.println("*2：查找                    *");
        System.out.println("*3：删除                    *");
        System.out.println("*4：修改                    *");
        System.out.println("*5：输出                    *");
        System.out.println("*6：退出                    *");
        System.out.println("***************");
        System.out.println("您想选择的操作是：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){

            //插入学生
            case 1:
                System.out.print("请输入学生的学号：");
                Scanner sId = new Scanner(System.in);
                int id = sId.nextInt();
                System.out.print("请输入学生的姓名：");
                Scanner sName = new Scanner(System.in);
                String Name = sName.nextLine();
                System.out.print("请输入学生的出生日期：");
                Scanner sBirDate = new Scanner(System.in);
                String birDate = sBirDate.nextLine();
                System.out.print("请输入学生的性别：");
                Scanner sGender = new Scanner(System.in);
                String S = sGender.nextLine();
                boolean gender;
                if(S.equals("男")){
                    gender=true;
                }
                else{
                    gender=false;
                }
                StudentList.add(new Student(id,Name,birDate,gender));
                System.out.println("添加成功！！！！！");

                //每次插入后都按升序排列
                Collections.sort(StudentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        int i=o1.getId()-o2.getId();
                        return i;
                    }
                });
                App(StudentList);
                break;

            //查找学生
            case 2:
                System.out.print("请告诉我需要查询学生的姓名：");
                Scanner cName = new Scanner(System.in);
                String cStudentName = cName.nextLine();
                boolean isFindData = false;
                for (int i = 0; i < StudentList.size(); i++) {
                    if(cStudentName.equals(StudentList.get(i).getName())){
                        System.out.println("名字:"+StudentList.get(i).getName());
                        System.out.println("学号:"+StudentList.get(i).getId());
                        System.out.println("出生日期:"+StudentList.get(i).getBirDate());
                        System.out.print("性别:");
                        if(StudentList.get(i).isGender()==true){
                            System.out.println("男");
                        }
                        else{
                            System.out.println("女");
                        }
                        isFindData = true;
                    }
                }
                if(!isFindData){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;

            //删除学生
            case 3:
                System.out.print("请告诉我需要删除学生的姓名：");
                Scanner cName1 = new Scanner(System.in);
                String cStudentName1 = cName1.nextLine();
                boolean isFindDelete = false;
                for (int i = 0; i < StudentList.size(); i++) {
                    if(cStudentName1.equals(StudentList.get(i).getName())){
                        System.out.println("发现了该学生，正在删除...");
                        StudentList.remove(i);
                        System.out.println("删除成功!!!");
                        isFindDelete =true;
                    }
                }
                if(!isFindDelete){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;

            //修改
            case 4:
                System.out.print("请告诉我需要修改成绩学生的姓名：");
                Scanner cName2 = new Scanner(System.in);
                String cStudentName2 = cName2.nextLine();
                boolean isFindChange = false;
                for (int j = 0; j < StudentList.size(); j++) {
                    if(cStudentName2.equals(StudentList.get(j).getName())){
                        System.out.println("发现了该学生，正在修改...");
                        System.out.println("学生原学号为"+StudentList.get(j).getId());
                        System.out.print("请输入修改后学生的学号：");
                        Scanner GId = new Scanner(System.in);
                        String CId = GId.nextLine();
                        StudentList.get(j).setBirDate(CId);
                        System.out.println("学生原出生日期为"+StudentList.get(j).getBirDate());
                        System.out.print("请输入修改后学生的出生日期：");
                        Scanner GbirDate = new Scanner(System.in);
                        String CbirDate = GbirDate.nextLine();
                        StudentList.get(j).setBirDate(CbirDate);
                        System.out.println("修改成功!!!");
                        isFindChange =true;
                    }else{
                    }
                }
                if(!isFindChange){
                    System.out.println("未找到");
                }
                App(StudentList);
                break;

            //输出所有学生信息
            case 5:
                for (int i = 0; i < StudentList.size(); i++) {
                        System.out.println("名字:"+StudentList.get(i).getName());
                        System.out.println("学号:"+StudentList.get(i).getId());
                        System.out.println("出生日期:"+StudentList.get(i).getBirDate());
                        System.out.print("性别:");
                        if(StudentList.get(i).isGender()==true){
                            System.out.println("男");
                        }
                        else{
                            System.out.println("女");
                        }
                    }
                App(StudentList);
                break;

            //退出
            case 6:
                System.out.println("成功退出");
                break;
            default:
                System.out.println("您输入的数字有误，请重新输入：");
                App(StudentList);
                break;
        }

    }
}




