package com.test2;

import com.exception.RuleException;

public class TestException {

    public static void main(String[] args) {

        try {
            testA(true);

            testB(true);
        } catch (RuleException e) {
            System.out.println(e.getErrorCode() + " ***** " + e.getErrorMessage());
        }
    }

    public static void testA(boolean flag) throws RuleException {
        if (flag) {
            System.out.println("=== AAAAA - 1 === : ");
            throw new RuleException("100001", "异常A");
        }
        System.out.println("=== AAAAA - 2 === : ");
    }

    public static void testB(boolean flag) throws RuleException {
        if (flag) {
            System.out.println("=== BBBBB - 1 === : ");
            throw new RuleException("100002", "异常B");
        }
        System.out.println("=== BBBBB - 2 === : ");
    }
}
