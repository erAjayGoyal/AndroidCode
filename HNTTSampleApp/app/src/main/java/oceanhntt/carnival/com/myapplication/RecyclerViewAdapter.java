package oceanhntt.carnival.com.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ajay.goyal on 9/14/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<Movie> listData;


    public RecyclerViewAdapter(Context ctx, List<Movie> movies){
        this.mContext = ctx;
        this.listData = movies;
    }

    public class ViewHolderWithTitle extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public ViewHolderWithTitle(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolderWithTitle(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Movie movie = listData.get(position);
        ViewHolderWithTitle viewHolder = (ViewHolderWithTitle) holder;
        viewHolder.title.setText(movie.getTitle());
        viewHolder.genre.setText(movie.getGenre());
        viewHolder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
