package DataStructs.Arrays;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String > nameList = new java.util.ArrayList<String>();
        String[] names =  {"Ann","Bob","Carol"};

        //Add to arraylist
        for(int k =0 ; k<names.length;k++)
        nameList.add(names[k]);

        //dispaly namelist
        for(int k = 0;k<nameList.size();k++)
        System.out.println(nameList.get(k));
    }
}
