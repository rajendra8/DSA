import java.util.*;

//GlobalLogic
public class Task {

    public static void test(){
        List <String>ls= new ArrayList(Arrays.asList("Home", "About", "Home", "Contact", "Services", "About"));
        //if we want to arrarange in order with no duplicate then we can use LinkedHashSet
        List<String>uniqueList=new ArrayList<>(new LinkedHashSet<>(ls));

        System.out.println("uniqueList" + uniqueList);
        Set<String> set=new HashSet<>(new LinkedHashSet<>(ls));
        System.out.println("Set :" + set);

        for (String s :ls) {
            set.add(s);
        }
        System.out.println(set);

    }

    public static void occurance(){
        String [] a={"Home", "About", "Home", "Contact", "Services", "About"};
        Map<String,Integer> map=new HashMap<>();

        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(map.get(a[i]))){
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        for(Map.Entry<String,Integer>entry :map.entrySet()){
          entry.getKey();
          entry.getValue();
            System.out.println( entry.getKey() +" : " +entry.getValue());
        }

    }

    public static void main(String[] args) {
        occurance();
        //test();
    }
}
