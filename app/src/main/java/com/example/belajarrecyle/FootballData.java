package com.example.belajarrecyle;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Aerox","Hybride","Nmax", "pcx","Pespa","BEat","Sprint","Tmax","vario","xmax"};
    private static int[] thumbnail = new int[]{R.drawable.aerox,R.drawable.hybride,R.drawable.nmax,R.drawable.pcx,
            R.drawable.pespa,R.drawable.putih, R.drawable.sprint,R.drawable.tmax,R.drawable.vario,R.drawable.xmax};
    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            list.add(footballModel);
        }
        return list;
    }
}
