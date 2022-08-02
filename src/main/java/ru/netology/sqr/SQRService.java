package ru.netology.sqr;

public class SQRService {
    public int sortNumbers(int x, int y) {
        int i;
        int counter = 0;
        for (i = 10; i <= 99; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                counter++;
            }
        }
        return counter;
    }
}

