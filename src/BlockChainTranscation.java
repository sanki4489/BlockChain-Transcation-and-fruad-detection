import jdk.nashorn.internal.ir.Block;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainTranscation {
    public static void main(String[] args){
        //hash function
        String statement1 = "This is hash function";
        int hashvalue = statement1.hashCode();
        
        System.out.println("Satement is:"+statement1+" and the hash value is:"+hashvalue);

        //hash the array
        String accounts[] = {"Sankalp","Priya"};
        String accounts2[] = {"Sankalp","Priya"};
        int hash1 = Arrays.hashCode(accounts);
        int hash2 = Arrays.hashCode(accounts2);
        System.out.println("array1 "+hash1+" array2 "+hash2);

        //Series of blocks in a chain
        //block 1
        ArrayList<Blocks> blockChain = new ArrayList<Blocks>();
        String[] initialValues = {"Sankalp have Rs5000","Priya has Rs10000"};
        Blocks firstBlock = new Blocks(initialValues,0);
        blockChain.add(firstBlock);
        System.out.println("The first block is "+ firstBlock.toString());
        System.out.println("The block chain is "+ blockChain.toString());
        //blockHash=1432364949 is the result

        //block2
        String[] sankalpdonates = {"Sankalp donate RS100 to kumar","sankalp donates RS200 to priya"};
        Blocks secondBlock = new Blocks(sankalpdonates,firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("The second block is "+ secondBlock.toString());
        System.out.println("The block chain is "+ blockChain.toString());
        //blockHash=-649019164 is the result

        //block 3
        String[] sankalpGets = {"Sankalp gets Rs500","sankalp gets Rs1000"};
        Blocks thirdBlock = new Blocks(sankalpGets, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("The third block is "+ thirdBlock.toString());
        System.out.println("The block chain is "+ blockChain.toString());
        //blockHash=-352882530 is the result.

        //block 4
        String[] priyaGets = {"Priya gets Rs500","priya gets Rs10"};
        Blocks fourthBlock = new Blocks(priyaGets, thirdBlock.getBlockHash());
        blockChain.add(fourthBlock);
        System.out.println("The fourth block is "+ fourthBlock.toString());
        System.out.println("The block chain is "+ blockChain.toString());
        //blockHash=-223715154 is the result.
    }
}
