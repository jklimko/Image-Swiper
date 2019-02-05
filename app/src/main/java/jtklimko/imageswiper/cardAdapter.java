package jtklimko.imageswiper;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class cardAdapter extends ArrayAdapter<cards> {

    /*
    static class ViewHolder{
        ImageView pic;
    }
    */
    public cardAdapter(Context context, int rescourceId, List<cards> items){
        super(context, rescourceId, items);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        cards card_item = getItem(position);
        //ViewHolder holder = null;

        if(convertView == null) {
            //holder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
            //holder.pic = (ImageView) convertView.findViewById(R.id.image);
        }

        //TextView name = (TextView) convertView.findViewById(R.id.userName);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        //Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/imageswiper-2019.appspot.com/o/Screen%20Shot%202018-06-26%20at%2012.00.47%20AM.png?alt=media&token=0ca41973-388f-4dbd-98d8-aebbe168ebd1").into(holder.pic);
        //holder.pic.setImageResource(item.getPicture());

        //name.setText(card_item.getName());
        image.setImageResource(card_item.getmDrawable());

        return convertView;
    }
}
