package ScoreList;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreList {
    int maxLength = 100;
    int length = 0;
    Score[] list = new Score[maxLength];

    Scanner input = new Scanner(System.in);

    public void showList() {
        System.out.printf("%-s", "课程名称");
        System.out.printf("%-10s", "学生姓名");
        System.out.printf("%-10s", "学生学号");
        System.out.printf("%-10s", "分数");
        for (int i = 0; i < length; i++) {
            System.out.printf("%-s", list[i].getCourseName());
            System.out.printf("%-10s", list[i].getStudentName());
            System.out.printf("%-10s", list[i].getStudentID());
            System.out.printf("%-10.1ld", list[i].getScore());
            System.out.print("\n");
        }
    }

    public void add() {
        if (length >= maxLength) {
            System.out.println("列表容量不足添加失败！");
            return;
        }
        System.out.println("请录入信息！");
        System.out.print("课程名称: ");
        list[length].setCourseName(input.next());
        System.out.print("学生姓名: ");
        list[length].setStudentName(input.next());
        System.out.print("学生学号: ");
        list[length].setStudentID(input.next());
        System.out.print("分数: ");
        list[length].setScore(input.nextDouble());
        length++;
    }

    public void set() {
        System.out.print("请输入需要修改的学生学号：");
        String inputID = input.next();
        System.out.print("请输入需要修改的课程：");
        String inputCourseName = input.next();
        for (int i = 0; i < length; i++) {
            if (inputID.equals(list[i].getStudentID()) &&
                    inputCourseName.equals(list[i].getCourseName())) {
                System.out.println("请录入信息！");
                System.out.print("分数");
                list[i].setScore(input.nextDouble());
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("查无此人，修改失败！");
    }

    public void delete() {
        System.out.print("请输入需要删除信息的学生学号：");
        String inputID = input.next();
        System.out.print("请输入需要删除的课程：");
        String inputCourseName = input.next();
        for (int i = 0; i < length; i++) {
            if (inputID.equals(list[i].getStudentID()) &&
                    inputCourseName.equals(list[i].getCourseName())) {
                for (int j = 0; i + j < length - 1; j++) {
                    list[i + j] = list[i + j + 1];
                }
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("查无此人，删除失败！");
    }

    public void getCourseScore() {
        System.out.print("请输入需要查询的课程：");
        String inputCourseName = input.next();
        double max = 0;
        double min = 1000;
        double sum = 0;
        int cnt = 0;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (inputCourseName.equals(list[i].getCourseName())) {
                flag = false;
                double num = list[i].getScore();
                max = max > num ? max : num;
                min = min < num ? min : num;
                sum = sum + num;
                cnt = cnt + 1;
            }
        }
        if (flag) {
            System.out.println("查无此课程，查询失败！");
            return;
        }
        System.out.printf("%-10s", "最高分");
        System.out.printf("%-10.1d", max);
        System.out.printf("%-10s", "最低分");
        System.out.printf("%-10.1d", min);
        System.out.printf("%-10s", "平均分");
        System.out.printf("%-10.2d", sum / cnt);
        System.out.print("\n");
    }

    public void searchStudentScoreByStudentID() {
        System.out.print("请输入需要查询的学生学号：");
        String inputStudentID = input.next();
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if(inputStudentID.equals(list[i].getStudentID())){
                flag = false;
                System.out.printf("%-10s", list[i].getCourseName());
                System.out.printf("%-10.1d", list[i].getScore());
                System.out.print("\n");
            }
        }
        if(flag){
            System.out.println("查无此人，查询失败！");
            return;
        }
    }

    public void sort() {
        Arrays.sort(list);
    }
}