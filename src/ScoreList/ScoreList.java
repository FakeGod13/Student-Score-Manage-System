package ScoreList;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreList {
    int maxLength = 100;
    int length = 0;
    Score[] list = new Score[maxLength];

    Scanner input = new Scanner(System.in);

    public void add() {
        if (length >= maxLength) {
            System.out.println("列表容量不足添加失败！");
            return;
        }
        System.out.println("请录入成绩信息！");
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

    public void sort() {
        Arrays.sort(list);
    }
}