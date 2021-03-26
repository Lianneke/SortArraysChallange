import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] myIntegers) {
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);

        }
    }

    public static int[] sortIntegers(int[] myIntegers) {
        //Onderstaande code maakt een copy van de array
        int[] sortedArray = new int[myIntegers.length];
            for (int i = 0; i < myIntegers.length; i++) {
                sortedArray[i] = myIntegers[i];
            }
            //de copy had ook als volgt kunnen gebeuren:
        //int[] sortedarray = Arrays.copyOf(myIntegers, myIntegers.length);
        
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                //element 0 50
                //element 1 160
                //element 2 40
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]) {
                        //als positie 0 kleiner is dan positie 1
                        temp = sortedArray[i];
                        //er wordt dan een tijdelijke variabele aan deze positie gehangen
                        sortedArray[i] = sortedArray[i + 1];
                        //er wordt een positie bij opgeteld zodat de plaatsen van plek wisselen
                        sortedArray[i + 1] = temp;
                        flag = true;
                        //Hij gaat nu opnieuw door de loep heen en controleert positie 1 tov positie 2
                        //zodra hij de loop niet meer doorloopt blijft flag false, hij gaat dan uit de loop

                    }
                }
            }
            return sortedArray;
        }

    }

