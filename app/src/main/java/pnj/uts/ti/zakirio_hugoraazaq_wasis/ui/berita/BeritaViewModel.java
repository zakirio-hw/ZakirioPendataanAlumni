package pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.berita;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BeritaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BeritaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is berita fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}