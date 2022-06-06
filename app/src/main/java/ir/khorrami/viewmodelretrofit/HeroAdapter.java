package ir.khorrami.viewmodelretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {

    Context context;
    List<Hero> heroList;

    public HeroAdapter(Context context, List<Hero> heroList) {
        this.context = context;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hero, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        holder.textViewHero.setText(heroList.get(position).getName());
        Picasso.get().load(heroList.get(position).getImageUrl()).into(holder.imageViewHero);
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewHero;
        TextView textViewHero;

        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewHero = itemView.findViewById(R.id.imageView_Hero);
            textViewHero = itemView.findViewById(R.id.textView_Hero);
        }
    }
}
