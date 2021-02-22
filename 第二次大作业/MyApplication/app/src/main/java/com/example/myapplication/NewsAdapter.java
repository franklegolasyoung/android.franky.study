package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<News> aNewsList;

    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }
    //点击事件响应

    static class ViewHolder extends RecyclerView.ViewHolder {
        View newsView;
        ImageView newsImage;
        TextView newsName;
        TextView newsTime;
        TextView newsFrom;
        public ViewHolder(View view) {
            super(view);
            newsView = view;
            newsImage = view.findViewById(R.id.news_image);
            newsName = view.findViewById(R.id.news_name);
            newsTime = view.findViewById(R.id.news_time);
            newsFrom = view.findViewById(R.id.news_from);
        }//对应
    }
    public NewsAdapter(List<News> NewsList) {
        aNewsList = NewsList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.
                news_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        News news = aNewsList.get(position);
        holder.newsImage.setImageResource(news.getImageId());
        holder.newsName.setText(news.getName());
        holder.newsTime.setText(news.getTimeA());
        holder.newsFrom.setText(news.getFrom());//将其都显示出来
        holder.newsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                mOnItemClickListener.onItemClick(v, position);
                //News news = aNewsList.get(position);
                //Toast.makeText(v.getContext(), "You clicked " + news.getName(),
                //        Toast.LENGTH_SHORT).show();
                //试验点击效果
            }
        });
    }
    @Override
    public int getItemCount() {
        return aNewsList.size();
    }
}