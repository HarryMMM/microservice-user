package cn.harryai.microserviceuser;

import org.junit.Test;

public class tests {

    @Test
    public void test(){
        Object [] emptyObjs={};
        Object [] emptyObjs2=new Object[0];
        System.out.println(emptyObjs==null);
        System.out.println(emptyObjs2==null);
        int b=Integer.MAX_VALUE;
        int a=b*999999999;
        long c=b*999999999;
        System.out.println("Integer max value : "+Integer.MAX_VALUE);
        System.out.println("int variable = Integer max value multiply 999999999 : "+a);
        System.out.println("long variable = Integer max value multiply 999999999 : "+c);
    }

}
