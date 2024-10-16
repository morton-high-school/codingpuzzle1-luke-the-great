import java.util.Scanner;
import java.io.File;

// welcome to your first coding puzzle of the course your second task and first keyword
//are located in the one hundred and twenty three characters after the tenth giraffe
public class Puzzle{
    public static void main(String[] args) throws Exception{
        File info = new File("puzzle.txt");
        Scanner reader = new Scanner(info);
        String text = reader.nextLine();
        String cutter = text;

        for(int i=0; i<10; i++){
            cutter = cutter.substring(cutter.indexOf("giraffe") + 7);
        }
        System.out.println(cutter);
        

    }
}
//armadillo your next task and keyword are located in the one hundred 
//and five characters after the longest string of the same consecutive character