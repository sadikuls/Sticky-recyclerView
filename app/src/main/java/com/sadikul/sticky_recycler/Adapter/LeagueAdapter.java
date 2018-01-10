package com.sadikul.sticky_recycler.Adapter;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sadikul.sticky_recycler.Model.Leagues;
import com.sadikul.sticky_recycler.R;

import java.util.ArrayList;

/**
 * Created by paetztm on 2/6/2017.
 */
public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.ViewHolder> {

    private final ArrayList<Leagues> leagues;
    private final LayoutInflater layoutInflater;
    private final int            rowLayout;

    public LeagueAdapter(LayoutInflater layoutInflater, ArrayList<Leagues> Leagues, @LayoutRes int rowLayout) {
        this.leagues = Leagues;
        this.layoutInflater = layoutInflater;
        this.rowLayout = rowLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(rowLayout,
                                        parent,
                                        false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Leagues leagues = this.leagues.get(position);
        holder.fullName.setText(leagues.getCountry());
    }

    @Override
    public int getItemCount() {
        return leagues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView fullName;

        public ViewHolder(View view) {
            super(view);
            fullName = (TextView) view.findViewById(R.id.full_name_tv);
        }
    }
}
