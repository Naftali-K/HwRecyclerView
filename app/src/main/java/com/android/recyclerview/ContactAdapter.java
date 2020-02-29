package com.android.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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