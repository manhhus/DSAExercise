//package hw3_20001949_tranvanmanh_linkedlist;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class CountByLinkedList {
//
//    private void print(SimpleLinkedList<WordCount> list) {
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
//
//    private SimpleLinkedList<WordCount> input(Scanner sc) {
//
//        SimpleLinkedList<WordCount> list = new SimpleLinkedList<>();
//        String choice;
//        String[] str;
//        String url;
//
//        do {
//            System.out.println("Get input from keyboard(types C) or from file(types X): ");
//            choice = sc.next().toLowerCase();
//        } while (!choice.equals("c") && !choice.equals("x"));
//
//        sc.nextLine(); // swallows previous input
//
//        switch (choice) {
//            case "c" -> {
//                System.out.println("Enter the paragraph: ");
//                str = sc.nextLine().split(" ");
//                for (String word : str) {
//                    list.add(new WordCount(word.replaceAll("[-+.^:,?!~]", "").toLowerCase()));
//                }
//            }
//            case "x" -> {
//                boolean done = false;
//                while (!done) {
//                    System.out.println("Enter the URL: ");
//                    url = sc.nextLine(); // test URL: src/hw3/bai4/text.txt
//
//                    try (Scanner sc1 = new Scanner(new File(url))) {
//                        while (sc1.hasNext()) {
//                            list.add(new WordCount(sc1.next().replaceAll("[-+.^:,?!~]", "").toLowerCase()));
//                        }
//                        done = true;
//                    } catch (FileNotFoundException e) {
//                        System.out.println("File not found.");
//                    }
//                }
//            }
//            default -> throw new IllegalStateException("Unexpected value: " + choice);
//        }
//
//        return list;
//    }
//
//    public void run(Scanner sc) {
//
//        SimpleLinkedList<WordCount> listAll;
//        SimpleLinkedList<WordCount> distinctList = new SimpleLinkedList<>();
//
//        listAll = input(sc);
//
//        for (int i = 0; i < listAll.size(); i++) { // takes unique word and adds to distinctList
//            if (!distinctList.isContain(listAll.get(i))) {  // using isContain, as per requested
//                distinctList.add(listAll.get(i));
//            }
//        }
//
//        for (int distinct = 0; distinct < distinctList.size(); distinct++) {
//            for (int all = 0; all < listAll.size(); all++) {
//
//                if (distinctList.get(distinct).equals(listAll.get(all))) { // increase count by 1 each time a word reappears
//                    distinctList.get(distinct).increaseCount();
//                }
//            }
//        }
//
//        print(distinctList);
//    }
//}