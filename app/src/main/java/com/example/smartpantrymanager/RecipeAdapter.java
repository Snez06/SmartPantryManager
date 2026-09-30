package com.example.smartpantrymanager;

import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.TextView;import androidx.annotation.NonNull;import androidx.recyclerview.widget.RecyclerView;import java.util.ArrayList;
public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.VH>{
    public interface Listener{void onRecipeClick(Recipe r);}
    private final ArrayList<Recipe> recipes;private final Listener listener;public RecipeAdapter(ArrayList<Recipe> recipes,Listener listener){this.recipes=recipes;this.listener=listener;}
    @NonNull @Override public VH onCreateViewHolder(@NonNull ViewGroup p,int v){return new VH(LayoutInflater.from(p.getContext()).inflate(R.layout.item_recipe,p,false));}
    @Override public void onBindViewHolder(@NonNull VH h,int pos){Recipe r=recipes.get(pos);h.name.setText(r.getName());StringBuilder b=new StringBuilder();for(int x=0;x<r.getIngredients().size();x++){if(x>0)b.append(" • ");b.append(r.getIngredients().get(x).getName());}h.ingredients.setText(b.toString());h.itemView.setOnClickListener(v->listener.onRecipeClick(r));}
    @Override public int getItemCount(){return recipes.size();}
    static class VH extends RecyclerView.ViewHolder{TextView name,ingredients;VH(View v){super(v);name=v.findViewById(R.id.tvRecipeName);ingredients=v.findViewById(R.id.tvRecipeIngredients);}}
}
