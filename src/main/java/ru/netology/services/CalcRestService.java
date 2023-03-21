package ru.netology.services;
public class CalcRestService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (money - expense) / 3;
                count++;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
