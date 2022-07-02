import java.util.Scanner;

public class HomeWork2Krasko {
    public static void main(String[] args) {

        //Домашняя работа №2. Студент Красько Денис. 02.07.2022г.

        //Integer15◦
        //. Дано трехзначное число. Вывести число, полученное при
        // перестановке цифр сотен и десятков исходного числа (например, 123 перейдет в
        //213).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*des+10*sot+ed;
        System.out.println("Результат: " + res);
         */

        //Integer16◦
        //. Дано трехзначное число. Вывести число, полученное при
        // перестановке цифр десятков и единиц исходного числа (например, 123 перейдет
        //в 132).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int L = in.nextInt();
        int sot = L/100;
        int ed = L%10;
        int des = (L / 10)%10;
        int res = 100*sot+10*ed+des;
        System.out.println("Результат: " + res);
         */

        //Integer17◦
        //. Дано целое число, большее 999. Используя одну операцию деления нацело
        // и одну операцию взятия остатка от деления, найти цифру,
        //соответствующую разряду сотен в записи этого числа.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число: ");
        int L = in.nextInt();
        int sot = (L / 100)%10;
        System.out.println("Результат: " + sot);
         */

        //Integer18◦
        //. Дано целое число, большее 999. Используя одну операцию деления нацело
        // и одну операцию взятия остатка от деления, найти цифру,
        //соответствующую разряду тысяч в записи этого числа.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число: ");
        int L = in.nextInt();
        int tis = (L / 1000);    // а зачем тут операция остатка от деления, что прописана в условии?)
        System.out.println("Результат: " + tis);
         */

        //Integer19◦
        //. С начала суток прошло N секунд (N — целое). Найти количество
        //полных минут, прошедших с начала суток.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во секунд, прошедших с начала суток: ");
        int L = in.nextInt();
        int tis = (L / 60);
        System.out.println("Количество полных минут: " + tis);
         */

        //Integer20◦
        //. С начала суток прошло N секунд (N — целое). Найти количество
        //полных часов, прошедших с начала суток
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во секунд, прошедших с начала суток: ");
        int L = in.nextInt();
        int tis = (L / 3600);
        System.out.println("Кол-во полных часов: " + tis);
         */

        //Integer21◦
        //. С начала суток прошло N секунд (N — целое). Найти количество
        //секунд, прошедших с начала последней минуты.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во секунд, прошедших с начала суток: ");
        int L = in.nextInt();
        int tis = L%60;
        System.out.println("количество секунд, прошедших с начала последней минуты: " + tis);
         */

        //Integer22◦
        //. С начала суток прошло N секунд (N — целое). Найти количество
        //секунд, прошедших с начала последнего часа.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во секунд, прошедших с начала суток: ");
        int L = in.nextInt();
        int tis = L%3600;
        System.out.println("количество секунд, прошедших с начала последнего часа: " + tis);
         */

        //Integer23◦
        //. С начала суток прошло N секунд (N — целое). Найти количество
        //полных минут, прошедших с начала последнего часа.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во секунд, прошедших с начала суток: ");
        int L = in.nextInt();
        int tis = (L/60)%60;
        System.out.println("количество полных минут, прошедших с начала последнего часа: " + tis);
         */

        //Integer24◦
        //. Дни недели пронумерованы следующим образом: 0 — воскресенье,
        //1 — понедельник, 2 — вторник, . . . , 6 — суббота. Дано целое число K,
        //лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
        //года, если известно, что в этом году 1 января было понедельником.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день года от 1 до 365: ");
        int L = in.nextInt();
        int tis = L % 7;
        if (tis > 5) {
            System.out.println("День недели - суббота");
        } else {
            if (tis > 4) {
                System.out.println("День недели - пятница");
            } else {
                if (tis > 3) {
                    System.out.println("День недели - четверг");
                } else {
                    if (tis > 2) {
                        System.out.println("День недели - среда");
                    } else {
                        if (tis > 1) {
                            System.out.println("День недели - вторник");
                        } else {
                            if (tis > 0) {
                                System.out.println("День недели - понедельник");
                            } else {
                                System.out.println("День недели - воскресенье");
                            }
                        }
                    }
                }
            }
        }
         */

        //Integer25◦
        //. Дни недели пронумерованы следующим образом: 0 — воскресенье,
        //1 — понедельник, 2 — вторник, . . . , 6 — суббота. Дано целое число K,
        //лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
        //года, если известно, что в этом году 1 января было четвергом.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день года от 1 до 365: ");
        int L = in.nextInt();
        int tis = L % 7;
        if (tis > 5) {
            System.out.println("День недели - вторник");
        } else {
            if (tis > 4) {
                System.out.println("День недели - понедельник");
            } else {
                if (tis > 3) {
                    System.out.println("День недели - воскресенье");
                } else {
                    if (tis > 2) {
                        System.out.println("День недели - суббота");
                    } else {
                        if (tis > 1) {
                            System.out.println("День недели - пятница");
                        } else {
                            if (tis > 0) {
                                System.out.println("День недели - четверг");
                            } else {
                                System.out.println("День недели - среда");
                            }
                        }
                    }
                }
            }
        }
         */

        //Integer26◦
        //. Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, . . . ,
        // 6 — суббота, 7 — воскресенье. Дано целое число K,
        //лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
        //года, если известно, что в этом году 1 января было вторником.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день года от 1 до 365: ");
        int L = in.nextInt();
        int tis = L % 7;
        if (tis > 5) {
            System.out.println("День недели - воскресенье");
        } else {
            if (tis > 4) {
                System.out.println("День недели - суббота");
            } else {
                if (tis > 3) {
                    System.out.println("День недели - пятница");
                } else {
                    if (tis > 2) {
                        System.out.println("День недели - четверг");
                    } else {
                        if (tis > 1) {
                            System.out.println("День недели - среда");
                        } else {
                            if (tis > 0) {
                                System.out.println("День недели - вторник");
                            } else {
                                System.out.println("День недели - понедельник");
                            }
                        }
                    }
                }
            }
        }
         */

        //Integer27◦
        //. Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, . . . ,
        // 6 — суббота, 7 — воскресенье. Дано целое число K,
        //лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня
        //года, если известно, что в этом году 1 января было субботой.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день года от 1 до 365: ");
        int L = in.nextInt();
        int tis = L % 7;
        if (tis > 5) {
            System.out.println("День недели - четверг");
        } else {
            if (tis > 4) {
                System.out.println("День недели - среда");
            } else {
                if (tis > 3) {
                    System.out.println("День недели - вторник");
                } else {
                    if (tis > 2) {
                        System.out.println("День недели - понедельник");
                    } else {
                        if (tis > 1) {
                            System.out.println("День недели - воскресенье");
                        } else {
                            if (tis > 0) {
                                System.out.println("День недели - суббота");
                            } else {
                                System.out.println("День недели - пятница");
                            }
                        }
                    }
                }
            }
        }
         */
        //Integer28◦
        //. Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, . . . , 6 — суббота,
        // 7 — воскресенье. Дано целое число K,
        //лежащее в диапазоне 1–365, и целое число N, лежащее в диапазоне 1–7.
        //Определить номер дня недели для K-го дня года, если известно, что в
        //этом году 1 января было днем недели с номером N.

        // Не знаю как решить Integer 28, 29 и 30. Хотелось бы разобрать их на занятии или после него
        // Думаю что и задания Integer 24-27 можно решить каким-то другим, более лёгким способом. Хотелось бы узнать его

        //Блок-схемы нарисовал через app.diagrams.net и добавил их в папку на GitHub, но что-то я там похоже лишнего понасахранял)

    }
}

