package com.fjcd.android.searchappartment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fjcd.android.searchappartment.R;
import com.fjcd.android.searchappartment.model.Appartment;

import java.util.List;

/**
 * Created by Fernando on 12/13/2017.
 */

public class AppartmentAdapter extends RecyclerView.Adapter<AppartmentAdapter.AppartmentViewHolder> {

    private List<Appartment> appartments;

    public AppartmentAdapter(List<Appartment> appartments){
        this.appartments = appartments;
    }

    @Override
    public AppartmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_appartment, parent, false);
        return new AppartmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppartmentViewHolder holder, int position) {
        holder.bind(appartments.get(position));
    }

    @Override
    public int getItemCount() {
        return appartments.size();
    }

    class AppartmentViewHolder extends RecyclerView.ViewHolder {

        private TextView tdDescription;

        public AppartmentViewHolder(View itemView) {
            super(itemView);
            tdDescription = (TextView) itemView.findViewById(R.id.tvDescription);
        }

        private void bind(Appartment appartment){
            tdDescription.setText(appartment.getDescription());
        }
    }
}
