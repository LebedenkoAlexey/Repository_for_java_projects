package lebedenko.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    private String firstText;
    private String secondText;
    private Scanner in = new Scanner (System.in);
    private boolean notExit = true;

    public Scanner getIn() {
        return in;
    }

    public boolean isNotExit() {
        return notExit;
    }

    public void setNotExit(boolean notExit) {
        this.notExit = notExit;
    }

    public void menuOperation() {
        this.printMenu ();
        this.menuSelection();
    }

    private void printMenu() {
        System.out.println ("---------------------------");
        System.out.println ("1. Ввести первую строку");
        System.out.println ("2. Ввести вторую строку");
        System.out.println ("3. Просмотреть строки");
        System.out.println ("4. Получить длину строк");
        System.out.println ("5. Сравнить 2 строки без учета регистра");
        System.out.println ("6. Создать новую строку с помощью конструктора и занести ее в пул литералов");
        System.out.println ("7. Получить из строки массив символов");
        System.out.println ("8. Получить из строки массив байтов");
        System.out.println ("9. Привести строку к верхнему регистру");
        System.out.println ("10. Найти первую позицию символа \"а\" в строке");
        System.out.println ("11. Найти последнюю позицию символа \"а\" в строке");
        System.out.println ("12. Проверить содержит-ли строка слово \"Sun\"");
        System.out.println ("13. Проверить оканчивается-ли строка на \"Oracle\"");
        System.out.println ("14. Проверить начинается-ли строка на \"Java\"");
        System.out.println ("15. Заменить все символы \"а\" в строке на символ \"о\"");
        System.out.println ("16. Получить подстроку с 44 символа по 90 символ");
        System.out.println ("17. Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)");
        System.out.println ("18. Поменять последовательность символов в строке на обратную.");
        System.out.println ("0. Выход");
    }

    private void menuSelection() {
        this.printMenu ();
        System.out.println ("Выберите: ");
        while (isNotExit()) {
            String str = getIn ().nextLine ();
            if ("1".equals (str)) {
                isFirstText ();
                this.printMenu ();
            } else if ("2".equals (str)) {
                isSecondText ();
                this.printMenu ();
            } else if ("3".equals (str)) {
                isFirstOrSecondText ();
                getText ();
                this.printMenu ();
            } else if ("4".equals (str)) {
                isFirstOrSecondText ();
                length ();
                this.printMenu ();
            } else if ("5".equals (str)) {
                isFirstText ();
                equalsIgnoreCase ();
                this.printMenu ();
            } else if ("6".equals (str)) {
                intern ();
                this.printMenu ();
            } else if ("7".equals (str)) {
                isFirstText ();
                toCharArray ();
                this.printMenu ();
            } else if ("8".equals (str)) {
                isFirstText ();
                getBytes ();
                this.printMenu ();
            } else if ("9".equals (str)) {
                isFirstText ();
                toUpperCase ();
                this.printMenu ();
            } else if ("10".equals (str)) {
                isFirstText ();
                indexOf ();
                this.printMenu ();
            } else if ("11".equals (str)) {
                isFirstText ();
                lastIndexOf ();
                this.printMenu ();
            } else if ("12".equals (str)) {
                isFirstText ();
                contains ();
                this.printMenu ();
            } else if ("13".equals (str)) {
                isFirstText ();
                endsWith ();
                this.printMenu ();
            } else if ("14".equals (str)) {
                isFirstText ();
                startsWith ();
                this.printMenu ();
            } else if ("15".equals (str)) {
                isFirstText ();
                replace ();
                this.printMenu ();
            } else if ("16".equals (str)) {
                isFirstText ();
                subSequence ();
                this.printMenu ();
            } else if ("17".equals (str)) {
                isFirstText ();
                split ();
                this.printMenu ();
            } else if ("18".equals (str)) {
                isFirstText ();
                reverse ();
                this.printMenu ();
            } else if ("0".equals (str)) {
                setNotExit(false);
            } else {
                System.out.println ("Неправильно! Еще раз:");
            }
        }
    }

    private void reverse() {
        System.out.println (new StringBuffer (this.getFirstText ()).reverse ());
    }

    private void split() {
        System.out.println (Arrays.toString (this.getFirstText ().split (" ")));
    }

    private void subSequence() {
        System.out.println (this.getFirstText ().subSequence (43, 89));
    }

    private void replace() {
        System.out.println (this.getFirstText ().replace ('a', 'o'));
    }

    private void startsWith() {
        System.out.println ("Начинается-ли первая строка на \"Java\"" + this.getFirstText ().startsWith ("Java"));
    }

    private void endsWith() {
        System.out.println ("Оканчивается-ли первая строка на \"Oracle\"" + this.getFirstText ().endsWith ("Oracle"));
    }

    private void contains() {
        System.out.println ("Содержит первая строка слово\"Sun\"? " + this.getFirstText ().contains ("Sun"));
    }

    private void lastIndexOf() {
        System.out.println ("Первая позиция символа \"а\" в строке = " + this.getFirstText ().lastIndexOf ('a'));
    }

    private void indexOf() {
        System.out.println ("Первая позиция символа \"а\" в строке = " + this.getFirstText ().indexOf ('a'));
    }

    private void toUpperCase() {
        String ThirdStr = this.getFirstText ().toUpperCase ();
        System.out.println ("верхний регистр первой строки: " + ThirdStr);
    }

    private void getBytes() {
        byte[] arr2 = this.getFirstText ().getBytes ();
        System.out.println (Arrays.toString (arr2));
    }

    private void toCharArray() {
        char[] arr1 = this.getFirstText ().toCharArray ();
        System.out.println (Arrays.toString (arr1));
    }

    private void intern() {
        String ThirdStr = new String ("Sun Oracle Java");
        ThirdStr = ThirdStr.intern ();
        System.out.println (ThirdStr);
    }

    private void equalsIgnoreCase() {
        System.out.println ("Первая строка равна Второй без учета регистра ? " + this.getFirstText ().equalsIgnoreCase (this.getSecondText ()));
    }

    private void length() {
        System.out.println ("Длина первой строки = " + this.getFirstText ().length ());
        System.out.println ("Длина второй строки = " + this.getSecondText ().length ());
    }

    private void getText() {
        System.out.println ("1-ая строка: ");
        System.out.print (this.getFirstText ());
        System.out.println ("2-ая строка:");
        System.out.print (this.getSecondText ());
    }

    private String getFirstText() {
        return this.firstText;
    }

    private String getSecondText() {
        return this.secondText;
    }

    private void isFirstOrSecondText () {
        if ((this.getFirstText()=="") || (this.getSecondText()=="") || (this.getFirstText() == null) || (this.getSecondText() == null)){
            isFirstText();
            isSecondText ();

        }
    }

    private void isFirstText () {
        if ((this.getFirstText () == "") || (this.getFirstText () == null)){
            System.out.println ("Текст должен содержать что-нибудь. Введите:");
            String str1 = getIn ().nextLine();
            System.out.println (str1);
            this.setFirstText (str1);
        }
    }

    void isSecondText () {
        if ((this.getSecondText () == "") || (this.getSecondText () == null)){
            System.out.println ("Второй фрагмент текста тоже должен содержать что-нибудь. Введите:");
            String str2 =getIn ().nextLine();
            System.out.println (str2);
            this.setSecondText(str2);
        }
    }

    private void setFirstText(String text) {
        this.firstText = text;
    }

    private void setSecondText(String text) {
        this.secondText = text;
    }
}
