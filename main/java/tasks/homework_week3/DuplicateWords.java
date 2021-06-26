package main.java.tasks.homework_week3;

public class DuplicateWords {

    public void StringSentense (){


        String text = "my name is not valera, valera is my twin brother also my father was valera";
        String[] duplicateString = text.split(" ");
        for (int i = 0; i < duplicateString.length; i++) {
            if (duplicateString[i] != null) {
                for (int f = i + 1; f < duplicateString.length; f++) {
                    if (duplicateString[i].equals(duplicateString[f])) {
                        duplicateString[f] = duplicateString[i];
                        System.out.print(duplicateString[i] + ", ");
                    }
                }
            }
        }
    }
}
