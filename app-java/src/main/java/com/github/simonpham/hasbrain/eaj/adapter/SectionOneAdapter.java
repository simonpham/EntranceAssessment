package com.github.simonpham.hasbrain.eaj.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.simonpham.hasbrain.eaj.R;
import com.github.simonpham.hasbrain.eaj.browser.BrowserActivity;
import com.github.simonpham.hasbrain.eaj.model.Article;

import java.util.List;

import static com.github.simonpham.hasbrain.eaj.util.Const.NO_IMAGE;
import static com.github.simonpham.hasbrain.eaj.util.TimeAgo.getDisplayTime;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */

public class SectionOneAdapter extends RecyclerView.Adapter<SectionOneAdapter.ViewHolder>{

    private Context context;
    private List<Article> listArticle;

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;

        TextView tvTitle;
        TextView tvTime;

        ImageView btnFacebook;
        ImageView btnTwitter;
        ImageView btnGithub;
        ImageView btnSave;

        ViewHolder(View v) {
            super(v);

            ivImage = v.findViewById(R.id.image);

            tvTitle = v.findViewById(R.id.tvTitle);
            tvTime = v.findViewById(R.id.tvTime);

            btnFacebook = v.findViewById(R.id.btnFacebook);
            btnTwitter = v.findViewById(R.id.btnTwitter);
            btnGithub = v.findViewById(R.id.btnGithub);
            btnSave = v.findViewById(R.id.btnSave);
        }
    }

    public SectionOneAdapter(Context context, List<Article> listArticle) {
        this.context = context;
        this.listArticle = listArticle;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_section_one, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.tvTitle.setText(listArticle.get(position).getTitle());
        holder.tvTime.setText(getDisplayTime(listArticle.get(position).getTimestamp()));

        if (listArticle.get(position).getIdImage() == NO_IMAGE) {
            holder.ivImage.setVisibility(View.INVISIBLE);
        } else {
            holder.ivImage.setImageDrawable(context.getResources().getDrawable(listArticle.get(position).getIdImage()));
        }

        final Intent intent = new Intent(context, BrowserActivity.class);
        intent.putExtra("MainActivity.ARTICLE_URL", listArticle.get(position).getArticleUrl());

        holder.ivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(intent);
            }
        });

        holder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listArticle.size();
    }
}
