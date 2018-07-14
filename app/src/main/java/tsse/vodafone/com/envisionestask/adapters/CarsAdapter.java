package tsse.vodafone.com.envisionestask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import tsse.vodafone.com.envisionestask.R;
import tsse.vodafone.com.envisionestask.models.Car;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.MovieViewHolder> {

    private List<Car> cars;
    private int rowLayout;
    private Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        ImageView carImage;


        public MovieViewHolder(View v) {
            super(v);
            //moviesLayout = (RelativeLayout) v.findViewById(R.id.cars_layout);
            movieTitle = (TextView) v.findViewById(R.id.primary_text);
            data = (TextView) v.findViewById(R.id.secondary_header);
            movieDescription = (TextView) v.findViewById(R.id.price);
            rating = (TextView) v.findViewById(R.id.val);
            carImage = (ImageView) v.findViewById(R.id.car_photo);
        }
    }

    public CarsAdapter(List<Car> movies, int rowLayout, Context context) {
        this.cars = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public CarsAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(cars.get(position).getBodyEn());
        holder.data.setText(cars.get(position).getMakeEn());
        holder.movieDescription.setText(cars.get(position).getCarID()+"");
        holder.rating.setText(cars.get(position).getAuctionInfo().getIVinNumber());
        String url = cars.get(position).getImage();
        url = url.replace("[w]","0").replace("[h]","0");

        Picasso.get()
                .load(url)
                .resize(50, 50)
                .centerCrop()
                .into(holder.carImage);
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
