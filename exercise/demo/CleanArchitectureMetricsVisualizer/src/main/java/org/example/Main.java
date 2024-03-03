package org.example;

//import jdepend.swingui.JDepend;

import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("report/report.xml"));
        depend.addDirectory("T:\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");

    }
}