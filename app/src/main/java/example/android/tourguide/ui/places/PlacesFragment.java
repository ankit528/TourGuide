package example.android.tourguide.ui.places;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import example.android.tourguide.R;
import example.android.tourguide.Word;
import example.android.tourguide.ListAdaptor;

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Word> arrayList = new ArrayList<Word>();
        arrayList.add(new Word(R.drawable.gateway_of_india, R.string.gateway_of_india,
                R.string.add_gateway_of_india, R.string.timing_gateway_of_india));
        arrayList.add(new Word(R.drawable.haji_ali_dargah, R.string.haji_ali_dargah,
                R.string.add_haji_ali_dargah, R.string.timing_haji_ali_dargah));
        arrayList.add(new Word(R.drawable.wax_museum, R.string.wax_museum,
                R.string.add_wax_museum,R.string.timing_wax_museum));
        arrayList.add(new Word(R.drawable.national_park, R.string.national_park,
                R.string.add_national_park, R.string.timing_national_park));

        ListAdaptor adaptor = new ListAdaptor(getActivity(),arrayList, R.color.list_bg_color);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adaptor);

        return rootView;
    }
}
