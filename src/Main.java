import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City>arrayList=new ArrayList<>();
        arrayList.add(new City(312,"Bishkek","Kyrgyzstan"));
        arrayList.add(new City(495,"Moscow","Russia"));
        arrayList.add(new City(9711,"Abu-Dhabi","OAE"));
        TreeSet<City> treeSet=new TreeSet<>();
        for(City a:arrayList){
            if(a.getCode()%2!=0){
                treeSet.add(a);
            }
        }
        System.out.println(treeSet);
    }
}