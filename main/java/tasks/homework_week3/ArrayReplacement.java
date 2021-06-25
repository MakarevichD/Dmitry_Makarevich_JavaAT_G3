package main.java.tasks.homework_week3;

public class ArrayReplacement {

    public void NumWithLetters() {

        String numInText = "Mama mila ramu 6 4asov, a potom pila 2 raza k0mpotik. ";
        String numReplacement = numInText.replaceAll("[^0-9]", "");
        String[] numArray = numReplacement.split("");


        for (String i : numArray) {
            System.out.println(i + " ");
        }

        System.out.println("Array of variables:");

        int[] arrayNumbers = new int[numArray.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(numArray[i]);
            System.out.print(arrayNumbers[i] + " ");
        }
    }

}
