package com.example.reservasiapk;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuResto extends AppCompatActivity implements MenuRestoAdapter.OnMenuClickListener {

    private RecyclerView recyclerViewMenu;
    private TextView totalHargaTextView;
    private List<DataPembelian> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_resto);

        recyclerViewMenu = findViewById(R.id.recyclerViewMenu);
        totalHargaTextView = findViewById(R.id.totalHargaTextView);

        menuList = new ArrayList<>();
        // Add sample menu items
        menuList.add(new DataPembelian(R.drawable.cornsoup, 20000, "Corn Soup"));
        menuList.add(new DataPembelian(R.drawable.estehmanis, 25000, "Tomato Soup"));

        MenuRestoAdapter adapter = new MenuRestoAdapter(this, menuList, this);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewMenu.setAdapter(adapter);
    }

    @Override
    public void onTotalPriceChanged(int totalPrice) {
        totalHargaTextView.setText("Rp " + totalPrice);
    }
}
