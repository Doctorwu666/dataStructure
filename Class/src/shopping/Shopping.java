/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author 69465
 */
public class Shopping {

    public static void main(String[] args) {

        /**
         * ***测试案例 可以在这里参考各方法的作用****
         */
//        CommLink commLink = new CommLink(); //创建商品链表
//
//        commLink.add(new Commodity("001", "可乐", 1.5, 10)); //向链表插入四个商品
//        commLink.add(new Commodity("002", "雪碧", 3.0, 15));
//        commLink.add(new Commodity("003", "橙汁", 3.0, 8));
//        commLink.add(new Commodity("004", "椰子汁", 4.0, 12));

//        System.out.println("插入的四个商品：");
//        commLink.printData();
//        CommLink commTempLink = commLink.createCommLinkByID("002", "003"); //将ID为002和003的商品串为一条新链表，用于下面创建新分类时加入。
//        Classification clas = new Classification("yingliao", "饮料", commTempLink); //创建一个饮料分类
//        System.out.println("\n新创建的分类：");
//        clas.printData();
//        
//        System.out.print("\n\n刚创建分类时分类包含这些商品：");
//        clas.commodity.printName();
//        clas.commodity.add(commLink.findCommByID("001")); //在商品链表中查找ID为001商品加入到该分类中
//        System.out.print("\n新加入商品后分类包含这些商品：");
//        clas.commodity.printName();
//        clas.deleteCommByID("002"); //在分类中删除ID为002商品
//        System.out.print("\n删除后分类包含这些商品：");
//        clas.commodity.printName();
        /**
         * ***测试案例 可以在这里参考各方法的作用****
         */
//        Monitor monitor = new Monitor(new Object());
//        monitor.print("1");
//        String[] strings = new String[2];
//        strings[0] = "测试1";
//        strings[1] = "测试2";
//        monitor.renderMessage(new Message("测试名称","测试类别",new Operation(strings)));
//        monitor.renderMessage(commLink.findCommByID("001").getMsg());
        Market market = new Market();
        market.run();

    }

}
