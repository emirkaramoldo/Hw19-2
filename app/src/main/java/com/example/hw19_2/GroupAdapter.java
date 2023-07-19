package com.example.hw19_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroupAdapter extends RecyclerView.Adapter <GroupViewHolder> {

    private ArrayList<String> groupList;

    public GroupAdapter(ArrayList<String> groupList){
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroupViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {
        holder.blind(groupList.get(position));
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
}
