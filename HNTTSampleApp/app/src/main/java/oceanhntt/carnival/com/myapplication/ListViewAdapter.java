package oceanhntt.carnival.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ajay.goyal on 9/14/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<Movie> listData;


    public ListViewAdapter(Context ctx, List<Movie> movies){
        this.mContext = ctx;
        this.listData = movies;
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Movie movie = listData.get(position);
        viewHolder.title.setText(movie.getTitle());
        viewHolder.genre.setText(movie.getGenre());
        viewHolder.year.setText(movie.getYear());

        return convertView;

    }

    class ViewHolder {

        public TextView title, year, genre;

        ViewHolder(View view) {

            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);

        }
    }
}
