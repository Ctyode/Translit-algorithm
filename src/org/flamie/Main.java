package org.flamie;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();

        ArrayList<Character> word = new ArrayList<>();

        for(Character i : text.toCharArray()) {
            word.add(0, i);
        }

        Collections.reverse(word);

        ArrayDeque<String> russianWord = new ArrayDeque<>();

        for(int i = 0; i < word.size(); i++) {
            switch (word.get(i)) {
                case ' ':
                    russianWord.addLast(" ");
                    break;
                case 'a':
                    russianWord.addLast("а");
                    break;
                case 'b':
                    russianWord.addLast("б");
                    break;
                case 'c':
                    if(i + 1 < word.size() && word.get(i + 1).equals('h')) {
                        russianWord.addLast("ч");
                        word.remove(i + 1);
                    } else {
                        russianWord.addLast("ц");
                    }
                    break;
                case 'd':
                    russianWord.addLast("д");
                    break;
                case 'e':
                    russianWord.addLast("е");
                    break;
                case 'f':
                    russianWord.addLast("ф");
                    break;
                case 'g':
                    russianWord.addLast("г");
                    break;
                case 'h':
                    russianWord.addLast("х");
                    break;
                case 'i':
                    russianWord.addLast("и");
                    break;
                case 'j':
                    if (i + 1 < word.size() && word.get(i + 1).equals('e')) {
                        russianWord.addLast("э");
                        word.remove(i + 1);
                    } else {
                        russianWord.addLast("й");
                    }
                    break;
                case 'k':
                    russianWord.addLast("к");
                    break;
                case 'l':
                    russianWord.addLast("л");
                    break;
                case 'm':
                    russianWord.addLast("м");
                    break;
                case 'n':
                    russianWord.addLast("н");
                    break;
                case 'o':
                    russianWord.addLast("о");
                    break;
                case 'p':
                    russianWord.addLast("п");
                    break;
                case 'q':
                    russianWord.addLast("к");
                    break;
                case 'r':
                    russianWord.addLast("р");
                    break;
                case 's':
                    if (i + 2 < word.size() && word.get(i + 1).equals('c') && word.get(i + 2).equals('h')) {
                        russianWord.addLast("щ");
                        word.remove(i + 1);
                        word.remove(i + 1);
                    } else if (i + 1 < word.size() && word.get(i + 1).equals('h')) {
                        russianWord.addLast("ш");
                        word.remove(i + 1);
                    } else {
                        russianWord.addLast("с");
                    }
                    break;
                case 't':
                    russianWord.addLast("т");
                    break;
                case 'u':
                    russianWord.addLast("у");
                    break;
                case 'v':
                    russianWord.addLast("в");
                    break;
                case 'w':
                    russianWord.addLast("в");
                    break;
                case 'x':
                    russianWord.addLast("х");
                    break;
                case 'y':
                    if (i + 1 < word.size() && word.get(i + 1).equals(' ')) {
                        russianWord.addLast("ы");
                        russianWord.addLast("й");
                        System.out.println("ый");
                    } else if (i + 1 < word.size() && word.get(i + 1).equals('a')) {
                        russianWord.addLast("я");
                        word.remove(i + 1);
                    } else if (i + 1 < word.size() && word.get(i + 1).equals('u')) {
                        russianWord.addLast("ю");
                        word.remove(i + 1);
                    } else if(i + 1 < word.size() && word.get(i + 1).equals('o')) {
                        russianWord.addLast("ё");
                        word.remove(i + 1);
                    } else {
                        russianWord.addLast("ы");
                    }
                    break;
                case 'z':
                    if (i + 1 < word.size() && word.get(i + 1).equals('h')) {
                        russianWord.addLast("ж");
                        word.remove(i + 1);
                    } else {
                        russianWord.addLast("з");
                    }
                    break;
                case '\'':
                    if(i + 1 < word.size() && word.get(i + 1).equals('e') || word.get(i + 1).equals('y')) {
                        russianWord.addLast("ъ");
                    } else {
                        russianWord.addLast("ь");
                    }
                    break;
                case ',':
                    russianWord.addLast(",");
                    break;
            }
        }

        String collect = String.join("", russianWord);
        System.out.println(collect);

    }

}