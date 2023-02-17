package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    private List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.MyViewHolder holder, int position) {
        Contact i = contactList.get(position);
        holder.vhName.setText(i.getC_fullName());
        holder.vhPhone.setText(i.getC_phoneNumber());
        holder.vhPhoto.setImageResource(i.getC_Image());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView vhPhoto;
        private TextView vhName, vhPhone;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            vhPhone = itemView.findViewById(R.id.phone_no);
            vhName = itemView.findViewById(R.id.full_name);
            vhPhoto = itemView.findViewById(R.id.photo);
        }
    }
}
