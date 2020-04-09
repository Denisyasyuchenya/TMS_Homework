package lesson8hwT26;

import java.util.Scanner;

public class Task26YasyuchenyaRunner {
        public static void main(String[] args) {

            System.out.print("Какой телевизор вы хотите приобрести?\n" +
                    "Выберите верный вариант ответа:\n" +
                    "1) Простой ствренький ТВ;\n" +
                    "2) Современный SmartTV;\n" +
                    "3) Нихатю.");
            Scanner sc1 = new Scanner(System.in);
            int x = sc1.nextInt();
            if ( x==1) {
                System.out.println("Вы ввели 1");
                Task26APP tv1 = new Task26YasTV(50, "ОАО Витязь (BLR)", "Витязь РПРТВ50", 60);
                tv1.getComeFrom();
                tv1.powerOn();
                System.out.println(tv1);}
            else if (x == 2) {
                    System.out.println("Вы ввели 2");
                    Task26APP tv2 = new Task26YasSMARTTV(100, "SAMSUNG (SK)", "SAMSUNG STV-500", 600, "SmatTV");
                    tv2.getComeFrom();
                    tv2.powerOn();
                    System.out.println(tv2);
                }
            else if (x == 3) {
                System.out.println("█▌▒▒▓░░░░▒▒▒░░░░░▒▓▓██\n" +
                        "██▓═▄▓░░▒▒▓▓▓▄▄░░▒▓▓██\n" +
                        "██▌░▄█░░▒▓▓▓▄═╤▄▓▒████\n" +
                        "██▒─▀▀░▒║▓▓▓╣░██▓▄████\n" +
                        "█▌░▒▓▒░▒▓▓▓▌░─═▄▀▒▒▀▓█\n" +
                        "█▌░░▒░░║▓▓▓▒░░░░▒▒▒▐▓█\n" +
                        "██░░░░░▓▓▓▓▒░░░░▒▒▒▓██\n" +
                        "██░░░░╚▒═▓▓▌░░░░▒▒▒▓██\n" +
                        "██▌░░░░░▓▓▒▒░░░▒▒▒▓▓██\n" +
                        "███▌░▓▓▄▄▒▒▒░░▒▒▒▐▓▓▓▓\n" +
                        "████░▐▀╧╧▀▀▄▒▒▒▒▄▓▓▓▓▒\n" +
                        "████▌░▀▀▀▀▓▓▒▒▄▓▓▓▓▓▒▒\n" +
                        "Как Жаль, что Вы наконец-то уходите!");
            }else {
                    System.out.println("У нас нет)");
                }
                sc1.close();
            }
        }

