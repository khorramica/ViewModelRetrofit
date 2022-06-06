package ir.khorrami.viewmodelretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewHero;
    HeroAdapter adapter;
    List<Hero> heroList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHero = findViewById(R.id.recyclerView_Hero);
        recyclerViewHero.setHasFixedSize(true);
        recyclerViewHero.setLayoutManager(new LinearLayoutManager(this));


        HeroesViewModel model =new ViewModelProvider(this).get(HeroesViewModel.class);
        model.getHeros().observe(this, new Observer<List<Hero>>() {
            @Override
            public void onChanged(List<Hero> heroes) {
                adapter = new HeroAdapter(MainActivity.this,heroes);
                recyclerViewHero.setAdapter(adapter);
            }
        });

    }
}