package cf.redlyst.reservasi.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ayo Maju on 28/01/2018.
 */

class MenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{
    public TextView txtJam;

    public MenuHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}

public class MenuAdapter {
}
