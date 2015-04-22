import java.util.Random;

public class sentence{
    public static String adjectives(int num){
        String[] adj = {"quick", "skinny", "slow", "fat", "muscular", "tiny", "mean", "ugly", "scary", "happy"};
        return adj[num];
    }
    public static String noun(int num){
        String[] noun = {"dog", "cat", "cow", "person", "fox", "computer", "rat", "woman", "man", "machine"};
        return noun[num];
    }
    public static String verbs(int num){
        String[] verb = {"passed","glided", "hated", "hurt", "helped", "assisted","destroyed","loved","worked","chased"};
        return verb[num];
    }
    
    public static void main(String[] args){
        Random randomGen = new Random();
        int randoms = randomGen.nextInt(10);
        String adj = adjectives(randoms);
        randoms = randomGen.nextInt(10);
        String noun = noun(randoms);
        randoms = randomGen.nextInt(10);
        String verb = verbs(randoms);
        randoms = randomGen.nextInt(10);
        String newAdj = adjectives(randoms);
        randoms = randomGen.nextInt(10);
        String newNoun = noun(randoms);
        
        System.out.println("The <" + adj + "> <" + noun + "> <" + verb + "> the <" + newAdj + "> <" + newNoun + ">");
    }
}