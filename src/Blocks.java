import java.util.Arrays;

public class Blocks {
    private String[] transcations;
    private int blockHash;
    private int perviousBlockHash;

    @Override
    public String toString() {
        return "Blocks{" +
                "transcations=" + Arrays.toString(transcations) +
                ", blockHash=" + blockHash +
                ", perviousBlockHash=" + perviousBlockHash +
                '}';
    }

    public Blocks(String[] transcations, int perviousBlockHash) {
        super();
        this.transcations = transcations;
        this.perviousBlockHash = perviousBlockHash;
        this.blockHash = Arrays.hashCode( new int[] {Arrays.hashCode(transcations), this.perviousBlockHash});
    }

    public String[] getTranscations() {
        return transcations;
    }

    public void setTranscations(String[] transcations) {
        this.transcations = transcations;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPerviousBlockHash() {
        return perviousBlockHash;
    }

    public void setPerviousBlockHash(int perviousBlockHash) {
        this.perviousBlockHash = perviousBlockHash;
    }
}
