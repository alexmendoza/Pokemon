package app.alexmendoza.com.pokemon;

import java.util.List;

import app.alexmendoza.com.pokemon.modelo.PokemonFeed;
import app.alexmendoza.com.pokemon.modelo.Result;

/**
 * Created by Admin on 21/06/2016.
 */
public interface MainView {
    void notifyDataSetChanged(List<Result> pokemon);
}
