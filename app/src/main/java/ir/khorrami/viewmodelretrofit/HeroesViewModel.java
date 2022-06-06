package ir.khorrami.viewmodelretrofit;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HeroesViewModel extends ViewModel {

    private MutableLiveData<List<Hero>> heroList;

    public LiveData<List<Hero>> getHeros()
    {
        if(heroList == null) {
            heroList = new MutableLiveData<List<Hero>>();

            LoadHeros();
        }
        return heroList;
    }

    private void LoadHeros() {
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<Hero>> call = api.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                heroList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                //Toast.makeText(, "Error" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
