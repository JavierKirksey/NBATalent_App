package com.example.jellybean.nbatalent;
//Created By Javier Kirksey on Dec. 4th, 2016

import android.widget.Filter;

import java.util.ArrayList;


public class CustomFilter extends Filter{

    NBA_Adapter adapter;
    ArrayList<Player> filterList;

    public CustomFilter(ArrayList<Player> filterList,NBA_Adapter adapter) {
        this.adapter=adapter;
        this.filterList=filterList;

    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results=new FilterResults();

        if(constraint != null && constraint.length() > 0){
            constraint=constraint.toString().toUpperCase();

            //Storing filtered player into our arraylist
            ArrayList<Player> filteredPlayers=new ArrayList<>();

            for (int i=0;i<filterList.size();i++) {
                if(filterList.get(i).getName().toUpperCase().contains(constraint)) {
                    //Here we are adding each individual player to our filter list
                    filteredPlayers.add(filterList.get(i));
                }
            }
            results.count=filteredPlayers.size();
            results.values=filteredPlayers;
        }else {
            results.count=filterList.size();
            results.values=filterList;

        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.players= (ArrayList<Player>) results.values;
        adapter.notifyDataSetChanged();
    }
}