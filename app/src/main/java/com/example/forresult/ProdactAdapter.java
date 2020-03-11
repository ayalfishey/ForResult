package com.example.forresult;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ProdactAdapter extends RecyclerView.Adapter<ProdactAdapter.ProductViewHolder> {

    private boolean checkBoxLayout;
    private ArrayList<String> products;

    public ProdactAdapter(boolean checkBoxLayout, ArrayList<String> products) {
        this.checkBoxLayout = checkBoxLayout;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_select_cell,parent,false);
        if(viewType == 0){
          view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list_cell,parent,false);
          return new ProductListHolder(view);
        }
        return new ProductCheckList(view);
    }

    @Override
    public int getItemViewType(int position) {
        if(checkBoxLayout)
            return 1;
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductCheckList productCheckHolder;
        ProductListHolder productListHolder;
        if(checkBoxLayout) {
            productCheckHolder = (ProductCheckList) holder;
            productCheckHolder.checkBox.setText(products.get(position));
        } else {
            productListHolder = (ProductListHolder) holder;
            productListHolder.tv.setText(products.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
    public abstract class ProductViewHolder extends RecyclerView.ViewHolder {
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
    public class ProductListHolder extends ProductViewHolder{
        TextView tv;
        public ProductListHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textView2);
        }
    }
    public class ProductCheckList extends ProductViewHolder{
        CheckBox checkBox;
        public ProductCheckList(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox);
        }
    }
}
