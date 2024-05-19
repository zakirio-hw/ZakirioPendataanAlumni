package pnj.uts.ti.zakirio_hugoraazaq_wasis.ui.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import pnj.uts.ti.zakirio_hugoraazaq_wasis.databinding.FragmentProfilBinding;

public class ProfilFragment extends Fragment {

private FragmentProfilBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        ProfilViewModel profilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);

    binding = FragmentProfilBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        profilViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}