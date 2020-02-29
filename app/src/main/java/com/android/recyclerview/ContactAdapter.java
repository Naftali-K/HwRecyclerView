package com.android.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    String option;

    public ContactAdapter(String option) {
        this.option = option;
    }

    //here we connect view (templet), that to be replay
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(option.equals("short")){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.short_line, parent, false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.long_line, parent, false);
        }

        PersonViewHolder holder = new PersonViewHolder(view);
        return holder;
    }

    //enter information to views
    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.contactName.setText("Name " + position);
        holder.contactFamilyName.setText("Family Name " + position);
        holder.contactNumberPhone.setText("050" + position);
    }

    //how many replays to be in the list
    @Override
    public int getItemCount() {
        return 10;
    }
}

class PersonViewHolder extends RecyclerView.ViewHolder{

    ImageView contactImg;
    ConstraintLayout viewLayOut;
    TextView contactName, contactFamilyName, contactNumberPhone;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);

        this.viewLayOut = itemView.findViewById(R.id.viewLayOut);
        this.contactImg = itemView.findViewById(R.id.contactImg);
        this.contactName = itemView.findViewById(R.id.contactName);
        this.contactFamilyName = itemView.findViewById(R.id.contactFamilyName);
        this.contactNumberPhone = itemView.findViewById(R.id.contactNumberPhone);

    }
}