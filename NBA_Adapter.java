package com.example.jellybean.nbatalent;
//Created By Javier Kirksey on Dec. 4th, 2016

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;



public class NBA_Adapter extends RecyclerView.Adapter<NBA_Holder> implements Filterable{

    Context c;
    ArrayList<Player> players,filterList;
    CustomFilter filter;


    public NBA_Adapter(Context ctx, ArrayList<Player> players) {
        this.c=ctx;
        this.players=players;
        this.filterList=players;
    }


    @Override
    public NBA_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        //HOLDER
        NBA_Holder holder=new NBA_Holder(v);

        return holder;
    }

    //Data is Bound to Views
    @Override
    public void onBindViewHolder(NBA_Holder holder, final int position) {

        //Here were are Binding the Data.
        holder.posTxt.setText(players.get(position).getDesc());
        holder.nameTxt.setText(players.get(position).getName());
        holder.img.setImageResource(players.get(position).getImg());


       //On UserClick, we will direct them to a new activity displaying the individual player.
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int description) {
                //Intent Obj
                Intent i = new Intent(c, NBA_DetailActivity.class);

                //Add Data to our Intent
                i.putExtra("Description", players.get(position).getDesc());
                i.putExtra("Name", players.get(position).getName());
                i.putExtra("Image", players.get(position).getImg());

                //Start Detail Activity
                c.startActivity(i);
            }
        });

    }

    //Here we are getting the total number of Players.
    @Override
    public int getItemCount() {
        return players.size();
    }

    @Override
    public Filter getFilter() {
        if(filter==null) {
            filter=new CustomFilter(filterList,this);
        }

        return filter;
    }
}