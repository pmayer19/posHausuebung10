/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.htlgkr.mayerp190093.PosHausuebung10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author mayer
 */
public class Main {
    
   static LocalDateTime a = LocalDateTime.of(2003, 04, 15, 06, 30, 15);
   static LocalDateTime b = LocalDateTime.of(2003, 04, 03, 07, 20, 30);
    
    public static void main(String[] args) {
    System.out.println("Years: " + yearsBetween());
    System.out.println("Months: " + monthsBetween());
    System.out.println("Days: " + daysBetween());
    System.out.println("Hours: " + hoursBetween());
    System.out.println("Minutes: " + minutesBetween());
    System.out.println("Sekunden: " + secondsBetween());
    
    allDatesBetween();
    
    Scanner sc = new Scanner(System.in);
    
    int years = sc.nextInt();
    int months = sc.nextInt();
    int days = sc.nextInt();
    int hours = sc.nextInt();
    int minutes = sc.nextInt();
    int seconds = sc.nextInt();
    
    LocalDateTime eingabe = LocalDateTime.of(years, months, days, hours, minutes, seconds);
    System.out.println(eingabe);
    }
    
    public static int yearsBetween()
    {
        int years =(int) ChronoUnit.YEARS.between(a, b);
        return years;
    }
    
    public static int monthsBetween()
    {
        int months = (int) ChronoUnit.MONTHS.between(a, b);
        return months;
    }
    
    public static int daysBetween()
    {
        int days = (int) ChronoUnit.DAYS.between(a, b);
        return days;
    }
    
    public static int hoursBetween()
    {
        int hours = (int) ChronoUnit.HOURS.between(a, b);
        return hours;
    }
    
    public static int minutesBetween()
    {
        int minutes = (int) ChronoUnit.MINUTES.between(a, b);
        return minutes;
    }
    
    public static int secondsBetween()
    {
        int seconds = (int) ChronoUnit.SECONDS.between(a, b);
        return seconds;
    }
    
    
    public static void allDatesBetween()
    {
        while(b.isBefore(a))
    {
        System.out.println(b.toString());
        b = b.plusDays(1);
    }
    }
    
    
}