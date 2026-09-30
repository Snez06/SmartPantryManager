package com.example.smartpantrymanager;

import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.ImageButton;import android.widget.TextView;import androidx.annotation.NonNull;import androidx.recyclerview.widget.RecyclerView;import java.util.ArrayList;

public class PantryAdapter extends RecyclerView.Adapter<PantryAdapter.VH>{
    public interface Listener{void onEdit(PantryItem item);void onDelete(PantryItem item);}
    private final ArrayList<PantryItem> items;private final Listener listener;
    public PantryAdapter(ArrayList<PantryItem> items,Listener listener){this.items=items;this.listener=listener;}
    @NonNull @Override public VH onCreateViewHolder(@NonNull ViewGroup p,int v){return new VH(LayoutInflater.from(p.getContext()).inflate(R.layout.item_pantry,p,false));}
    @Override public void onBindViewHolder(@NonNull VH h,int pos){PantryItem i=items.get(pos);h.name.setText(i.getName());h.qty.setText(format(i.getQuantity())+" "+i.getUnit());h.expiry.setText(i.getExpiryDate()==null||i.getExpiryDate().isEmpty()?"No expiry date":"Expires: "+i.getExpiryDate());h.itemView.setOnClickListener(v->listener.onEdit(i));h.delete.setOnClickListener(v->listener.onDelete(i));}
    private String format(double d){return d==(long)d?String.valueOf((long)d):String.valueOf(d);}
    @Override public int getItemCount(){return items.size();}
    static class VH extends RecyclerView.ViewHolder{TextView name,qty,expiry;ImageButton delete;VH(View v){super(v);name=v.findViewById(R.id.tvItemName);qty=v.findViewById(R.id.tvItemQty);expiry=v.findViewById(R.id.tvItemExpiry);delete=v.findViewById(R.id.btnDelete);}}
}
