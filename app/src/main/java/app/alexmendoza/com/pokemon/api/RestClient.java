package app.alexmendoza.com.pokemon.api;

import app.alexmendoza.com.pokemon.modelo.AbilityFeed;
import app.alexmendoza.com.pokemon.modelo.PokemonFeed;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Admin on 21/06/2016.
 */
public interface RestClient {
@GET("pokemon")
Call<PokemonFeed> getData();
@GET("ability")
Call<AbilityFeed> getDataAbility();
}
