package pnj.uts.ti.zakirio_hugoraazaq_wasis;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList nim, nama;

    CustomAdapter(Context context, ArrayList nim, ArrayList nama){
        this.context = context;
        this.nim = nim;
        this.nama = nama;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nimLbl, namaLbl;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nimLbl = itemView.findViewById(R.id.nimLbl);
            namaLbl = itemView.findViewById(R.id.namaLbl);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.alumni_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nimLbl.setText(String.format(String.valueOf(nim.get(position))));
        holder.namaLbl.setText(String.format(String.valueOf(nama.get(position))));
    }

    @Override
    public int getItemCount() {
        return nim.size();
    }
}
