package com.github.yanzheshi.structure.composite;

/**
 * @author shiyanzhe
 */
public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();

        //创建数值构件
        Composite branch = new Composite();

        Leaf leaf = new Leaf();

        //建立整体
        root.add(branch);
        branch.add(leaf);

    }
}
