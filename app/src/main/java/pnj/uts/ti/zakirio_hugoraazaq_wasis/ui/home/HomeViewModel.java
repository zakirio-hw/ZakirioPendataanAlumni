package pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Perkenalkan saya Zakirio Hugoraazaq Wasis.\n\nIni merupakan projek Pendataan Alumni saya untuk tugas UTS.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}