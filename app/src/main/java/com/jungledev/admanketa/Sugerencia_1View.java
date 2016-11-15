package com.jungledev.admanketa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;


/**
 * Created by diego on 21/10/16.
 */

/**
 * Created by diego on 12/08/16.
 */
public class Sugerencia_1View extends  RecyclerView.Adapter<Sugerencia_1View.ViewHolder>  {

    private List<String> posts;


    public Sugerencia_1View(List<String> contenidos) {
        this.posts =  contenidos;

    }



    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }

    @Override
    public Sugerencia_1View.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        // - get element from your dataset at this position
        holder.txtSugerencia1.setText(posts.get(position).toString());
    }

    @Override
    public int getItemCount() {
        // return  0;
        //posts  != null ? posts.size() : 0;
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public final CardView cv;
        private TextView txtSugerencia1;


        //public View mView;
        public ViewHolder(View v) {
            super(v);
            cv = (CardView) v.findViewById(R.id.card_view);
            txtSugerencia1 = (TextView) v.findViewById(R.id.txtSugerencia1);
            //mView = v;
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
