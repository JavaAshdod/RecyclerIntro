package tomerbu.edu.recyclerintro;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyItemViewHolder>{

    ArrayList<String> data = new ArrayList<>();

    public ListAdapter(LayoutInflater inflater) {
        for (int i = 0; i < 100; i++) {
            data.add("Hello " + i);
        }
        this.inflater = inflater;
    }

    LayoutInflater inflater;
    @Override
    public MyItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_item, parent, false);
        return new MyItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyItemViewHolder holder, int position) {
        holder.tvTitle.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    //FIND VIEW BY ID :)
    class MyItemViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvDescription;
        ImageView imageView;


        public MyItemViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvDescription = (TextView) v.findViewById(R.id.tvDescription);
            imageView = (ImageView) v.findViewById(R.id.imageView);
        }
    }
}
