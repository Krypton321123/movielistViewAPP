package com.learning.movielistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class movieAdapter extends BaseAdapter {
    private Context context;
    private List<movie> movieList;

    public movieAdapter(Context context, List<movie> movieList){
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int i) {
        return movieList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item, viewGroup);
            holder = new ViewHolder();
            holder.title = convertView.findViewById(R.id.title);
            holder.genre = convertView.findViewById(R.id.genre);
            holder.releaseYear = convertView.findViewById(R.id.year);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        movie Movie = movieList.get(i);
        holder.title.setText(Movie.gettitle()); //sets the title to the title of the movie object
        holder.genre.setText(Movie.getgenre()); // "
        holder.releaseYear.setText(Movie.getreleaseYear()); // "
        return convertView;
    }

    static class ViewHolder{
        TextView title;
        TextView genre;
        TextView releaseYear;
    }
}
