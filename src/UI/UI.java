package UI;

public class UI {
    public static void main(String[] args) {
        UI.home();
    }

    public static void home(){
        title();
        menu();
        while(true)
            callback();
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
    }
    
    public static void callback() {
        
    }
}
