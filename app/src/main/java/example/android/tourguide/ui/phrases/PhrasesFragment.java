package example.android.tourguide.ui.phrases;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import example.android.tourguide.R;

public class PhrasesFragment extends Fragment {

    private PhrasesViewModel phrasesViewModel;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        phrasesViewModel =
                ViewModelProviders.of(this).get(PhrasesViewModel.class);
        View root = inflater.inflate(R.layout.phrases_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_phrase);
        phrasesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
