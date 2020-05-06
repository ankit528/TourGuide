package example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import example.android.tourguide.R;
import example.android.tourguide.Word;


public class ListAdaptor extends ArrayAdapter<Word> {

    private int bgColorId;

    public ListAdaptor(Context context, ArrayList<Word> arrayList, int bgColor) {
        super(context, 0, arrayList);
        bgColorId = bgColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Word currentWord =getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImage());

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentWord.getName());

        TextView addTextView = listItemView.findViewById(R.id.address);
        addTextView.setText(currentWord.getAddress());

        TextView timingTextView = listItemView.findViewById(R.id.timing);
        timingTextView.setText(currentWord.getTiming());

        View bgContainer = listItemView.findViewById(R.id.list_bg_container);
        int color = ContextCompat.getColor(getContext(), bgColorId);
        bgContainer.setBackgroundColor(color);

        return listItemView;
    }
}
