package shopping;

import java.util.Scanner;// 这里真的找不到原生写法，只能借助util

public class Monitor {

    public Stack location;
    private Scanner scanner;
    // 当前控制对象
    private Object curController;

    // 构造函数
    Monitor(Object controller) {
        this.curController = controller;
        this.location = new Stack(5);
        this.location.push("主菜单");
        this.scanner = new Scanner(System.in);
    }

    // 获取当前控制对象
    public Object getCurController() {
        return this.curController;
    }

    public char askForOperation() {
        this.renderDivider();
        System.out.print("请输入操作：");
        String s = this.scanner.nextLine();
        return s.toCharArray()[0];
    }

    public String askForLine() {
        return this.scanner.nextLine();
    }

    public void renderLocation() {
        String result = "";
        for (int i = 0; i <= this.location.op; i++) {
            result += this.location.getData()[i] + ">";
        }
        result = result.substring(2, result.length() - 1);
        System.out.print(result);
        System.out.println("");
    }

    public void clearPrint() { //清屏，实际上是打印很多行换行符，找不到其他方法了，先用着。
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
    }

    // 打印方法
    public void print(String str) {
        this.renderLocation();
        System.out.println("");
        this.renderDivider();
    }

    public void renderDivider() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void renderMessage(Message message) {
//        this.renderDivider();
//        this.renderLocation();
//        this.renderDivider();
        System.out.println("名称：" + message.name);
        System.out.println("类别：" + message.type);
        this.renderDivider();
        System.out.println("可执行操作：");
        for (int i = 0; i < message.operation.operations.length; i++) {
            System.out.println("【" + i + "】: " + message.operation.operations[i]);
        }
    }
}

class Operation {

    public String[] operations;

    Operation(String[] operations) {
        this.operations = operations;
    }
}

class Message {

    public String name;
    public String type;
    public Operation operation;

    Message(String name, String type, Operation operation) {
        this.name = name;
        this.type = type;
        this.operation = operation;
    }
}
