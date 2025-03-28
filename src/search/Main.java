package search;
//test
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int numberOfPeople=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter all people:");
        String[] peopleArray= new String[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            peopleArray[i]=sc.nextLine();
        }

        System.out.println("Enter the number of search queries:");
        int numberOfSertchQueries=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfSertchQueries; i++)
        {
            System.out.println("Enter data to search people:");
            String data=sc.nextLine();

            boolean h=false;

            for (int j = 0; j < numberOfPeople; j++)
            {
                if (peopleArray[j].toLowerCase().contains(data.toLowerCase())){
                    System.out.println("Found people:");
                    System.out.println(peopleArray[j]);
                    h=true;
                }
            }

            if (!h){
                System.out.println("No matching people found.");
            }

        }

    }
}