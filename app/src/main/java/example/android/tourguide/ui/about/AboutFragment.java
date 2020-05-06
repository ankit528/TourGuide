package example.android.tourguide.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import example.android.tourguide.R;

public class AboutFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.about_fragment, container, false);

        TextView textViewAbout = rootView.findViewById(R.id.text_about);
        TextView textViewAboutExtra = rootView.findViewById(R.id.text_about_extra);
        ImageView imageViewAbout = rootView.findViewById(R.id.about_view_cst_station);

        textViewAbout.setText(R.string.about_mumbai);
        textViewAboutExtra.setText(R.string.about_mumbai_extra);
        imageViewAbout.setImageResource(R.drawable.bg_mumbai_cst_station_night);

        return rootView;
    }
}
