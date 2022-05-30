package ru.vsu.cs.Gvozdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();

        System.out.println("Сколько чисел вывести?");
        int x = sc.nextInt();
        tree.insertNode(1);
        tree.insertNode(1);
        int fb = 1;
        int fb2 = 1;
        int fb3;

        for (int i = 3; i<=x; i++){ // Заполняем дерево числами Фиббаначи
            fb3 = fb + fb2;
            tree.insertNode(fb3);
            fb=fb2;
            fb2=fb3;
        }

        tree.printTree(); // Выводим дерево
    }
}
