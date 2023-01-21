package org.xbb.javabasictest;

public class RecordTest {
    public static void main(String[] args) {
        var po1 = new point(1,1);
        System.out.println(po1.getPoint());
        System.out.println(po1);//调用toString方法
    }
}

record point(double x,double y) {
    //int i = 0;记录中无实例字段，除非定义static
    public String getPoint() {
        return "("+x+","+y+")";
    }
}
