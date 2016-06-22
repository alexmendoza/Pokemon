package app.alexmendoza.com.pokemon;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;

import app.alexmendoza.com.pokemon.modelo.Result;
/**
 * Created by Admin on 21/06/2016.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.PokemonViewHolder> {
    private List<Result> list;
    private Context context;
    private MainView view;

    public MainAdapter(Context context, MainView view) {
        this.list = new ArrayList<>();
        this.context = context;
        this.view = view;
    }

    public void swap(List<Result> newList) {
        list.clear();
        list.addAll(newList);
        notifyDataSetChanged();
    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PokemonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_pokemon_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, int position) {
        final Result pokemon = list.get(position);
        holder.tvName.setText(pokemon.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public static class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.Tv_name);
        }
    }




}

