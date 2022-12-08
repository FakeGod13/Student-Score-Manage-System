package UI;

import ScoreList.ScoreList;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        ScoreList data = new ScoreList();
        Scanner input = new Scanner(System.in);
        while (true) {
            home();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    data.showList();
                    break;

                case 2:
                    data.add();
                    data.sort();
                    break;

                case 3:
                    data.set();
                    break;

                case 4:
                    data.delete();
                    break;

                case 5:
                    data.getCourseScore();
                    break;

                case 6:
                    data.searchStudentScoreByStudentID();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid input! Please enter again.");
                    break;
            }
            System.out.println("输入任何内容回车继续...");
            input.next();
        }
    }

    public static void home() {
        title();
        menu();
    }

    public static void title() {
        System.out.println("************************");
        System.out.println(" 学 生 成 绩 管 理 系 统 ");
        System.out.println("************************");
    }

    public static void menu() {
        System.out.println("1.查看学生成绩单");
        System.out.println("2.添加学生成绩记录");
        System.out.println("3.修改学生成绩记录");
        System.out.println("4.删除学生成绩记录");
        System.out.println("5.查询课程平均分、最高分和最低分");
        System.out.println("6.查询学生成绩（根据学号查询）");
        System.out.println("0.退出系统");
        System.out.print("Enter your choice:");
    }

}
