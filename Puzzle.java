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

        // for(int i=0; i<10; i++){
        //     cutter = cutter.substring(cutter.indexOf("giraffe") + 7);
        // }
        // System.out.println(cutter);
        



    String palen = text;
        int longest = 0;
        int bestindex =0;
        boolean flag = true;
        for(int i=0; i<87300; i++){
            int skib = 1;
            for(int j=1; flag; j++){
                if(i-j<0 || i+j>=palen.length()){
                    flag = false;
                }else{
                    if(palen.substring(i-j,i-j+1).equals(palen.substring(i+j, i+j+1))){
                        skib++;
                        skib++;
                    }else{
                        flag = false;
                    }
                }
            }   
            flag = true;
            int sigma = 0;
            if(i+1<palen.length() && palen.substring(i,i+1).equals(palen.substring(i+1,i+2))){
                sigma = 2;
                for(int j=1; flag; j++){
                    if(i-j<0 || i+j+1>=palen.length()){
                        flag = false;
                    }else{
                        if(palen.substring(i-j,i-j+1).equals(palen.substring(i+j+1, i+j+2))){
                        sigma++;
                        }else{
                        flag = false;
                        }
                    }
                } 
                flag = true;
            }
            if(skib>longest){
                longest = skib;
                bestindex = i-skib/2;
            }
            if(longest<sigma){
                longest = sigma;
                bestindex = i-longest/2+1;
            }
            // System.out.println("Current Index: " + i);
            // System.out.println("Current Best Length: " + longest);
            // System.out.println("");
        }
        System.out.println(longest);
        System.out.println(bestindex);
        System.out.println(palen.substring(bestindex, bestindex+105));

        
        // int count = 0;
        // int highestcount = 0;
        // String mostVowels = "";
        // String vowels = text;
        // for(int i = 0; i<vowels.length()-30; i++){
        //     count = 0;
        //     for(int j = 0; j<30; j++){
        //         if(vowels.substring(i+j, i+j+1).equals("a") || vowels.substring(i+j, i+j+1).equals("o") || vowels.substring(i+j, i+j+1).equals("u") || vowels.substring(i+j, i+j+1).equals("i") || vowels.substring(i+j, i+j+1).equals("e") ){
        //             count++;
        //         }
        //     }
        //     if(count>highestcount){
        //         highestcount=count;
        //     }
        //     if(highestcount == count){
        //         mostVowels = vowels.substring(i+29,i+109);
        //     }
        // }
        // System.out.println(mostVowels);

        // String palen = text;
        // String rever = "";
        // String first = "";
        // String gyatt = "";
        // for(int i=0; i<palen.length()-11; i++){
            
        //     first = palen.substring(i,i+10);
        //     for(int j=0; j<first.length();j++){
        //         rever = text.substring(j,j+1) + rever;
        //     }
        //     if(first.equals(rever)){
        //         gyatt = first;
                
        //     }else{
        //         rever = "";
        //     }
        //     System.out.println(i); 
        // }
        // System.out.println(gyatt);
}
}
//armadillo your next task and keyword are located in the one hundred 
//and five characters after the longest string of the same consecutive character

//penguin your next task and keyword are located in the eighty characters 
//after the string of length thirty with the most vowels

//ostrich your final keyword is located in the six characters after a palindrome of length eleven

// badger