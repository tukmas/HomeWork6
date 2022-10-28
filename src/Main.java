public class Main {
    public static void main(String[] args) {
// Домащнее задание №1
        System.out.println("Домащнее задание №1");
// Задание 1
        System.out.println("Задание 1");
for (int i = 0; i < 10; i++){
    System.out.println(i);}
// Задание 2
        System.out.println("Задание 2");
for (int u = 10; u > 0; u--){
    System.out.println(u);}
// Задание 3
        System.out.println("Задание 3");
for (int f = 0; f < 17; f++){
    if (f % 2 == 0)
    System.out.println(f);}
// Задание 4
        System.out.println("Задание 4");
for (int t = 10; t > -10; t--){
    System.out.println(t);}
// Домащнее задание №2
        System.out.println("Домащнее задание №2");
// Задание 1
    System.out.println("Задание 1");
    for (int r = 1904; r < 2096; r = r + 4){
        System.out.println(r + " год является високосным");}
// Задание 2
    System.out.println("Задание 2");
    for (int k = 7; k <= 98; k = k + 7){
        System.out.println(k);}
// Задание 3
    System.out.println("Задание 3");
    for (int j = 1; j <= 512; j = j *2){
        System.out.println(j);}
// Домащнее задание №3
        System.out.println("Домащнее задание №3");
// Задание 1
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
for (int s = 1; s <= 12; s++){
        total = total + salary;
        System.out.println("Месяц " + s + " сумма накоплений равна " + total +  "рублей");}
// Задание 2
        System.out.println("Задание 2");
int salary1 = 29000;
int total1 = 0;
for (int s = 1; s <= 12; s++){
        total1 = total1 + total1/100;
        total1 = total1 + salary1;
        System.out.println("Месяц " + s + " сумма накоплений равна " + total1 +  "рублей");}
    }
}