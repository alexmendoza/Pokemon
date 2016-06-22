package app.alexmendoza.com.pokemon;

import android.util.Log;

import app.alexmendoza.com.pokemon.api.RestClient;
import app.alexmendoza.com.pokemon.api.RetrofitUtils;
import app.alexmendoza.com.pokemon.modelo.PokemonFeed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Admin on 21/06/2016.
 */
public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView mainView) {
        this.view = mainView;
    }

    public void getData() {
        RestClient restClient = RetrofitUtils.getInstance().create(RestClient.class);
        Call<PokemonFeed> call = restClient.getData();
        call.enqueue(new Callback<PokemonFeed>() {
            @Override
            public void onResponse(Call<PokemonFeed> call, Response<PokemonFeed> response) {
                switch (response.code()) {
                    case 200:
                        PokemonFeed data = response.body();
                        view.notifyDataSetChanged(data.getResults());
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<PokemonFeed> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }
}
