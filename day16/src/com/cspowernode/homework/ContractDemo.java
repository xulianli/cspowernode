package com.cspowernode.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author 徐联理
 * @Date 2023/3/24 20:10
 * @Description
 * 3.劳动合同的续签问题：给定签劳动合同的日期以及签订的年份，然后算出你续签的日期，所谓续签的日期是指合同到期那天的
 * 前一个月，如果那天是周末，那么顺延到周一，算出周一那天的日期；
 */
public class ContractDemo {
    public static void main(String[] args) {
        LocalDate contractDate = LocalDate.of(2022,1,22);
        int contractYear = 3;
        LocalDate renewalDate = calculateRenewalDate(contractDate, contractYear);
        System.out.println("Contract signed on " + contractDate);
        System.out.println("Contract term: " + contractYear + " years");
        System.out.println("Contract will be renewed on " + renewalDate);
    }

    private static LocalDate calculateRenewalDate(LocalDate contractDate, int contractYear) {
        LocalDate renewalDate = contractDate.plusYears(contractYear).minusMonths(1);
        if (renewalDate.getDayOfWeek()== DayOfWeek.SUNDAY) {
            renewalDate = renewalDate.plusDays(1);
        }
        return renewalDate;
    }
}
