package com.example.reservasiapk;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MenuRestoAdapter extends RecyclerView.Adapter<MenuRestoAdapter.MenuViewHolder> {

    private List<DataPembelian> menuList;
    private Context context;
    private OnMenuClickListener listener;
    private int totalPrice = 0;

    public interface OnMenuClickListener {
        void onTotalPriceChanged(int totalPrice);
    }

    public MenuRestoAdapter(Context context, List<DataPembelian> menuList, OnMenuClickListener listener) {
        this.context = context;
        this.menuList = menuList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        DataPembelian menu = menuList.get(position);
        holder.menuTitle.setText(menu.getNama_menu());
        holder.menuDescription.setText("Deskripsi Menu"); // Anda bisa menambahkan deskripsi jika diperlukan
        holder.menuPrice.setText("Rp " + menu.getHarga());
        holder.menuImage.setImageResource(menu.getImage_menu());
        holder.quantity.setText(String.valueOf(menu.getQuantity()));

        holder.tambahButton.setOnClickListener(v -> {
            int quantity = menu.getQuantity();
            quantity++;
            menu.setQuantity(quantity);
            holder.quantity.setText(String.valueOf(quantity));
            totalPrice += menu.getHarga();
            listener.onTotalPriceChanged(totalPrice);
        });

        holder.kurangButton.setOnClickListener(v -> {
            int quantity = menu.getQuantity();
            if (quantity > 0) {
                quantity--;
                menu.setQuantity(quantity);
                holder.quantity.setText(String.valueOf(quantity));
                totalPrice -= menu.getHarga();
                listener.onTotalPriceChanged(totalPrice);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        TextView menuTitle, menuDescription, menuPrice, quantity;
        ImageView menuImage;
        Button tambahButton, kurangButton;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            menuTitle = itemView.findViewById(R.id.menuTitle);
            menuDescription = itemView.findViewById(R.id.menuDescription);
            menuPrice = itemView.findViewById(R.id.menuPrice);
            quantity = itemView.findViewById(R.id.quantity);
            menuImage = itemView.findViewById(R.id.menuImage);
            tambahButton = itemView.findViewById(R.id.tambahButton);
            kurangButton = itemView.findViewById(R.id.kurangButton);
        }
    }
}
