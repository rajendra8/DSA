import org.testng.annotations.Test;

public class SRKAY {

    /**
     * FindLongestCommonPrefix
     * Input: [Array: ["flower", "floor", "flow", "flight"]]
     * Output: [String: "fl"]
     */


    @Test
    public void test(){
        String []in={"flower", "floor", "flow", "flight"};
        String prefix=in[0];
//        System.out.println(prefix.substring(0,in[3].length()));
//        System.out.println(prefix.substring(0,in[3].length()-1));
        for(int i=1;i<in.length;i++){

            while (in[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);

    }
}
