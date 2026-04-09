package java_project;

public class SimpleArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 45;
        numbers[1] = 6;
        numbers[2] = 4;
        numbers[3] = 145;
        numbers[4] = 445;

        int arraySize = numbers.length;

        /*for (int index = 0; index < arraySize; index++) {
            int number = numbers[index];
            System.out.println(number);
        }*/
        
        for (int number : numbers) {
        	System.out.println(number);
        }
        
        System.out.println("====================================================");
		
		String[] singers= {"Arijit Singh","Shreya Ghoshal","Atif Aslam","Jubin Nautiyal","Sonu Nigam","Shankar Mahadevan"};
		
		//Enhance for loop
		for(String singer : singers) {
			System.out.println(singer.toUpperCase());
		}
    }
}