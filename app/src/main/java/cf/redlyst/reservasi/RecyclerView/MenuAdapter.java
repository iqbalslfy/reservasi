package cf.redlyst.reservasi.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cf.redlyst.reservasi.ClickListener.ItemClickListener;
import cf.redlyst.reservasi.Data.DataMenu;
import cf.redlyst.reservasi.R;

/**
 * Created by Ayo Maju on 28/01/2018.
 */

class MenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView txtJam, txtTersedia;
    private ItemClickListener itemClickListener;

    public MenuHolder(View itemView) {
        super(itemView);

        txtJam = itemView.findViewById(R.id.txtJam);
        txtTersedia = itemView.findViewById(R.id.txtAvail);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}

public class MenuAdapter extends RecyclerView.Adapter<MenuHolder> {
    private List<DataMenu> menuList = new ArrayList<>();
    private Context context;

    public MenuAdapter(List<DataMenu> menuList, Context context) {
        this.menuList = menuList;
        this.context = context;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_menu, parent, false);
        return new MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuHolder holder, int position) {
        holder.txtJam.setText(menuList.get(position).getJam());
        holder.txtTersedia.setText(menuList.get(position).getTersedia());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int pos, boolean isLongClick) {
                Toast.makeText(context, "Clicked : " + "\n" + "OKE " + menuList.get(pos).getJam(), Toast.LENGTH_SHORT).show();

                if (pos == 0) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }

                if (pos == 1) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 2) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 3) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 4) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 5) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 6) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 7) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 8) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }

                if (pos == 9) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 10) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 11) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 12) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 13) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 14) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
                if (pos == 15) {
                    holder.txtTersedia.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
                    holder.txtTersedia.setText("UNAVAILABLE");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
