package example.android.tourguide.ui.phrases;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhrasesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PhrasesViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is Phrases fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
